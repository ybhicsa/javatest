<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="rCheck.jsp">
			<h3>출생년도 나이 계산</h3>
			
			<!-- <label>출생시기를 선택하세요.</label>
			<input type="radio" id="19" name="century" value="19">
			<label for="19">1990년생</label>
			<input type="radio" id="20" name="century" value="20">
			<label for="20">1990년생</label> -->
			
			<label>이름을 입력해주세요.</label>
			<input type="text" id="name" name="name"><br><br>
			
			<label>출생지(ex:서울,경기,부산,인천 등등..)</label>
			<input type="text" id="place" name="place"><br><br>
			
			<label>출생 년도를 입력해 주세요.(ex:1993)</label>
			<input type="text" id="birth" name="birth"><br><br>
			
			
			<input type="submit" value="전송">
		
		
		</form>
	</body>
</html>