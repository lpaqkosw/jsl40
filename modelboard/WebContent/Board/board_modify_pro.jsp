<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.*, java.util.*" %>
<%
request.setCharacterEncoding("utf-8");
BoardDAO dao = BoardDAO.getInstance();
BoardVO vo = new BoardVO();
vo.setIdx(Integer.parseInt(request.getParameter("idx")));
vo.setEmail(request.getParameter("email"));
vo.setContents(request.getParameter("contents"));
vo.setName(request.getParameter("name"));
vo.setPw(request.getParameter("pass"));
vo.setSubject(request.getParameter("subject"));
int row = dao.boardModify(vo);
if(row == 0){
%>
<script>
	alert("failed");
</script>
<%
response.sendRedirect("board_list.jsp");
}
else{
	response.sendRedirect("board_list.jsp");
}%>

	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>