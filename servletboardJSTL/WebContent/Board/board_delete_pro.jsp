<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int row = (int)request.getAttribute("row");
	if(row ==1){
%>
<script>
	alert("deleted");
	opener.location.replace("board_list");
	self.close();
</script>
<%} else{
%>
<script>
	alert("pass incorrect");
	history.back();
</script>
<%}%>