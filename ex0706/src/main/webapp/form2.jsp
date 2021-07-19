<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="./formok2.jsp">

			<h3>회원가입</h3>

			<label>아이디</label>		
			<input type="text" name="id"><br>
			<label>비번</label>		
			<input type="text" name="pw" ><br>
			<label>이름</label>		
			<input type="text" name="name" ><br>
			<label>성별</label>		
			<input type="radio" name="gender" value="male">남자
			<input type="radio" name="gender" value="female">여자<br>
			
			<br>
			<input type="submit" value="저장">
			<input type="reset" value="취소">
			
		</form>
	</body>
</html>