package com.mvc.board.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOJdbc {
	
	public List selectAll(){
		
		Connection con=null; 
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Board> list = new ArrayList<Board>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String url="jdbc:oracle:thin:@localhost:1521:oracle";
			String id="system";
			String pwd="oracle";
			
			con=DriverManager.getConnection(url, id, pwd); 
			if(con !=null){ 
				String sql="select * from board order by board_id desc";
				pstmt=con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()){
					Board board = new Board();
					
					board.setBoard_id(rs.getInt("board_id")); 
					board.setTitle(rs.getString("title")); 
					board.setWriter(rs.getString("writer"));
					board.setContent(rs.getString("content"));
					board.setRegdate(rs.getString("regdate"));
					board.setHit(rs.getInt("hit"));
					
					list.add(board);
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}		
		return list;
	}
	
	
	
}




