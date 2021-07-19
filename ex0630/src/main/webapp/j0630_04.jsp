<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<%
			request.setCharacterEncoding("utf-8");
		%>
		<style type="text/css">
			table,td { 
				border: 1px solid black; border-collapse: collapse; 
 			}
		</style>
		
		
	</head>
	<body>
		<!-- 1. memberForm.jsp - 번호, 이름, 아이디, 전화번호, 성별, 월급, 공제액  -->
		<!-- 1-1. salary.jsp - 번호, 이름, 아이디, 비번, 전화번호, 성별, 월급, 공제액(10%)  -->
		<!-- 2. j0630_04.jsp - 폼에서 넘어온 데이터를 useBean에 값을 삽입 -->
		<!-- 3. sueBean 데이터를 테이블에 출력하시오. -->
	
		<jsp:useBean id="member" class="ex0630.Salary" />
		<jsp:setProperty property="*" name="member"/>
		
		<table>
			<tr>
				<td>번호</td>
				<td><%= member.getNo() %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%= member.getName() %></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><%= member.getId() %></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><%= member.getTel()%></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%= member.getGender()%></td>
			</tr>
			<tr>
				<td>월급</td>
				<td><%= member.getPaycheck()%></td>
			</tr>
			<tr>
				<td>공제액</td>
				<td><%= member.getDeductible()%></td>
			</tr>
		
		</table>
		
		
		
		
	</body>
</html>