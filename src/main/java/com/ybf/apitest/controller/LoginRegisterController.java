package com.ybf.apitest.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.HtmlUtils;

import com.ybf.apitest.pojo.User;
import com.ybf.apitest.service.UserService;
import com.ybf.apitest.util.ResultJson;
import com.ybf.apitest.util.StatusCode;

@Controller
@RequestMapping("")
public class LoginRegisterController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	UserService userService;
	
	@RequestMapping("index")
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("loginPage")
	public String loginPage(Model model) {
		return "login";
	}
	
	@RequestMapping("registerPage")
	public String registerPage(Model model) {
		return "register";
	}
	
	@RequestMapping("userLogin")
	public String login(@RequestParam("username")String username,@RequestParam("password")String password,
			Model model,HttpSession session) {
		username = HtmlUtils.htmlEscape(username);
		logger.info("登录的用户名是："+username);
		User user = userService.getByName(username,password);
		if (null == user) {
			ResultJson json = new ResultJson(StatusCode.USER_PWD_ERROR);
			logger.info("返回数据是："+json.toString());
			model.addAttribute("data", json);
			return "login";
		}
		session.setAttribute("user", user);
		return "redirect:index";	
	}
}
