<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>		
		
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
		
		function formCheck(){
			
			alert("테스트");
			
			if($("#number").val()=="" || $("#number").val()==null){
				alert("시험번호가 입력되지 않았습니다.")
				$("#number").focus();
				return false; 
			}
			if($("#name").val()=="" || $("#name").val()==null){
				alert("이름이 입력되지 않았습니다.")
				$("#name").focus();
				return false; 
			}
			if($("#Score").val()=="" || $("#Score").val()==null){
				alert("점수가 입력되지 않았습니다.")
				$("#Score").focus();
				return false; 
			}
			
			//return document.form.submit();
			return $("#test").submit();
			
			
		}
		
		
		</script>
	
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="test.jsp" name="form" id="test" method="post">
			<!-- 시험번호:1 이름:홍길동 점수:70 -->
			<!-- test.jsp -> test_success.jsp, test_fail.jsp -->
			<!-- test.jsp -> 60이상:합격 60미만:불합격 파리미터-> 시험번호,이름,점수,합격입니다.  불합격입니다. -->
		
			<label>시험번호를 입력해 주세요.</label>
			<input type="text" id=number name="number"><br><br>
		
			<label>이름을 입력해 주세요.</label>
			<input type="text" id=name name="name"><br><br>
		
			<label>점수를 입력해 주세요.</label>
			<input type="text" id=Score name="Score"><br><br>
		
			<input type="button" onclick="formCheck()" value="전송">
		</form>	
	</body>
</html>