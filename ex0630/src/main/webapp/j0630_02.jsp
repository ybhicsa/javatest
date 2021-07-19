<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<!--
			sueBean을 만들어서 
			데이터 1, 홍길동, aaa, 111 010-4460-7855, 남자 저장
			후 출력
			
		  -->
		  
		  <jsp:useBean id="member"  class="ex0630.Member"  scope="page" />
		  <jsp:setProperty property="no"  name="member"  value="1"/>
		  <jsp:setProperty property="name"  name="member"  value="홍길동"/>
		  <jsp:setProperty property="id"  name="member"  value="aaa"/>
		  <jsp:setProperty property="pw"  name="member"  value="1111"/>
		  <jsp:setProperty property="tel"  name="member"  value="010-4460-7855"/>
		  <jsp:setProperty property="gender"  name="member"  value="남자"/>
	
		<%
			member.setNo(1);
		%>
		
		<table border="1">
			<tr>
				<td>번호</td>
				 <td><jsp:getProperty  property="no"  name="member" />  </td> 
			</tr>
			<tr>
				<td>이름</td>
				<td><jsp:getProperty  property="name"  name="member" />  </td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><jsp:getProperty  property="id"  name="member" />  </td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><jsp:getProperty  property="pw"  name="member" />  </td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><jsp:getProperty  property="tel"  name="member" />  </td>
			</tr>
			<tr>
				<td>성별</td>
				<td><jsp:getProperty  property="gender"  name="member" />  </td>
			</tr>
			
		
		</table>
		
		<table border="1">
			<tr>
				<td>번호</td>
				<td><%= member.getNo() %> </td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%= member.getName() %> </td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><%= member.getId() %> </td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><%= member.getPw() %> </td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><%= member.getTel() %> </td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%= member.getGender() %> </td>
			</tr>
			
		
		</table>
	
	
	</body>
</html>