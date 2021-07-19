<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
		
			function formck(){
			
				alert("폼체크");
				
				if($("#id").val() == ""){
					alert("아이디가 비어있습니다.");
					$("#id").focus();
					return;
				}
				
				if($("#id").val() < 3){
					alert("아이디는 3자 이상 입력해 주세요.");
					$("#id").focus();
					return;
				}
				
				
				return document.form.submit();
			}
		
		</script>
	</head>
	<body>
	
		
	
	
		<form action="formOk.jsp" name="form" id="form" method="post">
			<table border="1">
			
				<tr>
					<td>아이디</td>
					<td colspan="2"><input type="text" name="id" id="id"> </td>
				</tr>
				<tr>
					<td>비번</td>
					<td colspan="2"><input type="text" name="pw"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td colspan="2"><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td colspan="2"><input type="text" name="phon"></td>
				</tr>
				<tr>
					<td>성별</td>
					<td colspan="2">
					<input type="radio" id="male" name="gender" value="남자">
					<label for="male">남자</label>
					<input type="radio" id="female" name="gender" value="여자">
					<label for="female">여자</label>	
					</td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="add1">
						<input type="text" name="add2">
					</td>
				</tr>
				<tr>
					<td>취미</td>
					<td colspan="2">
					<input type="checkbox" name="hobby" id="swim" value="수영">
					<label for="swim">수영</label>
					<input type="checkbox" name="hobby" id="run" value="조깅">
					<label for="run">조깅</label>
					<input type="checkbox" name="hobby" id="read" value="독서">
					<label for="read">독서</label>
					<input type="checkbox" name="hobby" id="golf" value="골프">
					<label for="golf">골프</label>
					
					</td>
				</tr>
				<tr>
					<td>유입경로</td>
					<td colspan="2">
					<select name="path">
						<option value="internet">인터넷</option>
						<option value="blog">블로그</option>
						<option value="newspaper">신문광고</option>
						<option value="youtube">유트브</option>
					</select>
					</td>
				</tr>
				
				
			
			
			
			</table>
				
				<input type="button" onclick="formck()" value="전송">
		
		</form>
	
	
	
	
	</body>
</html>