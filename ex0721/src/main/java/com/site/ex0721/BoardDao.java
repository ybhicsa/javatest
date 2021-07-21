package com.site.ex0721;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDao {

	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	BoardVo bVo = null;
	
	String btitle,bcontent,bname,bupload;
	int bid,bgroup,bstep,bindent,bhit;
	Timestamp bdate;
	
//------------------------------------------------------------------------
//------------------------------------------------------------------------
//------------------------------------------------------------------------
	//컨탠츠뷰
	public BoardVo ContentSelect(String bid) {
		//BoardVo bVo = new BoardVo();
		BoardVo bVo = new BoardVo();
		
		try {
			
			conn = getConnection();
			String sql = " select * from board where bid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bid);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				btitle = rs.getString("BTITLE");
				bcontent = rs.getString("BCONTENT");
				bname = rs.getString("BNAME");
				bhit = rs.getInt("BHIT");
				
				bVo = new BoardVo(btitle,bcontent,bname, bhit);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return bVo;
	}
	
//------------------------------------------------------------------------
	//board 전체 게시물 가져오기
	public ArrayList<BoardVo> boardAllSelect(){
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		
		try {
			
			conn = getConnection();
			String sql = " select * from board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				bid = rs.getInt("BID");
				btitle = rs.getString("BTITLE");
				bcontent = rs.getString("BCONTENT");
				bname = rs.getString("BNAME");
				bgroup = rs.getInt("BGROUP");
				bstep = rs.getInt("BTSEP");
				bindent = rs.getInt("BINDENT");
				bdate = rs.getTimestamp("BDATE");
				bupload = rs.getString("BUPLOAD");
				bhit = rs.getInt("BHIT");
				
				bVo = new BoardVo(bid,btitle,bcontent,bname,bgroup,bstep,bindent,bdate,bupload,bhit);
				list.add(bVo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return list;
	}//boardAllSelect
	
	
//------------------------------------------------------------------------

	//context접근하여 DataSource Connection객체 1개를 가지고옴
	public Connection getConnection() throws Exception {
		Context context = new InitialContext();
		
		ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
		
		return ds.getConnection();
	}
	
//------------------------------------------------------------------------
	
	
}//class
