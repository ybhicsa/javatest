<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/notice_list.css">
  
  <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
  <script type="text/javascript">
  	function contnt(){
  		alert("확인하러간다");
  		
  		
  		/* return document.form.submit(); */
  		document.con.submit();
  	}
  </script>
</head>
<body>
<section>
	
	<%
		String bname, btitle ,today,bcontent;
		
		request.setCharacterEncoding("utf-8");
	
		bname = request.getParameter("bname");
		btitle = request.getParameter("btitle");
		bcontent = request.getParameter("bcontent");
		today = request.getParameter("today");
		
		if(bname == null || btitle == null || today == null) {
			bname ="";
			btitle ="";
			today ="";
			bcontent ="";
		}
			
		
	%>
	<form action="./content_view.jsp" method="post" id="form" name="con">
		<input type="hidden" name="bname" value="<%=bname %>">
		<input type="hidden" name="btitle" value="<%=btitle %>">
		<input type="hidden" name="bcontent" value="<%=bcontent %>">
		<input type="hidden" name=today value="<%=today %>">
	</form>

    <h1>NOTICE</h1>
    <div class="wrapper">
      <form action="/search" name="search" method="post">
        <select name="category" id="category">
          <option value="0">전체</option>
          <option value="title">제목</option>
          <option value="content">내용</option>
        </select>

        <div class="title">
          <input type="text" size="16">
        </div>
  
        <button type="submit"><i class="fas fa-search"></i></button>
      </form>
    </div>

    <table>
      <colgroup>
        <col width="15%">
        <col width="45%">
        <col width="15%">
        <col width="15%">
        <col width="15%">
      </colgroup>
      <!-- 제목부분 -->
      <tr>
        <th>No.</th>
        <th>제목</th>
        <th>작성일</th>
        <th>작성자</th>
        <th>조회수</th>
      </tr>
      <!-- 내용부분 -->
      
      
      
      <tr>
        <td><span class="table-notice">1</span></td>
        <td class="table-title">
        <a href="">공자사항입니다.</a>
        </td>
        <td>21/07/08</td>
        <td>김영빈</td>
        <td>1</td>
      </tr>
      <%
      if(btitle != ""){
      %>
      <tr>
        <td><span class="table-notice">2</span></td>
        <td class="table-title">
        <a href="#" onclick="contnt()"><%=btitle%></a>
        </td>
        <td><%=today %></td>
        <td><%=bname %></td>
        <td>1</td>
      </tr>
      <%
      }
      %>
    </table>

    <ul class="page-num">
      <li class="first"></li>
      <li class="prev"></li>
      <li class="num"><div>1</div></li>
      <li class="next"></li>
      <li class="last"></li>
    </ul>

    <a href="./write_view.jsp"><div class="write">쓰기</div></a>
  </section>

</body>
</html>