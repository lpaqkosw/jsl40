<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Verification</title>
<script>
	
</script>
</head>
<body>
	<form name = "verification" method="post" action="user_verification">
		<input type="text" name="verinum">
		<input type="hidden" name="veripass" value="${veripass }">
		<input type="submit" value="go">
	</form>
</body>
</html>