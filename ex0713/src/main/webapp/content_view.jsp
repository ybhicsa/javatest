<%@page import="java.text.SimpleDateFormat"%>
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
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>뷰페이지</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/read.css">
</head>
<body>
<section>
    <h1>NOTICE</h1>


    <table>
	
      <colgroup>
        <col width="80%">
        <col width="10%">
        <col width="10%">
        
      </colgroup>
      
        <%
      
     	Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","1234");
		
		stmt = conn.createStatement();
		
		String sql = "select btitle, bcontent, bname, bdate, bhit from borad where bid = 1";
			
		rs = stmt.executeQuery(sql);
		
      	
      %>
       <%
      		while(rs.next()){
					
			String bcontent= rs.getString("bcontent");
			String btitle= rs.getString("btitle");
			String bname= rs.getString("bname");
			Timestamp bdate= rs.getTimestamp("bdate");
			int bhit= rs.getInt("bhit");
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	      	String today = sf.format(bdate);
      
      %>
      <tr>
        <th colspan="1">제목</th>
        <th colspan="3">작성일</th>
      </tr>
      <tr>
         <td colspan="1"><strong><%= btitle%></strong></td>
         <td colspan="3"><%= today%></td>
      </tr>
      
      
      <tr>
        <td><%= bname%></td>
        <td>조회수</td>
        <td><%= bhit%></td>
      </tr>
      <tr>
        <td colspan="3" class="article"><%= bcontent%></td>
      </tr>
      <tr>
        <td colspan="3"><strong>다음글</strong> <span class="separator">|</span> [키즈잼] 2월 프로그램 안내</td>
      </tr>
      <tr>
        <td colspan="3"><strong>이전글</strong> <span class="separator">|</span> [키즈잼] 2020년 1분기 정기 휴관일 안내</td>
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
    <a href=""><div class="list">목록</div></a>
    <a href=""><div class="list">삭제</div></a>
    <a href=""><div class="list">수정</div></a>
    <a href=""><div class="list">답변달기</div></a>
  </section>
</body>
</html>