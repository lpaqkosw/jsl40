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
		padding: 20px;
		background-color: black;
		color: white;
		margin: 10px;
		width: 100px;
	}
	
	h1{
		text-align: center;
		padding-bottom: 50px;
		padding-top: 30px;
	}
	
	.menu{
		padding: 10px;
		padding-left: 30px;
		margin: auto;
		border-collapse: collapse;
		width: 600px;
	}
	
	th{
		width: 200px;
		
	}
	
	h2{
		padding: 20px;
		text-align: center;
	}
	
	table, th, td{
		border: 1px solid;
		border-color: gray;
		padding: 5px;
		text-align: center;
	}

	
	
</style>
</head>
<body>
<h1 class="top">이익 순위</h1>
<table class="menu">
	<tr>
	<td colspan="2"><h2 class="submenu">이익 순위</h2></td>
	</tr>
	<tr>
		<td>제품명</td>
		<td>총이익 금액</td>
	</tr>
	
	<tr>
		<td></td>
		<td></td>		
	</tr>
	
	<tr>
		<td colspan="2" align="center">
		<button onclick="location.href='/product_main'">메인화면</button>
		</td>
	</tr>
</table>
</body>
</html>