<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<table border="1">
					<tr>
						<td>번호</td>
						<td>제목</td>
						<td>작성자</td>
						<td>작성일</td>
						<td>조회수</td>
					</tr>
		<%
			
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
		
			
			try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","1234");
			
			stmt = conn.createStatement();
			
			String sql = "select bid, btitle, bname, bdate, bhit  from borad";
				
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				
				String bid= rs.getString("bid");
				String btitle= rs.getString("btitle");
				String bname= rs.getString("bname");
				Timestamp bdate= rs.getTimestamp("bdate");
				int bhit= rs.getInt("bhit");
				
				%>
				<tr>
					<td><%= bid%> </td>
					<td><%= btitle%> </td>
					<td><%= bname%> </td>
					<td><%= bdate%> </td>
					<td><%= bhit%> </td>
				</tr>
				<%
			
			}
			
			
			
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					
				}catch(Exception e2){
					e2.printStackTrace();
				}
			}
			
		
		%>
		</table>
	</body>
</html>