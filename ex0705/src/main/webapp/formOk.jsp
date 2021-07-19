<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<style type="text/css">
			table,th,td {border: 1px solid black; border-collapse: collapse; }
		</style>
		
	</head>
	<body>
	
		<%
			request.setCharacterEncoding("utf-8");
		
			String id, pw, name, phon, gender,add1, add2, hobbys="",path;
			String[] hobby;
			
			id = request.getParameter("id");
			pw = request.getParameter("pw");
			name = request.getParameter("name");
			phon = request.getParameter("phon");
			gender = request.getParameter("gender");
			add1 = request.getParameter("add1");
			add2 = request.getParameter("add2");
			path = request.getParameter("path");
			
			hobby = request.getParameterValues("hobby");
			
			for(int i=0;i<hobby.length;i++){
				
				if(i==0)
				hobbys = hobby[i];
				else 
				hobbys = hobbys +", "+ hobby[i];	
				
			}
			
		%>


		<table>
			<tr>
				<td>아이디</td>
				<td><%=id %></td>
			</tr>
			<tr>
				<td>비번</td>
				<td><%=pw %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=name %></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><%=phon %></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%=gender %></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><%=add1 %> <%=add2 %></td>
			</tr>
			<tr>
				<td>취미</td>
				<td><%=hobbys %></td>
			</tr>
			<tr>
				<td>유입경로</td>
				<td><%=path %></td>
			</tr>
		
		
		</table>
	
	</body>
</html>