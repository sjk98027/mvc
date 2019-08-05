package model;

public class User {
	private String userName;
	private String userPw;
	public User() {
		
	}
	public User(String userName, String userPw) {
		this.userName = userName;
		this.userPw = userPw;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
}
