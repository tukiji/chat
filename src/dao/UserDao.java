package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.UserBean;
public class UserDao {
	public UserBean getUser(String user_id, String pass){
		ConnectionManager cm = ConnectionManager.getInstance();
		UserBean bean = new UserBean();
		try(Connection cn = cm.getConnection();
				Statement stmt = cn.createStatement()){
			ResultSet res = stmt.executeQuery("SELECT * FROM user_master WHERE user_id = '" + user_id +  "' && pass = '" + pass + "'");
			
			
			if(res == null){
				bean = null;
				return bean;
			}
			while(res.next()){
				bean.setUserId(res.getString("user_id"));
				bean.setUserName(res.getString("user_name"));
				bean.setPass(res.getString("pass"));
				bean.setCompanyId(res.getInt("company_id"));
				bean.setUserImg(res.getString("user_img"));
				
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return bean;
	}
}
