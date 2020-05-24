package com.ybf.apitest.util;

public enum StatusCode{
	
	SUCCESS(0,"成功"),
	FAIL(500,"失败"),
	USER_EXIST(402,"用户已存在"),
	USER_PWD_ERROR(401,"用户名或密码错误");
		
	private Integer code;
	private String message;
	
	StatusCode(Integer code, String message){
		this.code = code;
		this.message = message;
	}
	public Integer getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}

	
}
