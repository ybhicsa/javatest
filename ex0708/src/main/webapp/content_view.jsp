<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>뷰페이지</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/read.css">
  
    <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
  <script type="text/javascript">
  	function formck(){
  		alert("확인하러간다");
  		
  		
  		/* return document.form.submit(); */
  		document.mod.submit();
  	}
  	function formlist(){
  		alert("목록으로간다");
  		
  		
  		/* return document.form.submit(); */
  		document.list.submit();
  	}
  	
  	</script>
  
  
</head>
<body>
<section>

	<%
		request.setCharacterEncoding("utf-8");
	
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		Date dy = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yy/MM/dd");
		String today = sf.format(dy);
		
	%>
	
	<form action="./modify_view.jsp" method="post" id="form" name="mod">
		<input type="hidden" name="bname" value="<%=bname %>">
		<input type="hidden" name="btitle" value="<%=btitle %>">
		<input type="hidden" name="bcontent" value="<%=bcontent %>">
		<input type="hidden" name=today value="<%=today %>">
	</form>
	<form action="./list.jsp" method="post" id="form" name="list">
		<input type="hidden" name="bname" value="<%=bname %>">
		<input type="hidden" name="btitle" value="<%=btitle %>">
		<input type="hidden" name="bcontent" value="<%=bcontent %>">
		<input type="hidden" name=today value="<%=today %>">
	</form>

    <h1>NOTICE</h1>

    <table>
      <colgroup>
        <col width="80%">
        <col width="10%">
        <col width="10%">
        
      </colgroup>
      <tr>
        <th colspan="1">제목</th>
        <th colspan="2"><%=today %></th>
      <tr>
        <td colspan="3"><strong><%=btitle %></strong></td>
      </tr>
      <tr>
        <td><%=bname %></td>
        <td>조회수</td>
        <td>111</td>
      </tr>
      <tr>
        <td colspan="3" class="article"><%=bcontent %></td>
      </tr>
      <tr>
        <td colspan="3"><strong>다음글</strong> <span class="separator">|</span> [키즈잼] 2월 프로그램 안내</td>
      </tr>
      <tr>
        <td colspan="3"><strong>이전글</strong> <span class="separator">|</span> [키즈잼] 2020년 1분기 정기 휴관일 안내</td>
      </tr>
    </table>

    <a href="#" onclick="formlist()"><div class="list">목록</div></a>
    <a href=""><div class="list">삭제</div></a>
    <a href="#" onclick="formck()"><div class="list">수정</div></a>
    <a href=""><div class="list">답변달기</div></a>
  </section>
</body>
</html>