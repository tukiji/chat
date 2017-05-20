package bean;

public class UserBean {
	private String user_id;
	private String user_name;
	private String pass;
	private int company_id;
	private String user_img;
	
	public void setUserId(String user_id){
		this.user_id = user_id;
	}
	
	public String getUserID(){
		return user_id;
	}
	
	public void setUserName(String user_name){
		this.user_name = user_name;
	}
	
	public String getUserName(){
		return user_name;
	}
	
	public void setPass(String pass){
		this.pass = pass;
	}
	
	public String getPass(){
		return pass;
	}
	
	public void setCompanyId(int company_id){
		this.company_id = company_id;
	}
	
	public int getCompanyId(){
		return company_id;
	}
	
	public void setUserImg(String user_img){
		this.user_img = user_img;
	}
	
	public String getUserImg(){
		return user_img;
	}
}
