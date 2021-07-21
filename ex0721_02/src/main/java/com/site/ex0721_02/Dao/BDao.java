package com.site.ex0721_02.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.site.ex0721_02.Vo.BVo;

public class BDao {

	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	BVo bVo = null;
	
	String btitle,bcontent,bname,bupload;
	int bid,bgroup,bstep,bindent,bhit;
	Timestamp bdate;
	
	//------------------------------------------------------------------------
	public int BInsertWrite(String btitle,String bcontent,String bname,String bupload) {
		int result = 0;
		
		try {
			conn = getConnection();
			String sql = "insert into board values(BOARD_SEQ.nextval,?,?,?,BOARD_SEQ.currval,'1','1',sysdate,?,'1')";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, btitle);
			pstmt.setString(2, bcontent);
			pstmt.setString(3, bname);
			pstmt.setString(4, bupload);
		
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return result;
	}
	
	//------------------------------------------------------------------------
	public BVo BSelectView(int bid) {
		 
		
		try {
			conn = getConnection();
			String sql = "select * from board where bid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				bid = rs.getInt("bid");
				btitle = rs.getString("BTITLE");
				bcontent = rs.getString("BCONTENT");
				bname = rs.getString("BNAME");
				bgroup = rs.getInt("BGROUP");
				bstep = rs.getInt("BTSEP");
				bindent = rs.getInt("BINDENT");
				bdate = rs.getTimestamp("BDATE");
				bupload = rs.getString("BUPLOAD");
				bhit = rs.getInt("BHIT");
				
				bVo = new BVo(bid,btitle,bcontent,bname,bgroup,bstep,bindent,bdate,bupload,bhit);				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		return bVo;
	}
	
	//------------------------------------------------------------------------
	
	public ArrayList<BVo> BAllList(){
		ArrayList<BVo> list = new ArrayList<BVo>();
		
		try {
			conn = getConnection();
			String sql = "select * from board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				bid = rs.getInt("bid");
				btitle = rs.getString("BTITLE");
				bcontent = rs.getString("BCONTENT");
				bname = rs.getString("BNAME");
				bgroup = rs.getInt("BGROUP");
				bstep = rs.getInt("BTSEP");
				bindent = rs.getInt("BINDENT");
				bdate = rs.getTimestamp("BDATE");
				bupload = rs.getString("BUPLOAD");
				bhit = rs.getInt("BHIT");
				
				bVo = new BVo(bid,btitle,bcontent,bname,bgroup,bstep,bindent,bdate,bupload,bhit);				
				list.add(bVo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}
	
	//------------------------------------------------------------------------
	
	public Connection getConnection() throws Exception {
		Context context = new InitialContext();
		ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
		
		return ds.getConnection();
	}
	
}//class
