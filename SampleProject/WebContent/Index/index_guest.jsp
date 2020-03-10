<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


 <html>
 <head><meta http-equiv="Content-Type" content="text/html; charset=utf-8">
   <title> 메인 페이지</title>
   <link rel="stylesheet" type="text/css" href="/stylesheet.css">
   <style type="text/css">
     td.title { padding:4px; background-color:#e3e9ff }
     td.content { padding:10px; line-height:1.6em; text-align:justify; }
     a.list { text-decoration:none;color:black;font-size:10pt; }
   </style>
<script>
	if(${logincheck == '-1'}){
		alert("로그인 실패");
	}
	function check_login(){
		if(login_form.userid.value == ""){
			alert("아이디를 입력");
			return;
		}
		if(login_form.passwd.value == ""){
			alert("비번을 입력");
			return;
		}
		login_form.submit();
	}
	
	function searchsend(){
		searchkey.submit();
	}
	
	/*function goto_write(){
		if(${empty userName}){
			alert("로그인해주세요");
		}
		else{
			location.href = "guest_write";
		}
	}
	
	function goto_view(idx){
		if(${empty userName}){
			alert("로그인해주세요");
		}
		else{
			location.href = "GuestView?idx="+idx;
		}
	}
	*/
</script>
 </head>
 <body topmargin="0" leftmargin="0">
  <table border="0" cellspacing="2" bgcolor="#ecf1ef" width="900" bordercolordark="#ffffff" bordercolorlight="#000000">
   <tr>
     <td width="170px" rowspan="4" valign="bottom" bgcolor="#000000">
       <a href="index"><img src="./img/ceo.jpg" width="158" height="83" border="0"></a>
       <font style="font-size:9pt;color:white;font-family:돋움"><b>Total 136,489
       <font color="yellow"></font>
       | Now 178
       <font color="yellow"></font>
       </b></font>
     </td>
     <td bgcolor="#9966ff" width="10%" height="25" onmouseover="style.backgroundColor='#2772D3'" onmouseout="style.backgroundColor=''">
     <c:if test="${userName != '-1' && !(empty userName)}">
     <p align="center"><font color="white" size="2"><b><a href="logout?route=Guest" class="white">로그아웃</A></b></font></p>
     </c:if>
     <c:if test="${empty userName}">
     <p align="center"><font color="white" size="2"><b><a href="" class="white">로그인</A></b></font></p>
     </c:if>
     </td>
     <td bgcolor="#9966ff" width="10%" onmouseover="style.backgroundColor='#2772D3'" onmouseout="style.backgroundColor=''">
     <c:if test="${empty userName}">
     <p align="center"><font color="white" size="2"><b><a href="insert" class="white">회원가입</a></b></font></p>
     </c:if>
     <c:if test="${userName != '-1' && !(empty userName)}">
     <p align="center"><font color="white" size="2"><b><a href="userModify" class="white">정보수정</a></b></font></p>
     </c:if>
     </td>
     <td bgcolor="#9966ff" width="10%" onmouseover="style.backgroundColor='#2772D3'" onmouseout="style.backgroundColor=''">
     <p align="center"><font color="white" size="2"><b>공지사항</b></font></p>
     </td>
     <td bgcolor="#9966ff" width="10%" onmouseover="style.backgroundColor='#2772D3'" onmouseout="style.backgroundColor=''">
     <p align="center"><font color="white" size="2"><b><a href="Board">게시판</a></b></font></p>
     </td>
     <td bgcolor="#9966ff" width="10%" onmouseover="style.backgroundColor='#2772D3'" onmouseout="style.backgroundColor=''">
     <p align="center"><font color="white" size="2"><b><a href="" class="white">자료실</a></b></font></p>
     </td>
     <td bgcolor="#9966ff" width="10%" onmouseover="style.backgroundColor='#2772D3'" onmouseout="style.backgroundColor=''">
     <p align="center"><font color="white" size="2"><b><a href="Guest" class="white">방명록</a></b></font></p>
     </td>
     <td bgcolor="#9966ff" width="10%" onmouseover="style.backgroundColor='#2772D3'" onmouseout="style.backgroundColor=''">
     <p align="center"><font color="white" size="2"><b>겔러리</b></font></p>
     </td>
     <td bgcolor="#9966ff" width="10%" onmouseover="style.backgroundColor='#2772D3'" onmouseout="style.backgroundColor=''">
     <p align="center"><font color="white" size="2"><b>관리자</b></font></p>
     </td>
   </tr>                   
   <tr>
     <td colspan="8">
     <p><img src="./img/bar-01.gif" width="100%" height="1" border="0"></p>
     </td>
   </tr>
   <tr>
     <td colspan="8"><p><img src="./img/bar-01.gif" width="100%" height="1" border="0"></p></td>
   </tr>
   <tr>
     <td><p><b><span style="font-size:15pt;">&nbsp;Search</span></b></p></td>
     <form action="index_search" method="post" name="searchkey">
     <td colspan="5">
     <p>&nbsp;
       <Select name="genre" size="1">
         <option value="종합">공지사항
         <option value="board">게시판
         <option value="guest">방명록
         <option value="종합">자료실
       </Select>
       <Select name="item" size="1">
         <option value="name">작성자
         <option value="subject">제목
         <option value="contents">내용
       </Select>
         <input type="text" name="key" size="12">
         <input type="image" src="./img/search2.gif" onclick="searchsend()">
     </td>
     </form>
   </tr>
 </table>  
   <table border="0" width="800">
     <tr>
       <td width="20%"  height="500" bgcolor="#ecf1ef" valign="top">
 <c:if test="${empty userName}">
		 <table width="100%" height="120" border="0">
   <form name="login_form" action="login" method="post" >
   <input type="hidden" name="route" value="Guest">
     <tr>
       <td colspan="2" bgcolor="#6FA0E" height="20" align="center">
         <font size="2" color="white"><b>Member Login</b></font>
       </td>
     </tr>
     <tr>
       <td ><font size="2">아 이 디</font></td>
       <td ><input type="text" size="10" name="userid"></td>
     </tr>
     <tr>
       <td><font size="2">비밀번호</font></td>
			 <td>
         <input type="password" size="10" name="passwd">
       </td>
     </tr>
     <tr>
       <td><input type="image" src="./img/login1.gif" border="0" onClick="return check_login()"></td>
			 <td>
           <a href="insert"><img src="./img/regist.gif" border="0"></a>
       </td>
     </tr>
 </form>
 </table>
 </c:if>
 <!--  
 <table width="100%" height="120" border="0">
   <tr>
     <td bgcolor="#6FA0E" align="center" height="20">
       <font size="2" color="white">홍길동 님!</font>
     </td>
   </tr>
   <tr>
     <td align="center">
       <font size="2">
       <a href="adminpage.jsp">관리자 페이지</a><br>
       <a href="logout.jsp">로그오프</a><br>
       <a href="userinfo_view.jsp">회원정보수정</a><br>
       </font>
     </td>
   </tr>
 </table>
 -->
 <c:if test="${userName != '-1' && !(empty userName)}">
 <table width="170px" height="120" border="0">
   <tr>
     <td bgcolor="#6FA0E" align="center" height="20">
       <font size="2" color="white">${userName } 님!</font>
     </td>
   </tr>
   <tr>
     <td align="center">
       <font size="2">
       <a href="logout?route=Guest">로그오프</a><br>
       <a href="userModify">회원정보수정</a>
       <a href="userDelete">회원탈퇴</a>
       
       </font>
     </td>
   </tr>
 </table>
</c:if>
	   </td>
       <td width="80%" valign="top">&nbsp;<br>
       
<table border="0" width="800">
  <tr>
    <td width="80%" valign="top">	
    <br>
    <table border="0" cellspacing="1" width="100%" align="center">
      <tr>
        <td colspan="7" align="center" valign="center" height="20">
        <font size="4" face="돋움" color="blue">
        <img src="./img/bullet-01.gif"> <b>방 명 록</b></font></td></tr>
      <tr>
        <td colspan="5" align="right" valign="middle" height="20">
		<font size="2" face="고딕">전체 : ${cnt }</b>건 - ${page }/${totpage } Pages</font></td></tr>
 	   <tr bgcolor="e3e9ff">
 	      <td width="10%"align="center" height="20"><font face="돋움" size="2">번호</font></td>
 	      <td width="50%" align="center" height="20"><font face="돋움" size="2">제목</font></td>
 	      <td width="15%" align="center" height="20"><font face="돋움" size="2">글쓴이</font></td>
 	      <td width="15%" align="center" height="20"><font face="돋움" size="2">작성일</font></td>
 	      <td width="10%" align="center" height="20"><font face="돋움" size="2">조회수</font></td>
 	   </tr>
<c:if test="${cnt>0 }">
<c:forEach var="list" items="${list }">



			<tr onMouseOver="style.backgroundColor='#D1EEEE'" onMouseOut="style.backgroundColor=''">
        <td align="center" height="25">
        <font face="돋움" size="2" color="#000000">${listcount }</font></td>
        <td align="left" height="20">
        <font face="돋움" size="2" color="#000000">
		       <a href="GuestView?idx=${list.idx }">${list.subject }</a></td>
        <td align="center" height="20"><font face="돋움" size="2">
        <a class="list" href="mailto:ein1027@nate.com">${list.name }</a></font></td>
        <td align="center" height="20"><font face="돋움" size="2">${list.regdate }</font></td>
        <td align="center" height="20"><font face="돋움" size="2">${list.readcnt }</font></td>
      </tr>
      <c:set var="listcount" value="${listcount-1 }"></c:set>
</c:forEach>
</c:if>

<c:if test="${empty list }">
		<tr onMouseOver="style.backgroundColor='#D1EEEE'" onMouseOut="style.backgroundColor=''">
        <td align="center" height="25">
        <font face="돋움" size="2" color="#000000">${"등록된 자료 없음"}</font></td>
			<td align="left" height="20">&nbsp;
				<font face="돋움" size="2" color="#000000">
</c:if>

     <div align="center">
        <table width="700" border="0" cellspacing="0" cellpadding="5">
          <tr>&nbsp;</tr><tr>
             <td colspan="5">        
                <div align="center">${pageSkip }</div>
			  </td>
			 </tr>
			<tr align=right><td colspan="5">
				<a href="guest_write"><img src="./img/write.gif" border="0"></a>
			</td>
			</tr>
		</table>
		</div>
			

    </td>
  </tr>
  </table>
  </body>
  </html>


