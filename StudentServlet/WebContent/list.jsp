<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
	
	.n avi{
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
		position: fixed;
		left: 0;
		bottom: 0;
		width: 100%;
		
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
	
	table{
		margin: auto;
		padding-bottom: 100px;
		
	}
	
	td{
		text-align: center;
		width: 50px;
		border: 1px solid;
	}
	
	
</style>
</head>
<body>
	<div class="title">
	<header>
		<h1>(과정평가형 정보처리산업기사) 학생정적 관리 프로그램 ver 2009-06</h1>
	</header>

</div>
		<ul class="navi">
			<li><a href="/insert">학생정보등록</a></li>
			<li><a href="/list">학생성적조회</a></li>
			<li><a href="/index">홈으로</a></li>
		</ul>
<div class="section">
	
		<h2 class="sectionTitle">학생성적조회 화면</h2>
		<table>
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>성별</td>
				<td>국어</td>
				<td>영어</td>
				<td>수학</td>
				<td>총점</td>
				<td>평균</td>
				<td>등급</td>
			</tr>

<c:if test="${!empty list }">
	<c:forEach var="list" items="${list }">
			<tr>
				<td>${list.bun }</td>
				<td>${list.name }</td>
				<td>${list.sex }</td>
				<td>${list.kor }</td>
				<td>${list.eng }</td>
				<td>${list.mat }</td>
				<td>${list.tot }</td>
				<td><fmt:formatNumber value="${list.avg}" pattern=".00"/></td>
				<td>${list.grade }</td>
			</tr>
			</c:forEach>
			</c:if>

<c:if test="${empty list }">
	<tr>
		<td colspan="9">학생 없음</td>
	</tr>
	</c:if>

		</table>
</div>

<div class="footer">
	<footer>
		HRDKOREA Copyright@2019 All rights reserved. Human Resources Develoment Service of Korea
	</footer>
</div>
</body>
</html>