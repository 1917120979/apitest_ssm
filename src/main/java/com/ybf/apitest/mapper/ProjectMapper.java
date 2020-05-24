package com.ybf.apitest.mapper;

import java.util.List;

import com.ybf.apitest.pojo.Project;

public interface ProjectMapper {
	List<Project> queryByUserId(int uid);
	
}
