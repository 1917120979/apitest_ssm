package com.ybf.apitest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ybf.apitest.pojo.Project;
import com.ybf.apitest.service.ProjectService;

@Controller
@RequestMapping("")
public class ProjectController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ProjectService projectService;
	
	@RequestMapping("list/project")
	public String list(Model model) {
		List<Project> ps = projectService.listProject(1);
		model.addAttribute("ps", ps);
		return "pages/listProject";
	}
}
