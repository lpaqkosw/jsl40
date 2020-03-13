<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${bool ==1 }">
	<script>
		alert("인증됬다");
		opener.form_name.verification.value = 1;
		self.close();
	</script>
</c:if>
<c:if test="${bool == 0 }">
	<script>
		alert("인증번호 불일치");
		history.back();
	</script>
</c:if>