package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bean.UserBean;
import dao.UserDao;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*
	 * ログインチェック(non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id 	= request.getParameter("ID");
		String pass = request.getParameter("PASS");
		String url	= "login.jsp";
		if( ( null == id ) || ( null == pass) ){					//idとpassが入力されていなかったら
			url 	= "failure.jsp";
		}else{														//idとpassが入力されていたら
			UserDao 	dao 		= new UserDao();
			UserBean 	userBean	= dao.getUser(id, pass);

			if(userBean == null){	//DB結果がNULLの場合の処理
				url = "failure.jsp";
			}else{					//DB結果成功時
				HttpSession session		= request.getSession();
				session.setAttribute("bean", userBean);
				url 					= "menu.jsp";				
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
