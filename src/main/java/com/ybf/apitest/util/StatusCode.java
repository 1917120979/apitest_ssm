package com.ybf.apitest.util;

public enum StatusCode{
	
	SUCCESS(0,"成功"),
	FAIL(500,"失败"),
	USER_NOT_EXIST(400,"用户不存在"),
	PWD_ERROR(401,"秘密错误");
		
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
