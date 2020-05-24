package com.ybf.apitest.service;

import com.ybf.apitest.pojo.User;

public interface UserService {
	User getByName(String username,String password);
}
