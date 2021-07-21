package com.site.ex0721.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.site.ex0721.BoardVo;
import com.site.ex0721.Vo.BVo;

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
	
	public int boardWrite(String bname,String btitle,String bcontent,String bupload) {
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
			
			
			System.out.println(result);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		return result;
	}
	//------------------------------------------------------------------------
	public BVo boardOneList(int bid) {
		BVo bVo = new BVo();
		
		try {
			
			conn = getConnection();
			String sql = "select * from board where bid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs = pstmt.executeQuery();
			
			System.out.println(bid);
			if(rs.next()) {
				
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
				
				System.out.println(bVo.getBtitle());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
	
	
	private BVo BVo(String btitle2, String bcontent2, String bname2, int bhit2) {
		// TODO Auto-generated method stub
		return null;
	}


		//------------------------------------------------------------------------
		public ArrayList<BVo> boardAllList(){
			ArrayList<BVo> list = new ArrayList<BVo>();
			
			
			try {
				
				conn = getConnection();
				String sql = "select * from board";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
					
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
				// TODO Auto-generated catch block
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
		}//boardAllList
		
	
	//------------------------------------------------------------------------

		//context접근하여 DataSource Connection객체 1개를 가지고옴
		public Connection getConnection() throws Exception {
			Context context = new InitialContext();
			
			ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			
			return ds.getConnection();
		}
		
	//------------------------------------------------------------------------
	
	
}
