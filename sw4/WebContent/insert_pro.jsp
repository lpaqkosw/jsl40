<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	int row = (int)request.getAttribute("row");

	if(row==0){
%>
	<script>
		alert("등록실패");
		history.back();
	</script>
	<%} else{%>
	<script>
		alert("등록되었습니다");
		location.href="/product_main";
	</script>
	<%}%>