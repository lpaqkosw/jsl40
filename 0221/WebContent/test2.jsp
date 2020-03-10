<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//jsp objects = request, response, out, application, context, page....
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");
	String id = request.getParameter("id");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
나이 = <%= age %> <br>
성별 = <%= gender %> <br>
아이디 = <%= id %> <br>
</body>
</html>