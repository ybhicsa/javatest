package com.site.ex0728.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.site.ex0728.vo.BoardVo;
import com.site.ex0728.vo.MemberVo;

public class BoardDao {
	
	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String btitle, bcontent, bname, bupload;
	int bid, bgroup, bstep, bindent, bhit;
	Timestamp bdate;
	
	
	//================================================================================
	// 수정
	public int UpdateModify(int bid, String btitle, String bcontent, String bname, String upload) {
		int modUp = 0;
		try {
			conn = getConnection();
			String sql = "update board set btitle = ?,bcontent = ?,bname = ?,bupload = ? where bid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, btitle);
			pstmt.setString(2, bcontent);
			pstmt.setString(3, bname);
			pstmt.setString(4, upload);
			pstmt.setInt(5, bid);
			modUp = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return modUp;
	}
	//================================================================================
	// 컨텐츠 작성
	public int BoardInsert(String btitle, String bcontent, String bname, String upload) {
		int result = 0;
		try {
			conn = getConnection();
			String sql = "insert into board values(BOARD_SEQ.nextval,?,?,?,BOARD_SEQ.currval,'0','0',sysdate,?,'0')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, btitle);
			pstmt.setString(2, bcontent);
			pstmt.setString(3, bname);
			pstmt.setString(4, upload);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	//================================================================================
	// 컨탠츠 보기
	public BoardVo boardContentView(int bid) {
		BoardVo bVo = new BoardVo();
		BHitUp(bid);
		try {
			conn = getConnection();
			String sql = "select * from board where bid = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bname = rs.getString("bname");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				bdate = rs.getTimestamp("bdate");
				bupload = rs.getString("bupload");
				bhit = rs.getInt("bhit");
				bVo = new BoardVo(bid, btitle, bcontent, bname, bgroup, bstep, bindent, bdate, bupload, bhit);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return bVo;
	}
	//================================================================================
	// 조회수 1증가
	public int BHitUp(int bid) {
		int hitup = 0;
		try {
			conn = getConnection();
			String sql = "update board set bhit = bhit+1 where bid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			hitup = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return hitup;
	}
	//================================================================================
	// 보드테이블의 갯수를 불러온다.
	public int boardCountSelect(String category, String keyword) {
		int listcount = 0;
		String sql = "";
		try {
			conn = getConnection();
			
			switch (category) {
			case "":
				sql = "select count(*) count from board";				
				pstmt = conn.prepareStatement(sql);				
				break;
			
			case "all":
				sql = "select count(*) count from board\r\n"
						+ " where btitle like ? or bcoctent like ?";				
				pstmt = conn.prepareStatement(sql);	
				pstmt.setString(1, "%"+keyword+"%");
				pstmt.setString(2, "%"+keyword+"%");
				break;
			
			case "btitle":
				sql = "select count(*) count from board\r\n"
						+ " where btitle like ?";				
				pstmt = conn.prepareStatement(sql);	
				pstmt.setString(1, "%"+keyword+"%");
				break;
			
			case "bcontent":
				sql = "select count(*) count from board\r\n"
						+ " where bcontent like ?";				
				pstmt = conn.prepareStatement(sql);	
				pstmt.setString(1, "%"+keyword+"%");
				break;

			default:
				break;
			}
			
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				listcount = rs.getInt("count");
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
		return listcount;
	}
	//================================================================================
	
	public ArrayList<BoardVo> boardAllSelect(int startrow, int endrow, String category, String keyword){
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		try {
			conn = getConnection();
			
			String sql = "";
			
			switch (category) {
			case "":
				sql = "select * from \r\n"
					+ " (select ROWNUM rnum, b.* from\r\n"
					+ " (SELECT * from board order by bgroup desc, bstep asc) b)\r\n"
					+ " where rnum>=? and rnum<=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, startrow);
				pstmt.setInt(2, endrow);			
				break;
			
			case "all":
				sql = "select * from \r\n"
					+ " (select ROWNUM rnum, b.* from\r\n"
					+ " (SELECT * from board order by bgroup desc, bstep asc) b\r\n"
					+ " where btitle like ? or bcontent like ?)\r\n"
					+ " where rnum>=? and rnum<=?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, "%"+keyword+"%");
						pstmt.setString(2, "%"+keyword+"%");
						pstmt.setInt(3, startrow);
						pstmt.setInt(4, endrow);	
				break;
			
			case "btitle":
				sql = "select * from \r\n"
					+ " (select ROWNUM rnum, b.* from\r\n"
					+ " (SELECT * from board order by bgroup desc, bstep asc) b\r\n"
					+ " where btitle like ?)\r\n"
					+ " where rnum>=? and rnum<=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "%"+keyword+"%");
					pstmt.setInt(2, startrow);
					pstmt.setInt(3, endrow);	
				break;
			
			case "bcontent":
				sql = "select * from \r\n"
						+ "(select ROWNUM rnum, b.* from\r\n"
						+ "(SELECT * from board order by bgroup desc, bstep asc) b\r\n"
						+ "where bcontent like ?)\r\n"
						+ "where rnum>=? and rnum<=?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, "%"+keyword+"%");
						pstmt.setInt(2, startrow);
						pstmt.setInt(3, endrow);	
				break;

			default:
				break;
			}
			
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				bid = rs.getInt("bid");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bname = rs.getString("bname");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				bdate = rs.getTimestamp("bdate");
				bupload = rs.getString("bupload");
				bhit = rs.getInt("bhit");
				
				list.add(new BoardVo(bid,btitle,bcontent,bname,bgroup,bstep,bindent,bdate,bupload,bhit));
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
		return list;
	}
	//================================================================================
	public Connection getConnection() throws Exception {
		Context context = new InitialContext();
		ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		return ds.getConnection();
	}
	//================================================================================
	
	
	
	
	
}
