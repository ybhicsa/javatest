package com.site.ex0728.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.site.ex0728.vo.MemberVo;

public class MemberDao {

	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	String id,pw,name,nickname,gender,tel,address1,address2,hobby;
	
	//================================================================================
	//================================================================================
	//================================================================================
	// 아이디와 비밀번호를 가지고오는 메소드 doLogin체크 -> 있으면 1개가 넘어온다.
	public MemberVo mDoLoginSelect(String id, String pw) {
		MemberVo memberVo = new MemberVo();
		try {
			conn = getConnection();
			String sql = "select * from member where id = ? and pw = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				nickname = rs.getString("nickname");
				gender = rs.getString("gender");
				tel = rs.getString("tel");
				address1 = rs.getString("address1");
				address2 = rs.getString("address2");
				hobby = rs.getString("hobby");
				
				memberVo = new MemberVo(id,pw,name,nickname,gender,tel,address1,address2,hobby);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)	rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		//System.out.println(id+","+pw);
		return memberVo;
	}
	//================================================================================
	public Connection getConnection() throws Exception {
		Context context = new InitialContext();
		ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		return ds.getConnection();
	}
	//================================================================================
	
	
}
