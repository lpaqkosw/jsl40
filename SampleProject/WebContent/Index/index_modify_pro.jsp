<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:if test="${row == 1 }">
	<script>
		alert("수정되었습니다");
		alert("다시 로그인 해주세요");
		location.href="index";
	</script>
</c:if>

<c:if test="${row == 0 }">
	<script>
		alert("수정 실패");
		history.back();
	</script>
</c:if>