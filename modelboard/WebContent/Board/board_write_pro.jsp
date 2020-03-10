<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.*, java.util.*" %>
<%
request.setCharacterEncoding("utf-8");
BoardDAO dao = BoardDAO.getInstance();
BoardVO vo = new BoardVO();

vo.setEmail(request.getParameter("email"));
vo.setContents(request.getParameter("contents"));

vo.setIp(request.getRemoteAddr());
vo.setName(request.getParameter("name"));
vo.setPw(request.getParameter("pass"));


vo.setSubject(request.getParameter("subject"));
int row = dao.boardWrite(vo);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>