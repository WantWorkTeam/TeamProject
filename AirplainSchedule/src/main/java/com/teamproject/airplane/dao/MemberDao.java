package com.teamproject.airplane.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.teamproject.airplane.util.Constant;

public class MemberDao {
	
	DataSource dataSource;
	
	JdbcTemplate template = null;
	
	public MemberDao(){
		template = Constant.template;
	}
	
	
}
