<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>쿠키 저장 정보</title>
	</head>
	<body>
	
		<%
			Cookie[] cookiesAll = request.getCookies();
		
			for(int i=0;i<cookiesAll.length;i++){
				
				if(i==0){
					continue;
				}
				
				String cookieName = cookiesAll[i].getName();
				String coolieValue = cookiesAll[i].getValue();
				
				out.println(i+"쿠키  : "+ cookieName + ", ");
				out.println( coolieValue + "<br>");
				
				if(cookiesAll[i].getValue().equals("success")){
					
					out.print("로그인이 되었습니다.");
					
				}
				
			}
			
			//삭제
			for(int i=0;i<cookiesAll.length;i++){
				
				//cookiesAll[i].setMaxAge(0);  모든 쿠키 삭졔
				
				if(cookiesAll[i].getName().equals("cookie_flag")){
					
					cookiesAll[i].setMaxAge(0);	//해당하는 쿠키 한개 삭제
					
					response.addCookie(cookiesAll[i]);	//최종 유저 컴퓨터에 쿠키저장
					
				}
			}
			
			
		%>
	
		<a href="cookieDel.jsp">쿠키 삭제 확인</a>
	
	
	</body>
</html>