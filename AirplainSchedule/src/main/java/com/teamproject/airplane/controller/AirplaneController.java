package com.teamproject.airplane.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AirplaneController {
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String login() {
		return "login/loginForm";
	}
}
