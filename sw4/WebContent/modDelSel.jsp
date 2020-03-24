<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, model.*" %>
<%
	ProductVO vo = null;
	String code = "";
	String pname = "";
	String cost = "";
	String jnum = "";
	String pnum= "";
	String sale= "";
	String gcode="";
	if(request.getAttribute("vo")!=null){
		vo = (ProductVO)request.getAttribute("vo");
		code = vo.getCode();
		pname =  vo.getPname();
		cost = Integer.toString(vo.getCost());
		jnum = Integer.toString(vo.getJnum());
		pnum = Integer.toString(vo.getPnum());
		sale = Integer.toString(vo.getSale());
		gcode=vo.getGcode();
	}
	
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

<script type="text/javascript">
	function sel(){
		if(input.code.value=""){
			alert("제품코드 입력하세요");
			return;
		}
		input.option.value="1";
		input.action = "/product_modDelSel";
		input.submit();
	}
	
	function del(){
		input.option.value="3";
		input.action="/product_modDelSel";
		input.submit();
	}
	
	function mod(){
		if(input.pname.value==""){
			alert("제품명을 입력하세요");
			return;
		}
		if(input.gcode.value==""){
			alert("그룹을 선택하세요");
			return;
		}
		input.option.value="2";
		input.action="/product_modDelSel";
		input.submit();
	}

</script>
</head>
<body>
<h1 class="top">생산관리 등록화면</h1>
<table class="menu">
	<tr>
	<td colspan="2"><h2 class="submenu">생산관리 등록화면</h2></td>
	</tr>
	<form name = "input" method="post" action="">
	<tr>
		<th>제품코드</th>
		<td><input type="text" name="code" value="<%= code%>"></td>
	</tr>
	<tr>
		<th>제품이름</th>
		<td><input type="text" name ="pname" value="<%= pname%>"></td>
	</tr>
	<tr>
		<th>제품원가</th>
		<td><input type="text" name ="cost" value="<%= cost%>"></td>
	</tr>
	<tr>
		<th>재고수량</th>
		<td><input type="text" name ="pnum" value="<%= pnum%>"></td>
	</tr>
	<tr>
		<th>목표수량</th>
		<td><input type="text" name ="jnum" value="<%= jnum%>"></td>
	</tr>
	<tr>
		<th>출고가</th>
		<td><input type="text" name ="sale" value="<%= sale%>"></td>
	</tr>
	<tr>
		<th>그룹이름</th>
		<td>
		<select name="gcode" required>
		<option value="0"></option>
<% if(list.size() > 0){
	for(int i =0; i <list.size();i++){%>
			<option value="<%= list.get(i).getGcode()%>" <%if(gcode.equals(list.get(i).getGcode())){ %> selected <%}%>><%=list.get(i).getGname() %></option>
<%}} %>
		</select>
		</td>
	</tr>
	<input type="hidden" name="option" value="">
	</form>
	<tr>
		<td colspan="2">
		<button onclick="sel()">조회</button>
		<button onclick="mod()">수정</button>
		<button onclick="del()">삭제</button>
		<button onclick="location.href='/product_main'">메인화면</button>
		</td>
	</tr>
</table>
</body>
</html>