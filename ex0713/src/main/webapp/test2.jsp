
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
		<title>member</title>
	</head>
	<body>
		<%
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
							 //oracle.jdbc.driver.OracleDriver
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","1234");
											      //jdbc:oracle:thin:@localhost:1521:xe
				stmt = conn.createStatement();
				String sql = "select * from member";
				rs = stmt.executeQuery(sql);
				
				
				while(rs.next()){
					
					String mid = rs.getString("mid"); 
					String mpw = rs.getString("mpw"); 
					String mname = rs.getString("mname"); 
					//String mphone = rs.getString("mphone"); 
					//String mgender = rs.getString("mgender"); 
					//String maddress1 = rs.getString("maddress1"); 
					//String maddress2 = rs.getString("maddress2"); 
					//String mhobby = rs.getString("mhobby"); 
					
					out.println("아이디 : " + mid +"비밀번호 : "+mpw+ "<br>");
				}
				
				
				
				
				
				
				
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					if(rs != null) rs.close();
					if(stmt != null) stmt.close();
					if(conn != null) conn.close();
				}catch(Exception e2){
					e2.printStackTrace();
				}
			}
				
		%>	
	
	</body>
</html>