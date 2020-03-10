<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:if test="${row == 1}">
<script>
	alert("modified");
	location.href("board_list");
</script>
</c:if>

<c:if test="${row == 0}">
<script>
	alert("pass incorrect");
	history.back();
</script>
</c:if>