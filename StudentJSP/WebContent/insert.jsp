<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		margin:0;
		padding:0;
	}
	
	a{
		text-decoration: none;
	}
	
	.title{
		text-align: center;
		background-color: black;
		padding: 20px;
		color: white;
	}
	
	.navi{
		padding: 20px;
		background-color: gray;
		overflow: hidden;
		text-decoration: none;
		list-style: none;
	}
	
	.navi li{
		text-align: center;
		float:left;
		padding-right: 50px;
	}
	
	ul{
	}
	
	.section{
		background-color: white;
	}
	.sectionTitle{
		text-align: center;
		padding: 50px;
	}
	
	.footer{
		padding: 20px;
		background-color: black;
		
	}
	
	footer{
		padding: 10px;
		color: white;
		text-align: center;
		
	}
	
	.context{
		padding: 100px;
		padding-top: 30px;
	}
	
	.formtable{
		margin: auto;
		padding-bottom: 100px;
	}
	th,td{
		border: 1px solid;
	}
	
	th{
		width: 100px;
	}
	
	td{
		width: 400px;
	}
	
	.buttons{
		text-align: center;
	}
	
	
</style>
<script>
	
	function dateVal(){
		var date = new Date();
		console.log(date.getFullYear());
		dateStr = date.getFullYear() +''+ (date.getMonth()+1) +''+ date.getDate()+'';
		console.log(dateStr);
		insert.date.value=dateStr;
		
	}
	function cancel(){
		insert.reset();
	}
	
	function send(){
		console.log(insert.name.value.length);
		if(insert.bun.value==""){
			alert("번호가 입력되지 않았습니다");
			return;
		}
		if(isNaN(insert.bun.value)){
			alert("번호의 입력이 잘못되었습니다");
			return;
		}
		if(parseInt(insert.bun.value) > 9999 || parseInt(insert.bun.value) < 1000){
			alert("번호의 입력이 잘못되었습니다");
			return;
		}
		if(insert.name.value==""){
			alert("이름이 입력되지 않았습니다");
			return;
		}
		if(insert.name.value.length > 3){
			alert("이름의 입력이 잘못되었습니다");
			return;
		}
		if(insert.sex.value==""){
			alert("성별이 입력되지 않았습니다");
			return;
		}
		
		if(insert.kor.value=="" || insert.eng.value=="" || insert.mat.value==""){
			alert("점수가 입력되지 않았습니다");
			return;
		}
		if(parseInt(insert.kor.value)<0 || parseInt(insert.kor.value)>100 || isNaN(insert.kor.value)){
			alert("점수의 입력이 잘못되었습니다");
			return;
		}
		if(parseInt(insert.eng.value)<0 || parseInt(insert.eng.value)>100 || isNaN(insert.eng.value)){
			alert("점수의 입력이 잘못되었습니다");
			return;
		}
		if(parseInt(insert.mat.value)<0 || parseInt(insert.mat.value)>100 || isNaN(insert.mat.value)){
			alert("점수의 입력이 잘못되었습니다");
			return;
		}
		
		insert.action="insert_pro.jsp";
		insert.submit();
	}

</script>
</head>

<body onload="dateVal()">
<div class="title">
	<header>
		<h1>(과정평가형 정보처리산업기사) 학생정적 관리 프로그램 ver 2009-06</h1>
	</header>

</div>
		<ul class="navi">
			<li><a href="./insert.jsp">학생정보등록</a></li>
			<li><a href="./list.jsp">학생성적조회</a></li>
			<li><a href="./index.jsp">홈으로</a></li>
		</ul>
<div class="section">
	<h2 class="sectionTitle">학생성적관리 프로그램</h2>
	
	
	<form action="" method="post" name="insert">
	<table class="formtable">
		<tr>
			<th>번호</th>
			<td><input type="text" name="bun">(4자리:1101)</td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>성별</th>
			<td><input type="radio" name="sex" value="M">남자
				<input type="radio" name="sex" value="F">여자
			</td>
		</tr>
		<tr>
			<th>국어</th>
			<td><input type="text" name="kor">(0~100)</td>
		</tr>
		<tr>
			<th>영어</th>
			<td><input type="text" name="eng">(0~100)</td>
		</tr>
		<tr>
			<th>수학</th>
			<td><input type="text" name="mat">(0~100)</td>
		</tr>
		<tr>
			<th>등록일자</th>
			<td><input type="text" name="date"  value="" readonly></td>
		</tr>		
		<tr>
			<td colspan="2" class="buttons">
			<input type="button" value="등록하기" onclick="send()">
			<input type="button" value="다시쓰기" onclick="cancel()">
			</td>
		</tr>
	</table>
	</form>
		
	
</div>

<div class="footer">
	<footer>
		HRDKOREA Copyright@2019 All rights reserved. Human Resources Develoment Service of Korea
	</footer>
</div>
</body>
</html>