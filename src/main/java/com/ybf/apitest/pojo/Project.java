package com.ybf.apitest.pojo;

public class Project {
	private int id;
	private String projectName;
	private int projectEnv;
	private String userName;
	private String createDate;
	private int projectSign;
	private int projectEncrypt;
	private String projectComment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getProjectEnv() {
		return projectEnv;
	}
	public void setProjectEnv(int projectEnv) {
		this.projectEnv = projectEnv;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getProjectSign() {
		return projectSign;
	}
	public void setProjectSign(int projectSign) {
		this.projectSign = projectSign;
	}
	public int getProjectEncrypt() {
		return projectEncrypt;
	}
	public void setProjectEncrypt(int projectEncrypt) {
		this.projectEncrypt = projectEncrypt;
	}
	public String getProjectComment() {
		return projectComment;
	}
	public void setProjectComment(String projectComment) {
		this.projectComment = projectComment;
	}
	
	@Override
	public String toString() {
		return "Project[id="+id+",name="+projectName+",createDate="+createDate+"userName="+userName+"]";
	}

}
