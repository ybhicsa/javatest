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
			Cookie[] cookiesAll = request.getCookies();
		
			for(int i=0;i<cookiesAll.length;i++){
				
				if(cookiesAll != null){
					
					if(i==0){
						continue;
					}
				
				String cookieName = cookiesAll[i].getName();
				String coolieValue = cookiesAll[i].getValue();
				
				out.println(i+"쿠키  : "+ cookieName + ", ");
				out.println( coolieValue + "<br>");
				
				} 
				
				
			}
			out.print("내용이 없습니다.");
			
		%>
</body>
</html>