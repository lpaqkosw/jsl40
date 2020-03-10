<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int row = (int)request.getAttribute("row");
	if(row ==1){
%>
<script>
	alert("success");
	location.href="MemList";
</script>
<%
	}else{
%>
<script>
	alert("failed");
	history.back();
</script>
<%
	}
%>
