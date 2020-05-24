package com.ybf.apitest.mapper;

import org.apache.ibatis.annotations.Param;

import com.ybf.apitest.pojo.User;

public interface UserMapper {
	User getByName(@Param("username")String username, @Param("password")String password);
}
