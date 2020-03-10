<%@ page contentType="text/html; charset=UTF-8" import="model.*, java.util.*" %>

<%
	List<MemberVO> list = (List)request.getAttribute("list");
	String qr = request.getParameter("qr");
%>

<html>
<head>
<title>회원목록 보여주기</title>

<STYLE TYPE="text/css">
<!--
body 	{ font-family: 돋움, Verdana; font-size: 9pt}
td   	{ font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000} 
a 	 	{text-decoration: none }
#smx	{ color : #f00; }
--->
</STYLE>
<script>

	function _search()
	{
		var tt;
		
		switch (document.getElementsByName("search_gubun")[0].selectedIndex)
		{
			case 0:
				tt = "nm";
				break;
			case 1:
				tt = "ad";
				break;
		}
		location.href = "userinfo_list?t=" + tt + "&qr=" + document.getElementsByName("search_name")[0].value;
	}


</script>
</head>
<body>
<table width="550" border="1" cellspacing="0" cellpadding="2" bordercolorlight="#173E7C" bordercolordark="white">
  <tr>
    <td width=50 align=center>번호</td>
    <td width=50 align=center>ID</td>
    <td width=80 align=center>이름</td>
    <td width=100 align=center>전화번호</td>
    <td width=100 align=center>등록일자</td>
    <td width=100 align=center>최근접속일</td>
    
  </tr>
  
<%
  	if (null == list)
  	{
%>
	<tr><td colspan=6>등록된 정보가 없습니다.</td></tr>
<%
  	}
  	else
  	{
		for (MemberVO vo : list)
		{
%>
  
   <tr>
      <td align=center><%=vo.getIdx() %></td>
      <td align=center><%=vo.getUserid() %></td>
      <td align=center><%=vo.getName() %></td>
      <td align=center><%=vo.getTel() %></td>
      <td align=center><%=vo.getFirst_time() %></td>
      <td align=center><%=vo.getLast_time() %></td>
   </tr>
   
<%
		}
  	}
%>
 
</table>
<table width=550>
  <tr>
    <td>
      <select name="search_gubun">
        <option >이름 </option>
        <option >주소 </option>
        
    </td>
    <td>  찾는이름:
          <input type="text" name="search_name" size=10 value="<%= qr != null ? qr : "" %>"> &nbsp;
          <a href="#" onClick="_search()">
				<input type=hidden name="user_id" >[조회]
          </a>
     </td>
   </tr>
  <tr>
    <td>
    </td>
    <td></td>
   </tr>
  <tr>
<% 
	MemberVO vo = (MemberVO)session.getAttribute("user");

  	if (null == vo)
  	{
%>
    <td>
    	<a href="userlogin_form" style="color:#00f">로그인 페이지 이동</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="userinfo_insert" style="color:#00e">회원 가입 페이지 이동</a>
    </td>
<%
  	}
  	else
  	{
%>
    <td>
    	<a href="logout" style="color:#f00">로그아웃</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="userinfo_modify" style="color:#f00">회원 정보 수정 이동</a>
    </td>
<%
  	}
%>
   </tr>
</table>    
</body>
</html>
