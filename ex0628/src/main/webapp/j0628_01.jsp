<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
		
		function formCheck(){
			
				alert("폼체크 테스트");
				if($("#pw").val()=="" || $("#pw").val==null){
					alert("비밀번호가 입력되지 않았습니다.");			
					$("#pw").focus();
					return false;
				}
					
				if($("#pw").val() != $("#pw2").val()){
					alert("비밀번호가 일치하지 않습니다");
					$("#pw").val("");
					$("#pw2").val("");
					$("#pw").focus();
					return false;
				}
				
				
				return document.form.submit();
			
		}
		
		</script>
	</head>
	<body>
	
	<h3>회원가입</h3>
	<form action="formok.jsp" method="post" name="form">
	
		<label>이름</label>
		<input type="text" id="name" name="name"><br><br>
		
		<label>아이디</label>
		<input type="text" id="id" name="id"><br><br>
		
		<label>비밀번호</label>
		<input type="text" id="pw" name="pw"><br><br>
		
		<label>비밀번호 확인</label>
		<input type="text" id="pw2" name="pw2"><br><br>
		
		<label>성별</label>
		<input type="radio" id="male" name="gender" value="male">
		<label for="male">남자</label>
		<input type="radio" id="male" name=gender value="female">
		<label for="male">여자</label><br><br>
		
		<label>취미</label>
		<input type="checkbox" id="run" name="hobby" value="run">
		<label for="run">조깅</label>		
		<input type="checkbox" id="game" name="hobby" value="game">
		<label for="game">게임</label>		
		<input type="checkbox" id="read" name="hobby" value="read">
		<label for="read">독서</label>		
		<input type="checkbox" id="golf" name="hobby" value="golf">
		<label for="golf">골프</label>	<br><br>	
		
		
		<label>전공</label>		
		<select name="major">
			<option value="computer">컴퓨터 공학</option>
			<option value="korea">국문학</option>
			<option value="math">수학</option>		
		</select>
		<br><br>
		<input type="button" onclick="formCheck()" value="전송"><br>
		
	
	
	
	</form>
	
	
	</body>
</html>