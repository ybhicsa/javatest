<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="http://code.jquery.com/jquery-Latest.min.js"></script>
		<script type="text/javascript">
			function formcheck(){
				alert("테스트");
				
				if( $("#id").val().length < 3) {
					alert("3자리 이상 입력하세요.");
					$("#id").focus();
					return false;
				}
				
				return document.form.submit();
			}
		</script>
		
		<%
			if(request.getParameter("login_flag") != null){
		%>		
			<script type="text/javascript">
				alert("아이디와 비밀번호가 다르다.")
				
			</script>
		<%		
			}
		%>
		
	</head>
	<body>
		<form action="./logincheck.jsp" method="post" name="form">
		
			<label>아이디</label>
			<input type="text" id="id" name="id"><br>
			
			<label>비밀번호</label>
			<input type="text" id="pw" name="pw"><br>
			
			<input type="button" onclick="formcheck()" value="로그인"><br>
			
		
		</form>
	
	
	
	</body>
</html>