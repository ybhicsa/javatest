<%@page import="com.site.ex0715_03.MDao"%>
<%@page import="com.site.ex0715_03.MDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String nickName = request.getParameter("nickName");
		String gender = request.getParameter("gender");
		String tel = request.getParameter("tel");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String[] hobby = request.getParameterValues("hobby");
		String hobbys = "";
		
		for(int i=0;i<hobby.length;i++){
			if(i==0) hobbys += hobby[i];
			else hobbys += ","+ hobby[i];
		}
		
		MDto mDto = new MDto(id,pw,name,nickName,gender,tel,address1,address2,hobbys);
		MDao mDao = new MDao();
		
		int resultNum = mDao.memberInsert(mDto);
	
	%>

	<head>
		<meta charset="UTF-8">
		<title>memberck</title>
		<script type="text/javascript">
			if(<%= resultNum==1 %>){
				alert("가입이 완료되었습니다.");
				location.href = "./success.jsp";
			} else { 
				alert("가입이 실패 하였습니다.");
				location.href = "./member.jsp";
			}
			
		
		</script>
	</head>
	<body>
		
	</body>
</html>