<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="model.*, java.util.*" %>
<%
	request.setCharacterEncoding("utf-8");
	MemDAO dao = new MemDAO();
	List<MemVO> list = dao.memList();
%>
<html>
<head>
<title>회원목록 보여주기</title>

<STYLE TYPE="text/css">
<!--
body { font-family: 돋움, Verdana; font-size: 9pt}
td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000} 
--->
</STYLE>
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
	if(list.size()==0){
%>
	<tr>
      <td colspan="6"align=center>없음</td>
   </tr>
<%
	}else{
		for(int i = 0; i < list.size();i++){
%>
   <tr>
      <td align=center><%=list.get(i).getIdx() %></td>
      <td align=center><%=list.get(i).getUserid()%></td>
      <td align=center><%=list.get(i).getName() %></td>
      <td align=center><%=list.get(i).getTel() %></td>
      <td align=center><%=list.get(i).getFirst_time() %></td>
      <td align=center><%=list.get(i).getLast_time()%></td>
   </tr>
   
<%
		}}
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
          <input type="text" name="search_name" size=10> &nbsp;
          <input type=hidden name="user_id" >[조회]</a>
     </td>
   </tr>
  <tr>
    <td>
    </td>
    <td></td>
   </tr>
  <tr>
    <td><a href="MemLogin">로그인 페이지 이동</a>
    </td>
    <td><a href="MemInsert">회원가입페이지 이동</a></td>
   </tr>
</table>    
</body>
</html>
