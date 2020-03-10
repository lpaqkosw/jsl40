<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int row = (int)request.getAttribute("row");
	if(row ==1){
%>
<script>
	alert("modified");
	location.href("board_list");
</script>
<%} else{
%>
<script>
	alert("pass incorrect");
	history.back();
</script>
<%}%>