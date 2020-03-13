<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		margin: 0;
		padding: 0;
	}
	
	a{
		text-decoration: none;
	}
	
	header{
		padding: 40px;
		background-color: black;
		color: white;
	}
	
	.navi li{
		float: left;
		text-align: center;
		padding-right: 80px;
	}
	
	.navi{
		padding: 15px;
		overflow: hidden;
		background-color: gray;
	}
	
	ul{
		list-style: none;
		text-decoration: none;
	}
	
	.content h2{
		text-align: center;
		padding: 50px;
	}
	
	.content p {
		padding: 15px;
	}
	
	
	footer{
		position: fixed;
		width: 100%;
		left:0;
		bottom:0;
		padding-top: 10px;
		padding-bottom: 10px;
		background-color: black;
		color: white;
		text-align: center;
	}
	
	.top h1{
		padding: 20px;
		text-align: center;
	}
	
</style>
</head>
<body>
	<div class="top">
		<header>
			<h1> (과정평가형 정보처리 산업기사) 학생성적 관리 프로그램 ver 2009-06</h1>
		</header>
		<ul class="navi">
			<li>학생성적등록</li>
			<li>학생성적조회</li>
			<li>홈으로</li>
		</ul>
	</div>
	
	<div class="content">
		<section>
			<h2> 과정평가형 자격 CBQ</h2>
		</section>
		<p>
		<br>
		국가직무능력 표준ㅁㄴ;ㅣ아러ㅣ;ㅏㅁ넝리ㅏㅁ;ㅓㄴ이;ㅏ러ㅣㅏㄴ;ㅁ어리;ㅏㅁㄴㅇ<br>
		<br>ㅁ나ㅣㅇ;ㅓ리;ㅏㅁ넝라ㅣ;ㅓㅁㄴ아ㅣ;러<br>
		<br>ㅁ나ㅣ얼;ㅣㅏㅁ넝리ㅏ;ㅁ넝리ㅏ;ㅁ너아ㅣㄹ;<br>
		<br>미ㅏ넝;ㄹ;ㅣㅏㅁ넝리ㅏ;ㅁ너ㅣㅏㅇ;러ㅣㅏ;ㅁㄴ얼<fmt:formatNumber value="12341234.126" pattern="0,000.00"></fmt:formatNumber><br>
		</p>
	</div>
	
	<div class="bot">
		<footer>HRDKOREA Copyright@2019 All rights reserved. Human Resources Development Service of Korea</footer>
	</div>
</body>
</html>