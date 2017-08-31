package com.teamproject.airplane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MemberController {
//	public JdbcTemplate template;
//
//	@Autowired
//	public void setTemplate(JdbcTemplate template) {
//		this.template = template;
//		Constant.template = this.template;
//	}
	@RequestMapping(value="/member/join", method=RequestMethod.GET)
	public String openJoinPage(){
		System.out.println("openJoinPage()");
		
		return "member/memberJoinForm";
	}
	
}
