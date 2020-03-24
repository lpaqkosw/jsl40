<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, model.*" %>

<%
	List<GroupVO> list = (List<GroupVO>)request.getAttribute("glist");
%>
    
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
	}
</style>
<script>
	function send(){
		if(insert.code.value==""){
			alert("제품코드를 입력하세요");
			return;
		}
		if(insert.pname.value==""){
			alert("제품명을 입력하세요");
			return;
		}
		if(insert.gcode.value=="0"){
			alert("그룹코드를 선택하세요");
			return;
		}
		insert.action="/product_insert";
		insert.submit();
	}

</script>
</head>
<body>
<h1 class="top">생산관리 등록화면</h1>
<table class="menu">
	<tr>
	<td colspan="2"><h2 class="submenu">생산관리 등록화면</h2></td>
	</tr>
	<form name = "insert" method="post" action="">
	<tr>
		<th>제품코드</th>
		<td><input type="text" name="code" value=""></td>
	</tr>
	<tr>
		<th>제품이름</th>
		<td><input type="text" name ="pname" value=""></td>
	</tr>
	<tr>
		<th>제품원가</th>
		<td><input type="text" name ="cost" value=""></td>
	</tr>
	<tr>
		<th>재고수량</th>
		<td><input type="text" name ="pnum" value=""></td>
	</tr>
	<tr>
		<th>목표수량</th>
		<td><input type="text" name ="jnum" value=""></td>
	</tr>
	<tr>
		<th>출고가</th>
		<td><input type="text" name ="sale" value=""></td>
	</tr>
	<tr>
		<th>그룹이름</th>
		<td>
		<select name="gcode" required>
		<option value="0"></option>
<% if(list.size() > 0){
	for(int i =0; i <list.size();i++){%>
			<option value="<%= list.get(i).getGcode()%>"><%=list.get(i).getGname() %></option>
<%}} %>
		</select>
		</td>
	</tr>
	</form>
	<tr>
		<td colspan="2" align="center">
			<button onclick="send()">등록</button>
			<button onclick="location.href='/product_main'">메인화면</button>
		</td>
	</tr>
</table>
</body>
</html>