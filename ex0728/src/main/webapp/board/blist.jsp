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
  <link rel="stylesheet" href="../css/style.css">
  <link rel="stylesheet" href="../css/notice_list.css">
  <script type="text/javascript">
  	//alert("test");  	
  	if(${result==1}){
  		alert("작성완료");
  	}
  	
  </script>
  
</head>
<body>
<section>
    <h1>NOTICE</h1>
    <div class="wrapper">
      <form action="blist.do" name="search" method="post">
        <select name="category" id="category">
          <option value="all" ${category=="all" ? "selected":"" }>전체</option>
          <option value="btitle" ${category=="btitle" ? "selected":"" }>제목</option>
          <option value="bcontent" ${category=="bcontent" ? "selected":"" }>내용</option>
        </select>

        <div class="title">
          <input type="text" name="keyword" size="16" value="${keyword }">
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
      <c:forEach items="${list }" var="bVo">
	      <tr>
	        <td><span class="table-notice">${bVo.bid }</span></td>
	        <td class="table-title">
	        <a href="./bview.do?bid=${bVo.bid }">${bVo.btitle }</a>
	        </td>
	        <td>${bVo.bname }</td>
	        <td>${bVo.bdate }</td>
	        <td>${bVo.bhit }</td>
	      </tr>
      </c:forEach>
      
    </table>
	<!-- 페이지 넘버링  -->
    <ul class="page-num">
      
	<c:if test="${page>startpage  }">
		<a href="blist.do?page=${startpage }"><li class="first"></li></a>      				
	</c:if>
	<c:if test="${page<startpage}">
		<li class="first"></li>      			      			
	</c:if>
 		
	<c:if test="${page>startpage  }">
		<a href="blist.do?page=${page-1 }&category=${category}&keyword=${keyword}"><li class="prev"></li></a>      				
	</c:if>
	<c:if test="${page<startpage}">
		<li class="prev"></li>      			      			
	</c:if>
	      
	      
	<c:forEach var="pageNum" begin="${startpage }" end="${endpage }">
		<c:if test="${pageNum==page }">
			<li class="num"><div>${pageNum }</div></li>	
		</c:if>
		<c:if test="${pageNum!=page }">
			<a href="blist.do?page=${pageNum }&category=${category}&keyword=${keyword}"><li class="num"><div>${pageNum }</div> </li></a>      			
		</c:if>
	</c:forEach>
  
	<c:if test="${page<maxpage  }">
		<a href="blist.do?page=${page+1 }&category=${category}&keyword=${keyword}"><li class="next"></li></a>      				
	</c:if>
	<c:if test="${page>maxpage}">
		<li class="next"></li>  			      			
	</c:if>
 	
	<c:if test="${page<maxpage  }">
		<a href="blist.do?page=${maxpage}&category=${category}&keyword=${keyword}"> <li class="last"></li></a>      				
	</c:if>
	<c:if test="${page>maxpage}">
		<li class="last"></li> 			      			
	</c:if>
    
    </ul>

    <a href="./bwrite.do"><div class="write">쓰기</div></a>
  </section>

</body>
</html>