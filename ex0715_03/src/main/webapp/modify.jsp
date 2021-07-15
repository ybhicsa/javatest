

<%@page import="com.site.ex0715_03.MDao"%>
<%@page import="com.site.ex0715_03.MDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보수정</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
		
			function formckk(){
				alert("수정");
				$("#form").submit();
			}
			
		</script>
	</head>
	<body>
	  <%
	  	
	  	String id = (String)session.getAttribute("sessId");
	  	String pw = (String)session.getAttribute("sessPw");
	  	String nickname = (String)session.getAttribute("sessNk");
	  	String name = (String)session.getAttribute("sessName");
	  	String tel = (String)session.getAttribute("sessTel");
	  	String gender = (String)session.getAttribute("sessGender");
	  	String address1 = (String)session.getAttribute("sessAd1");
	  	String address2 = (String)session.getAttribute("sessAd2");
	  	String hobby = (String)session.getAttribute("sessHobby");
	  	
	  
	  
	  
	  	
	  %>
	  
	  <h3>회원정보수정</h3>
	  <form action="./modifyOk.jsp" id="form" name="form">
	    <label>아이디</label>
	    <input type="text" id="id" name="id" placeholder="id는 5자리이상" required value="<%= id %>" ><br>
	    <label>비밀번호</label>
	    <input type="password" id="pw" name="pw" placeholder="pw는 3자리이상" required ><br>
	    <label>이름</label>
	    <input type="text" id="name" name="name" value="<%= name %>"><br>
	    <label>닉네임</label>
	    <input type="text" id="nickName" name="nickName" value="<%= nickname%>"><br>
	    <label>성별</label>
	    <input type="radio" id="male" name="gender" value="M" <%=gender.equals("M")?"checked":"" %>><label for="male">남자</label>
	    <input type="radio" id="female" name="gender" value="F" <%=gender.equals("F")?"checked":"" %> ><label for="female">여자</label><br>
	    <label>전화번호</label>
	    <input type="text" id="tel" name="tel" value="<%= tel %>" ><br>
	    <label>주소1</label>
	    <input type="text" id="address1" name="address1" value="<%= address1%>"><br>
	    <label>주소2</label>
	    <input type="text" id="address2" name="address2" value="<%= address2%>"><br>
	    <label>취미</label>
	    <input type="checkbox" id="swim" name="hobby" value="swim" <%=hobby.contains("swim")?"checked":"" %> ><label for="swim">수영</label>
	    <input type="checkbox" id="golf" name="hobby" value="golf" <%=hobby.contains("golf")?"checked":"" %> ><label for="golf">골프</label>
	    <input type="checkbox" id="run" name="hobby" value="run" <%=hobby.contains("run")?"checked":"" %> ><label for="run">조깅</label>
	    <input type="checkbox" id="read" name="hobby" value="read" <%=hobby.contains("read")?"checked":"" %> ><label for="read">독서</label><br>
	    <input type="button" onclick="formckk()" value="수정하기">
	    <a href="./index.jsp"><input type="button" value="취소"></a><br>
	  
	  </form>
	
	</body>
</html>