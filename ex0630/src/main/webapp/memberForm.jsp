<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
			<%
				request.setCharacterEncoding("utf-8");
			%>
		
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
		
		function memberCh() {
			
			//alert("테스트")
			
			if( $("#name").val() == ""){
				alert("이름이 입력되지 않았습니다.");
				$("#name").focus();
				return;
			}
			
			
			if( $("#id").val().length <= 3 ){
				alert("3자리이상 입력해 주세요.");
				$("#id").focus();
				return;
			}
			
			var py = Number($("#paycheck").val())/10;
			
			$("#deductible").val(py);
			
			
			return document.form.submit();
		}
		
		
		</script>
		
		
	</head>
	<body>

	
		<form action="./j0630_04.jsp" method="post" id="form" name="form" >
		
			<label>번호</label>
			<input type="text" name="no" id="no"><br>
		
			<label>이름</label>
			<input type="text" name="name" id="name"><br>
		
			<label>아이디</label>
			<input type="text" name="id" id="id"><br>
		
			<label>전화번호</label>
			<input type="text" name="tel" id="tel"><br>
			
			<label>성별</label>
			<input type="text" name="gender" id="gender"><br>
			
			<label>월급</label>
			<input type="text" name="paycheck" id="paycheck"><br>
			
			<input type="hidden" name="deductible"  id="deductible"><br>
			
			
			<input type="button" onclick="memberCh()" value="저장">
		</form>
	
	
	</body>
</html>