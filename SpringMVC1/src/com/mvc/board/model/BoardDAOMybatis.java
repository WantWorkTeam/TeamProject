package com.mvc.board.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.config.MybatisConfig;

public class BoardDAOMybatis {
	MybatisConfig mybatisConfig=MybatisConfig.getInstance();
	
	public List selectAll(){
		SqlSession session=mybatisConfig.getSession();
		return session.selectList("Board.selectAll");
		
	}
	
	
	public void insert(Board board){
		SqlSession session = mybatisConfig.getSession();
		
		session.insert("Board.insert", board);
		session.commit();
	}
	
	public Board select(int board_id){
		SqlSession session = mybatisConfig.getSession();
		Board board=session.selectOne("Board.select", board_id);
		return board;
	}
	public void update(Board board){
		SqlSession session = mybatisConfig.getSession();
		session.update("Board.update", board);		
		session.commit();
	}
	
	public void delete(int board_id){
		SqlSession session = mybatisConfig.getSession();
		session.delete("Board.delete", board_id);		
		session.commit();
	}
	
}

















