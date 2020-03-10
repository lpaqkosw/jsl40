<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = null;
	if(request.getParameter("name")!=null){
		name = request.getParameter("name");    		
	}
	
	String str = null;
	String userid = request.getParameter("userid");    
	String passwd = request.getParameter("passwd");    
	String gubun = request.getParameter("gubun");    
	String tel = request.getParameter("tel");    
	String email = request.getParameter("email");    
	String[] fa = request.getParameterValues("fa");    
	if(fa != null){
		str = fa[0];
		for(int x = 0; x < fa.length;x++){
			str = str+","+fa[x];
		}
	}
	String job = request.getParameter("job");    
	String intro = request.getParameter("intro");    
	if(fa==null){
		str = null;
	}
	else{
		
	}
    
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>