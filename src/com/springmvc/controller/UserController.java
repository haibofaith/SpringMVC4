package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value="/list.do")
	public String list(){
		System.out.println("---查询用户信息----");
		return "userlist";
	}
	
	@RequestMapping(value="/add.do")
	public String add(){
		System.out.println("---增加用户----");
		return "useradd";
	}
	
	
	@RequestMapping(value="/update.do")
	public String update(){
		System.out.println("---修改用户----");
		return "userupdate";
	}
	
	
}
