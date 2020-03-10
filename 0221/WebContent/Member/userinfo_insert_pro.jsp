<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	String repasswd = request.getParameter("repasswd");
	String gubun = request.getParameter("gubun");
	String zip = "     "+request.getParameter("zip");
	String addr1 = request.getParameter("addr1");
	String addr2 = request.getParameter("addr2");
	String tel = request.getParameter("tel");
	String email = request.getParameter("email");
	String job = request.getParameter("job");
	String intro = request.getParameter("intro");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function back(){
		
	}
</script>
</head>
<body>
이름: &nbsp;<%= name %> <br>
아이디: &nbsp;<%= userid %> <br>
비번: &nbsp;<%= passwd %> <br>
확인비번: &nbsp;<%= repasswd %> <br>
주소구분: &nbsp;<%= gubun %> <br>
우편번호: &nbsp;<%= zip %> <br>
주소: &nbsp;<%= addr1 %> <br>
나머지주소: &nbsp;<%= addr2 %> <br>
전화번호: &nbsp;<%= tel %> <br>
이메일: &nbsp;<%= email %> <br>
관심분야: 
<%
try{
	String[] hobby = request.getParameterValues("fa");
	for(int i = 0; i < hobby.length;i++){
		if(i!=hobby.length-1){
			out.print(hobby[i]+", ");	
		}
		else{
			out.print(hobby[i]);
		}	
	}
}
catch(Exception e){
	
}

%> <br>
직업: &nbsp;<%= job %><br>
자기소개: &nbsp;<%= intro %> <br>

<a href="userinfo_insert.jsp"><input type="button" value="뒤로가기"></a> 
</body>
</html>