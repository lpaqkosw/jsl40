<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		padding: 0;
		margin: 0;
	}
	
	button{
		padding: 30px;
		background-color: black;
		color: white;
		margin: 10px;
		width: 200px;
		overflow: hidden;
	}
	
	h1{
		text-align: center;
		padding-bottom: 50px;
		padding-top: 30px;
	}
	
	div{
		border: 1px solid;
		border-color: gray;
	}
	.menu{
		padding: 10px;
		border-color: gray;
		border: 1px solid;
		
	}
	
	h2{
		padding: 20px;
	}
	
	
	
</style>
</head>
<body>
<h1 class="top">생산관리 시스템</h1>
<table class="menu">

	<tr>
	<td><h2 class="submenu">생산관리 메인메뉴</h2></td>
	</tr>
	<tr>
	<td><button class="button" onclick="location.href='/product_insert'">제품입력</button></td>
	<td><button class="button" onclick="location.href='/product_modDelSel'">제품조회</button></td>
	<td><button class="button" onclick="location.href=''">우선생산제품</button></td>
	<td><button class="button" onclick="location.href=''">이익순위</button></td>
	<td><button class="button" onclick="location.href=''">그룹별재고수량</button></td>	
	</tr>
</table>
</body>
</html>