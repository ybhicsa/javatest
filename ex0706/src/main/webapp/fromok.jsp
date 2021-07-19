
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<style type="text/css">
			table,th,td {border: 1px solid black; border-collapse: collapse; width: 10cm;}
		</style>
		
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
		
			String mail1,mail2,pw,news,age,gender,marr,son,job,topics="";
			String[] topic;
			
			mail1 = request.getParameter("mail1");
			mail2 = request.getParameter("mail2");
			pw = request.getParameter("pw");
			news = request.getParameter("news");
			age = request.getParameter("age");
			gender = request.getParameter("gender");
			marr = request.getParameter("marr");
			son = request.getParameter("Son");
			job = request.getParameter("Job");
			topic = request.getParameterValues("Topic");
			
			for(int i=0;i<topic.length;i++){
				if(i==0)	topics = topic[i];
				else topics = topics+ ", "+ topic[i];
				
			}
			
		%>
		
		<table>
			<tr>
				<td>이메일(아이디)</td>
				<td><%=mail1 %>@<%=mail2 %></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><%=pw %></td>
			</tr>
			<tr>
				<td>소식지 수신여부</td>
				<td><%=news %></td>
			</tr>
		</table>
		<br><br>
		<table>
			<tr>
				<th>관심연령</th>
				<td><%=age %></td>
				<th>성별</th>
				<td><%=gender %></td>
			</tr>
			<tr>
				<th>결혼여부</th>
				<td><%=marr %></td>
				<th>자녀유무</th>
				<td><%=son %></td>
			</tr>
			<tr>
				<th>직업</th>
				<td><%=job %></td>
			</tr>
		</table>
		<br><br>
		<table>
			<tr>
			<td>관심있는주제</td>
			<td><%=topics %></td>
			</tr>
		</table>
	
		<form action="./form_update.jsp">
		
			<input type="hidden" name="mail1" value="<%= mail1%>">
			<input type="hidden" name="mail2" value="<%= mail2%>">
			<input type="hidden" name="pw" value="<%=pw %>">
			<input type="hidden" name="news" value="<%=news %>">
			<input type="hidden" name="age" value="<%=age %>">
			<input type="hidden" name="gender" value="<%=gender %>">
			<input type="hidden" name="marr" value="<%= marr%>">
			<input type="hidden" name="Son" value="<%= son%>">
			<input type="hidden" name="Job" value="<%=job %>">
			<input type="hidden" name="Topic" value="<%=topic %>">
			<br>
			<input type="submit" value="수정">
			
		</form>
		
		<button type="button" onclick="location.href='./form_update.jsp'">수정</button>
		
	</body>
</html>