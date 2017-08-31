package com.teamproject.airplane.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teamproject.airplane.util.Constant;

@Controller(value="/member")
public class MemberController {
//	public JdbcTemplate template;
//
//	@Autowired
//	public void setTemplate(JdbcTemplate template) {
//		this.template = template;
//		Constant.template = this.template;
//	}
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String openJoinPage(){
		System.out.println("openJoinPage()");
		
		return "member/memberJoinForm";
	}
	
}
