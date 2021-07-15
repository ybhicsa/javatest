<%@page import="com.site.ex0715_03.MDao"%>
<%@page import="com.site.ex0715_03.MDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
		
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
		
			MDao mDao = new MDao();
			MDto mDto = mDao.loginSc(id, pw);
			
			
		%>
	<script type="text/javascript">
	
		if(<%= mDto.getId() == null%>){
			alert("아이디가 틀렸습니다.");
			location.href = "./login.jsp";
		} else {
			alert("로그인 되었습니다.");
			<%
				
				session.setAttribute("sessId", id);
				session.setAttribute("sessPw", mDto.getPw());
				session.setAttribute("sessName", mDto.getName());
				session.setAttribute("sessTel", mDto.getTel());
				session.setAttribute("sessGender", mDto.getGender());
				session.setAttribute("sessAd1", mDto.getAddress1());
				session.setAttribute("sessAd2", mDto.getAddress2());
				session.setAttribute("sessHobby", mDto.getHobby());
				session.setAttribute("sessNk", mDto.getNickName());
				session.setAttribute("sess_fl", "session");	
				
			%>
			location.href = "./index.jsp";	
		}
	
	
	
	</script>
	
	</body>
</html>