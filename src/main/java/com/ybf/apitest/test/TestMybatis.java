package com.ybf.apitest.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ybf.apitest.mapper.ProjectMapper;
import com.ybf.apitest.mapper.UserMapper;
import com.ybf.apitest.pojo.Project;
import com.ybf.apitest.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestMybatis {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	ProjectMapper projectMapper;
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void testProjectList() {
		List<Project> ps = projectMapper.queryByUserId(1);
		for (Project project : ps) {
			logger.info(project.toString());
		}
	}
	
	@Test
	public void testUser(){
		User user = userMapper.getByName("admin","666666");
		if (user == null) {
			System.out.println("null");
		}else {
			logger.info(user.toString());
		}
		
	}
}
