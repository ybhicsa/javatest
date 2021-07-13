<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>db 연결</title>
	</head>
	<body>
	<%
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
	
		try{
			
			//고정으로 사용한다
			Class.forName("oracle.jdbc.driver.OracleDriver"); //메모리에 jdbc 탑재
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
						//jdbc:oracle:thin:@localhost:1521:xe
			//java.sql 이다
			conn = DriverManager.getConnection(url,"ora_user","1234");//커낵션(접속url,아이디,비번)
			
			//java.sql 이다
			stmt = conn.createStatement(); //쿼리창이 열린다(sql구분을 입력하는 창)
			
			//java.sql 이다
			rs = stmt.executeQuery("select * from employees"); //sql구문을 입력
		
			
			//rs에는 107개가 들어가있다.
			//out.println(rs);
			while(rs.next()){
				
				int employee_id = rs.getInt("employee_id");
				String emp_name = rs.getString("emp_name");
				String email = rs.getString("email");
				Timestamp date = rs.getTimestamp("hire_date");
				
				out.println("사원번호 : "+employee_id + "이름 : "+emp_name+"이메일 : "+email+"입사일 : "+date +"<br>");
				//out.println("이름 : "+emp_name);
				//out.println("이메일 : "+email);
				//out.println("입사일 : "+date);
	
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
	
	
	
		
	
	%>
	
	
	</body>
</html>