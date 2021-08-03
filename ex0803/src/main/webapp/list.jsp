<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
 
		function ajaxAdd(){
			
	        $.ajax({
	           url:"./js/b_data.json",//controller와 보통 연결한다.
	           type:"post",
	           dataType:"json",
	           data:{
	              
	           },
	           success:function(data){//dao의 리턴값을 받는다.
	           
	           var html = "";

	           for(var i=0; i<data.length; i++){
	              
	              html = html +"<tr>";
	              html = html +"<td><span class='table-notice'>"+data[i].bid+"</span></td>";
	              html = html +"<td class='table-title'><a href=''>"+data[i].btitle+"</a></td>";
	              html = html +"<td>"+data[i].bname+"</td>";
	              html = html +"<td>"+data[i].bdate+"</td>";
	              html = html +"<td>"+data[i].bhit+"</td>";
	              html = html +"</tr>";
	              }           
	              $('#ajaxData').html(html);   
	           },
	           error:function(){
	              alert("실패");
	           }
	        });
		      
	   }//ajaxAdd

  </script>
</head>
<body>
<section>
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
  
        <button type="button" onclick="ajaxAdd()"><i class="fas fa-search"></i></button>
      </form>
    </div>

    <table>
      <colgroup>
        <col width="15%">
        <col width="45%">
        <col width="15%">
        <col width="15%">
        <col width="10%">
      </colgroup>
      <!-- 제목부분 -->
      <tr>
        <th>No.</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회수</th>
      </tr>
      <!-- 내용부분 -->
      <tbody id="ajaxData">
	      <!-- <tr>
	        <td><span class="table-notice"></span></td>
	        <td class="table-title">
	        <a href=""></a>
	        </td>
	        <td></td>
	        <td></td>
	        <td></td>
	      </tr> -->
      </tbody>
  
    </table>

    <ul class="page-num">
      <li class="first"></li>
      <li class="prev"></li>
      <li class="num"><div>1</div></li>
      <li class="next"></li>
      <li class="last"></li>
    </ul>

    <a href="write_view.jsp"><div class="write">쓰기</div></a>
  </section>

</body>
</html>