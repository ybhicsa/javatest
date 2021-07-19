<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>from</title>
		
		<style type="text/css">
			table,th,td {border: 1px solid black; border-collapse: collapse; }
		</style>
		
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function fromck() {
				
				alert("폼체크");
				
				if($("#mail1").val()==""){
					alert("이메일(아이디)가입력되지 않았습니다.");
					$("#mail1").focus();
					return;
				}
				
				if($("#pw").val() != $("#pwck").val() ){
					alert("비밀번호가 같지 않습니다.");
					$("#pw").focus();
					return;
				}
				
				
				
				return document.form.submit();
				
			}
		
		
		</script>
		
	</head>
	<body>
	
		<%
			request.setCharacterEncoding("utf-8");
		
			String mail1,mail2,pw,news,age,gender,marr,son,job,topics="";
			String[] topic;
			
			mail1 = request.getParameter("mail1");
			mail2 = request.getParameter("mail2");
			pw = request.getParameter("pw");
			news = request.getParameter("news");
			age = request.getParameter("age");
			gender = request.getParameter("gender");
			marr = request.getParameter("marr");
			son = request.getParameter("Son");
			job = request.getParameter("Job");
			topic = request.getParameterValues("Topic");
			
			for(int i=0;i<topic.length;i++){
				if(i==0)	topics = topic[i];
				else topics = topics+ ", "+ topic[i];
				
			}
			
		%>
	
		<form action="./formSe" method="post" name="form" id="form">
			<table>
				<tr>
					<th>이메일(아이디)</th>
					<td>
						<input type="text" name="mail1" id="mail1" value="<%=mail1%>">@
						<input type="text" name="mail2" id="mail2" value="<%=mail2%>">
					</td>				
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="text" name="pw" id="pw" value="<%=pw%>"></td>
				</tr>
				<tr>
					<th>비밀번호 확인</th>
					<td><input type="text" name="pwck" id="pwck" value="<%=pw%>"></td>
				</tr>
				<tr>
					<th>소식지 수신여부</th>
					<td>
					<label for="news">수신</label><input type="radio" name="news" id="news" value="수신">
					<label for="nonews">미수신</label><input type="radio" name="news" id="nonews" value="미수신">					
					</td>
				</tr>	
			</table>
			<br><br>
			<table>
				<tr>
					<th>관심연령</th>
					<td>
						<select name="age"> 
							<option value="상관없음" >상관없음</option>
							<option value="10대" >10대</option>
							<option value="20대" >20대</option>
							<option value="30대" >30대</option>
						</select>
					</td>
					<th>성별</th>
					<td>
						<label for="nogender">선택안함</label><input type="radio" name="gender" id="nogender" value="선택안함">
						<label for="male">남자</label><input type="radio" name="gender" id="male"  value="남자">
						<label for="female">여자</label><input type="radio" name="gender" id="female" value="여자">			
					</td>
				</tr>
				<tr>
					<th>결혼여부</th>
					<td>
						<label for="notmarr">선택안함</label><input type="radio" name="marr" id="notmarr" value="선택안함">
						<label for="marr">미혼</label><input type="radio" name="marr" id="marr" value="미혼">
						<label for="nomarr">기혼</label><input type="radio" name="marr" id="nomarr" value="기혼">						
					</td>
					<th>자녀유무</th>
					<td>
						<label for="notSon">선택안함</label><input type="radio" name="Son" id="notSon" value="선택안함"> 
						<label for="Son">없음</label><input type="radio" name="Son" id="Son" value="없음">
						<label for="noSon">있음</label><input type="radio" name="Son" id="noSon" value="있음">						
					</td>
				</tr>
				<tr>
					<th>직업</th>
					<td colspan="3">
						<select name="Job"> 
							<option value="상관없음" >상관없음</option>
							<option value="자영업" >자영업</option>
							<option value="회사원" >회사원</option>
							<option value="주부" >주부</option>
						</select>
					</td>
				</tr>
			</table>
			<br><br>
			<table>
				<tr>
					<td>관심있는주제</td>
					<td>
						<input type="checkbox" value="가정법률" name="Topic" id="1"><label for="1">가정법률</label> 
						<input type="checkbox" value="청소년교육" name="Topic" id="2"><label for="2">아동/청소년교육</label>
						<input type="checkbox" value="임대차" name="Topic" id="3"><label for="3">부동산/임대차</label> 
						<input type="checkbox" value="금융" name="Topic" id="4"><label for="4">금융/금전</label> 
						<input type="checkbox" value="사업" name="Topic" id="5"><label for="5">사업</label> 
						<input type="checkbox" value="창업" name="Topic" id="6"><label for="6"> 창업</label> 
						<br>
						<input type="checkbox" value="무역" name="Topic" id="7"><label for="7">무역/출입국</label> 
						<input type="checkbox" value="소비자" name="Topic" id="8"><label for="8">소비자</label> 
						<input type="checkbox" value="여가생활" name="Topic" id="9"><label for="9">문화/여가생활</label> 
						<input type="checkbox" value="민형사" name="Topic" id="10"><label for="10">민형사/소송</label>
						<input type="checkbox" value="교통" name="Topic" id="11"><label for="11">교통/운전</label> 
						<input type="checkbox" value="근로" name="Topic" id="12"><label for="12">근로/노동</label> 
						<br>
						<input type="checkbox" value="복지" name="Topic" id="13"><label for="13">복지</label>
						<input type="checkbox" value="국방" name="Topic" id="14"><label for="14">국방/보훈</label> 
						<input type="checkbox" value="정보통신" name="Topic" id="15"><label for="15">정보통신/기술</label> 
						<input type="checkbox" value="환경" name="Topic" id="16"><label for="16">환경/에너지/기술</label> 
						<input type="checkbox" value="사회안전" name="Topic" id="17"><label for="17">사회안전/범죄</label> 
						<input type="checkbox" value="지자체" name="Topic" id="18"><label for="18">국가 및 지자체</label> 
					
					</td>
				</tr>
			</table>
			
			<br>
			<input type="button" onclick="fromck()" value="전송">
		
		
		</form>
		
	
	
	
	
	
	
	
	
	</body>
</html>