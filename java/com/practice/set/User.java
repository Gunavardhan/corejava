package com.practice.set;

public class User {
	private Integer uId;
	private String userName;
	private String phNo;
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
	public User(Integer uId, String userName, String phNo){
		this.uId = uId;
		this.userName = userName;
		this.phNo = phNo;
	}
	
	@Override
	public int hashCode() {
		int result = 0;
		result = uId.hashCode() * userName.hashCode() * phNo.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User){
			User user = (User) obj;
			if(this.uId.equals(user.uId) && this.userName.equals(user.userName) && this.phNo.equals(user.phNo)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	@Override
	public String toString() {
		return uId + " " +userName + " "  +phNo; 
	}
}
