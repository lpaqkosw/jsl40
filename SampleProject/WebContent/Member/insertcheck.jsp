<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:if test="${row == 0 }">
	<script>
		alert("회원가입 실패");
		history.back();
	</script>
</c:if>

<c:if test="${row == 1 }">
	<script>
		alert("회원가입 성공");
		alert("로그인 하십쇼");
		window.location.href = "index";
	</script>
	
</c:if>