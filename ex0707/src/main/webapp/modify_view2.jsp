<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판 수정</title>
	</head>
	<body>
	
			<%
			String b_id,b_title,bcontent,bname,bdate,bhit,bip,n_wirte,categoriess;
		
			response.setCharacterEncoding("utf-8");
			b_id = request.getParameter("b_id");
			b_title = request.getParameter("b_title");
			bcontent = request.getParameter("bcontent");
			bname = request.getParameter("bname");
			bdate = request.getParameter("bdate");
			bhit = request.getParameter("bhit");
			bip = request.getParameter("bip");
			n_wirte = request.getParameter("n_wirte");
			categoriess = request.getParameter("categories");
			

		%>
		
	
		<form action="./content_view2.jsp">
			<label>번호</label>
			<input type="text" name="b_id" id="b_id" value="<%=b_id%>"><br>
			<label>제목</label>
			<input type="text" name="b_title" id="b_title"  value="<%=b_title%>"><br>
			<label>내용</label>
			<input type="text" name="bcontent" id="bcontent" value="<%=bcontent%>" ><br>
			<label>작성자</label>
			<input type="text" name="bname" id="bname"  value="<%=bname%>"><br>
			<label>작성일</label>
			<input type="date" name="bdate" id="bdate"  value="<%=bdate%>"><br>
			<label>조회수</label>
			<input type="text" name="bhit" id="bhit"  value="<%=bhit%>"><br>
			<label>ip</label>
			<input type="text" name="bip" id="bip" value="<%=request.getRemoteAddr() %>" readonly><br>
			
			<label>공지글 등록</label><br>
			<input type="radio" id="n_yes" name="n_wirte" value="n_yes" 
			<%=(n_wirte.equals("n_yes")? "checked":"") %>
			><label for="n_yes">공지글등록</label><br>
			<input type="radio" id="n_no" name="n_wirte" value="n_no"
			<%=(n_wirte.equals("n_no")? "checked":"") %>
			><label for="n_no">공지글취소</label><br>
			<label>글카테고리</label><br>
			<input type="checkbox" id="screen" name="categories" value="screen"
			<%=(categoriess.contains("screen")? "checked":"") %>
			>영화<br>
			<input type="checkbox" id="rtianing" name="categories" value="rtianing"
			<%=(categoriess.contains("rtianing")? "checked":"") %>
			>운동<br>
			<input type="checkbox" id="music" name="categories" value="music"
			<%=(categoriess.contains("music")? "checked":"") %>
			>음악<br>
			<input type="checkbox" id="etc" name="categories" value="etc"
			<%=(categoriess.contains("etc")? "checked":"") %>
			>기타<br>
			
		
		
			<br>
			<input type="submit" value="저장">
			<input type="reset" value="취소">
			
		</form>
	</body>
</html>