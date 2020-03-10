<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:if test="${row == 0 }">
	<script>
		alert("password not match");
		history.back();
	</script>
</c:if>

<c:if test="${row ==1 }">
	<script>
		location.href="Board";
	</script>
</c:if>