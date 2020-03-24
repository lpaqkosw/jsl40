<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="sample.model.board.*" %>
<%
	BoardDAO dao = BoardDAO.getInstance();
	int cnt = dao.countBoard();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>SampleMVC Project</h3>
<%=cnt %>
</body>
</html>