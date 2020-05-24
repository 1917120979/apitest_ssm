package com.ybf.apitest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybf.apitest.mapper.UserMapper;
import com.ybf.apitest.pojo.User;
import com.ybf.apitest.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;

	@Override
	public User getByName(String username, String password) {
		return userMapper.getByName(username ,password);
	}
	
}
