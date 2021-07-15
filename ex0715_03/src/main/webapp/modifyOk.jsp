<%@page import="com.site.ex0715_03.MDto"%>
<%@page import="com.site.ex0715_03.MDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<% 
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String nickName = request.getParameter("nickName");
		String gender = request.getParameter("gender");
		String tel = request.getParameter("tel");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String[] hobby = request.getParameterValues("hobby");
		String hobbys="";
		
		for(int i=0;i<hobby.length;i++) { //swim,golf,run
			if(i==0) hobbys=hobbys+hobby[i];
			else hobbys = hobbys+","+hobby[i];
		}
		
		MDto mDto = new MDto(id,pw,name,nickName,gender,tel,address1,address2,hobbys);
	  	MDao mDao = new MDao();
	  		
	  	int updatemod = mDao.modifyupdate(id);
	  	/* int updatemod = mDao.modifyupdate(id,pw,name,nickName,gender,tel,address1,address2,hobbys); */
	  	
	%>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript">
			if(<%= updatemod==1 %>){
				alert("수정이 완료되었습니다.");
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
			%>
				location.href = "./index.jsp";
			} else { 
				alert("수정이 실패 하였습니다.");
				location.href = "./index.jsp";
			}
			
		
		</script>
		
		
	</head>
	<body>
	</body>
</html>