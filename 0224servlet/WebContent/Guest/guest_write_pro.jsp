<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
<%
	int row = (int)request.getAttribute("row");
	if(row ==1){
%>		
<script>
	alert("등록성공");
	location.href="list.do";
</script>
<%
	}else{
		
%>
<<script type="text/javascript">
	alert("등록실패");
	history.back();
</script>

<%
	}

%>


<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
결과: ${row }
</body>
</html>