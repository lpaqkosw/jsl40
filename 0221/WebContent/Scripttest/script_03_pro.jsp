<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("utf-8");

	String sex = request.getParameter("sex");
	String[] fav = request.getParameterValues("fav");
	String job = request.getParameter("job");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>Insert title here</title>
</head>
<body>
성별: <%= sex %><br>
취미: 
<%
for(int i = 0; i < fav.length; i++){
	out.print(fav[i]+", ");
}
%>
<br>

직업: <%= job %><br>
</body>
</html>