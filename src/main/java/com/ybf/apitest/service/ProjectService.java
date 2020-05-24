package com.ybf.apitest.service;

import java.util.List;

import com.ybf.apitest.pojo.Project;

public interface ProjectService {
	List<Project> listProject(int uid);
}
