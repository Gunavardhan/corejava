package com.practice.serialization;

import java.io.Serializable;

public class UserSerAndDeser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2278001819252683806L;
	
	private Integer userId;
	private String userName;
	private String email;
	private String mobile;
	private transient String upwd;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	
	public void userInfo(){
		System.out.println("Username :" + userName +" - " + " Mobile : " + mobile);
	}

}
