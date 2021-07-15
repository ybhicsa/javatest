package com.site.ex0715_03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MDao {

	public MDao() {}

	MDto mDto = new MDto();
	
	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Connection getConnection() throws Exception{
		
		Context context = new InitialContext(); 
		ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		
		
		return ds.getConnection();
	}
	
	
	//회원가입
	public int memberInsert(MDto mDto) {
			
		int resultNum = 0;
		
		try {
			
			conn = getConnection();
			
			String sql = " insert into member2 values(?,?,?,?,?,?,?,?,?) ";
			  
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mDto.getId());
			pstmt.setString(2, mDto.getPw());
			pstmt.setString(3, mDto.getName());
			pstmt.setString(4, mDto.getNickName());
			pstmt.setString(5, mDto.getGender());
			pstmt.setString(6, mDto.getTel());
			pstmt.setString(7, mDto.getAddress1());
			pstmt.setString(8, mDto.getAddress2());
			pstmt.setString(9, mDto.getHobby());
			
			resultNum = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close(); 
				if(pstmt != null) pstmt.close(); 
				if(conn != null) conn.close(); 
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return resultNum;
	}
	
	// 로그인
	public MDto loginSc(String scId, String scPw) {
		MDto mDto = new MDto();
		
		try {
			
			conn = getConnection();
			
			String sql = " select * from member2 where id=? and pw=? ";
			  
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, scId);
			pstmt.setString(2, scPw);
			
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				mDto.setId(rs.getString("id"));
				mDto.setPw(rs.getString("pw"));
	        	mDto.setName(rs.getString("name"));
	        	mDto.setNickName(rs.getString("nickName"));
	        	mDto.setGender(rs.getString("gender"));
	        	mDto.setTel(rs.getString("tel"));
	        	mDto.setAddress1(rs.getString("address1"));
	        	mDto.setAddress2(rs.getString("address2"));
	        	mDto.setHobby(rs.getString("hobby"));
				
			} else {
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close(); 
				if(pstmt != null) pstmt.close(); 
				if(conn != null) conn.close(); 
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return mDto;
	}
	
	public String modifyck(String id) {
		String ckId="";

		
		
		
		
		return ckId;
	}
	
	
	
	//정보변경
	/*
	 * public int modifyupdate(String id, String pw, String name, String nickName,
	 * String gender, String tel, String address1, String address2, String hobby) {
	 */
	public int modifyupdate(String id) {
		int updatemod = 0;
		
		try {
		
		conn = getConnection();
		
		String sql = " update member2 set pw=?, NAME=?, NICKNAME=?, GENDER=?, TEL=?, ADDRESS1=?, ADDRESS2=?, hobby=? where id=? ";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, mDto.getPw());
		pstmt.setString(2, mDto.getName());
		pstmt.setString(3, mDto.getNickName());
		pstmt.setString(4, mDto.getGender());
		pstmt.setString(5, mDto.getTel());
		pstmt.setString(6, mDto.getAddress1());
		pstmt.setString(7, mDto.getAddress2());
		pstmt.setString(8, mDto.getHobby());
		pstmt.setString(9, id);
		
		updatemod = pstmt.executeUpdate();
		
		if(updatemod==1) {
			System.out.println("데이터 저장 성공");
			
		}else {
			System.out.println("데이터 저장 실패");
			
		}
		
		
        }catch (Exception e) {
        	e.printStackTrace();
        }finally {
        	try {
        		if(rs != null) rs.close();
        		if(pstmt != null) pstmt.close();
        		if(conn != null) conn.close();
        	}catch (Exception e2) {
        		e2.printStackTrace();
        	}
        	
        }
		
		
		return updatemod;
	}
	
	
	
}//class
