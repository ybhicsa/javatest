<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판 쓰기</title>
	</head>
	<body>
		<form action="./content_view2.jsp">
			<label>번호</label>
			<input type="text" name="b_id" id="b_id" ><br>
			<label>제목</label>
			<input type="text" name="b_title" id="b_title" ><br>
			<label>내용</label>
			<input type="text" name="bcontent" id="bcontent" ><br>
			<label>작성자</label>
			<input type="text" name="bname" id="bname" ><br>
			<label>작성일</label>
			<input type="date" name="bdate" id="bdate" ><br>
			<label>조회수</label>
			<input type="text" name="bhit" id="bhit" ><br>
			<label>ip</label>
			<input type="text" name="bip" id="bip" value="<%=request.getRemoteAddr() %>" readonly><br>
			<label>공지글 등록</label><br>
			<input type="radio" id="n_yes" name="n_wirte" value="n_yes" ><label for="n_yes">공지글등록</label><br>
			<input type="radio" id="n_no" name="n_wirte" value="n_no"><label for="n_no">공지글취소</label><br>
			<label>글카테고리</label><br>
			<input type="checkbox" id="screen" name="categories" value="screen"><label for="screen">영화</label><br>
			<input type="checkbox" id="rtianing" name="categories" value="rtianing"><label for="rtianing">운동</label><br>
			<input type="checkbox" id="music" name="categories" value="music"><label for="music">음악</label><br>
			<input type="checkbox" id="etc" name="categories" value="etc"><label for="etc">기타</label><br>
			
			<br>
			<input type="submit" value="저장">
			<input type="reset" value="취소">
			
		</form>
	</body>
</html>