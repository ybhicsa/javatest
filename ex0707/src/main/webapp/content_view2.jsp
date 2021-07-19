<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
			<style type="text/css">
			table,th,td { border: 1px solid black; border-collapse: collapse;}
		</style>
		
	</head>
	<body>
	
		<%
			String b_id,b_title,bcontent,bname,bdate,bhit,bip,n_wirte,categoriess="";
			String[] categories;
			
			response.setCharacterEncoding("utf-8");
			b_id = request.getParameter("b_id");
			b_title = request.getParameter("b_title");
			bcontent = request.getParameter("bcontent");
			bname = request.getParameter("bname");
			bdate = request.getParameter("bdate");
			bhit = request.getParameter("bhit");
			bip = request.getParameter("bip");
			n_wirte = request.getParameter("n_wirte");
			categories = request.getParameterValues("categories");
			
			for(int i=0;i<categories.length;i++){
				if(i==0) categoriess = categories[i];
				else categoriess = categoriess +", "+categories[i];	
			}
		
			

		%>
	
		<h3>게시판 view</h3>
		
		<table>
			<tr>
				<td>번호</td>
				<td><%= b_id%></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><%= b_title%></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><%= bcontent%></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><%= bname%></td>
			</tr>
			<tr>
				<td>작성일</td>
				<td><%= bdate%></td>
			</tr>
			<tr>
				<td>조회수</td>
				<td><%= bhit%></td>
			</tr>
			<tr>
				<td>ip</td>
				<td><%= bip%></td>
			</tr>
			<tr>
				<td>공지글 등록</td>
				<td><%= n_wirte%></td>
			</tr>	
			<tr>
				<td>카테고리</td>
				<td><%= categoriess%></td>
			</tr>
			
		</table>
		
		<form action="./modify_view2.jsp">
		
			<input type="hidden" name="b_id" id="b_id" value="<%=b_id%>" >
		
			<input type="hidden" name="b_title" id="b_title" value="<%=b_title%>">
		
			<input type="hidden" name="bcontent" id="bcontent" value="<%=bcontent%>">
	
			<input type="hidden" name="bname" id="bname" value="<%=bname%>">
		
			<input type="hidden" name="bdate" id="bdate" value="<%=bdate%>" >

			<input type="hidden" name="bhit" id="bhit" value="<%=bhit%>">
	
			<input type="hidden" name="bip" id="bip" value="<%=request.getRemoteAddr() %>" readonly><br>
		
			<input type="hidden" id="n_yes" name="n_wirte" value="<%= n_wirte%>">
			
			<input type="hidden" name="categories" value="<%= categoriess%>">
		
			<input type="submit" value="수정">
			<input type="reset" value="취소">
			
		</form>
		
		
		<!-- <button type="button" onclick="location.href='./modify_view2.jsp'"> 수정 </button> -->
		
	</body>
</html>