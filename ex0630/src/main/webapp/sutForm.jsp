<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Form</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			
			function formChe() {
				
				//var : 변수 설정 가능 
				//var re = $("#kor").val() + $("#eng").val() + $("#math").val()
				
				$("#kor").val();
				//var kor = Integer.parseInt($("#kor").val());
			//	var kor = Number($("#kor").val());
		
				$("#eng").val();
				//var eng = Integer.parseInt($("#eng").val());
			//	var eng = Number($("#eng").val());
				
				$("#math").val();
				//var math = Integer.parseInt($("#math").val());
			//	var math = Number($("#math").val());
				
			//	$("#total").val( kor+eng+math );
				$("#total").val( Number($("#kor").val()) + Number($("#eng").val()) + Number($("#math").val()));
				$("#avg").val( $("#total").val() /3.0);
				//$("#avg").val(100);
				
				
				return document.form.submit();
			}
			
		
			
			
		</script>
		
		
	</head>
	<body>
		<form action="./j0630_03.jsp" method="post" name="form">
		
			<label>학번</label>
			<input type="text" id="stuNo" name="stuNo"><br>
			<label>이름</label>
			<input type="text" id="name" name="name"><br>
			<label>국어</label>
			<input type="text" id="kor" name="kor"><br>
			<label>영어</label>
			<input type="text" id="eng" name="eng"><br>
			<label>수학</label>
			<input type="text" id="math" name="math"><br>
			
			<input type="hidden" id="total" name="total">
			<input type="hidden" id="avg" name="avg">
			
			<input type="button" onclick="formChe()" value="전송">
		
		
		</form>
	
	
	
	</body>
</html>