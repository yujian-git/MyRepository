package com.woniu.pojo;
// Generated 2019-12-17 20:59:07 by Hibernate Tools 5.2.12.Final

/**
 * Users generated by hbm2java
 */
public class Users implements java.io.Serializable {

	private Integer userId;
	//private Worklevels worklevels;
	private String userName;
	private String userPwd;
	private String userRole;
	private String userStatus;
	private String userPhoto;
	private Integer levelId=1;
	
	public Users() {
	}

//	public Users(Worklevels worklevels) {
//		this.worklevels = worklevels;
//	}

	public Users( String userName, String userPwd, String userRole, String userStatus,
			String userPhoto) {
		this.userName = userName;
		this.userPwd = userPwd;
		this.userRole = userRole;
		this.userStatus = userStatus;
		this.userPhoto = userPhoto;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

//	public Worklevels getWorklevels() {
//		return this.worklevels;
//	}
//
//	public void setWorklevels(Worklevels worklevels) {
//		this.worklevels = worklevels;
//	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserPhoto() {
		return this.userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public Integer getLevelId() {
		return levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	
}
