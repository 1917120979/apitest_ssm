package com.ybf.apitest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybf.apitest.mapper.ProjectMapper;
import com.ybf.apitest.pojo.Project;
import com.ybf.apitest.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	ProjectMapper projectMapper;
	
	public List<Project> listProject(int uid) {
		return projectMapper.queryByUserId(uid);
	}

}
