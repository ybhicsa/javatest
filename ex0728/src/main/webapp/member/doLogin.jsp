<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>들어간다</title>
		<script type="text/javascript">
			//alert("${session_flag}");
			//if(<%= session.getAttribute("session_flag") == "success" %>){
			if("${session_flag}" == "success"){
				alert("로그인이 되었습니다.");
				location.href= "../index.jsp";
			} else {
				alert("아이디와 비밀번호가 일치하지 않습니다.");
				location.href= "./login.jsp";
			} 
		</script>
	</head>
	<body>
	
	</body>
</html>