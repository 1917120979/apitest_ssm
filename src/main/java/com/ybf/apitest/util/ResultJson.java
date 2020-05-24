package com.ybf.apitest.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResultJson{
	private int  code;
	private String message;
	private Object data;
	private long time = new Date().getTime();
		
	public ResultJson(StatusCode statusCode){
		this.code = statusCode.getCode();
		this.message = statusCode.getMessage();
	}
	
	public ResultJson(StatusCode statusCode,Object data){
		this.code = statusCode.getCode();
		this.message = statusCode.getMessage();
		this.data = data;
	}
		
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	@Override
	public String toString() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
			return null;
		}	
	}

	public static void main(String[] args) {
		ResultJson resultJson = new ResultJson(StatusCode.FAIL);
		ResultJson resultJson2 = new ResultJson(StatusCode.SUCCESS);
		
		List<ResultJson> list = new ArrayList<ResultJson>();
		list.add(resultJson);
		list.add(resultJson2);
		ResultJson resultJson3 = new ResultJson(StatusCode.SUCCESS,list);
		System.out.println(resultJson3.toString());
	}


}
