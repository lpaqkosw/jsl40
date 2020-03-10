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
	
	function board_write(){
		if(${empty userName}){
			alert("로그인해주세요");
			return;
		}
		else{
			location.href = "board_write";
		}
	}
	
	function board_view(idx){
		if(${empty userName}){
			alert("로그인해주세요");
			return;
		}
		else{
			location.href = "board_view?idx="+idx;
		}
	}
	
	function send(){
		if(boardmodify.name.value == ""){
			alert("필수사항을 입력 하세요");
			return
		}
		if(boardmodify.subject.value == ""){
			alert("필수사항을 입력 하세요");
			return
		}
		if(boardmodify.contents.value == ""){
			alert("필수사항을 입력 하세요");
			return
		}
		if(boardmodify.pass.value == ""){
			alert("필수사항을 입력 하세요");
			return
		}
		
		boardmodify.submit();
	}
	
	function searchsend(){
		searchkey.submit();
	}
</script>
 </head>
 <body topmargin="0" leftmargin="0">
  <table border="0" cellspacing="2" bgcolor="#ecf1ef" width="900" bordercolordark="#ffffff" bordercolorlight="#000000">
   <tr>
     <td width="20%" rowspan="4" valign="bottom" bgcolor="#000000">
       <a href="index"><img src="./img/ceo.jpg" width="158" height="83" border="0"></a>
       <font style="font-size:9pt;color:white;font-family:돋움"><b>Total 136,489
       <font color="yellow"></font>
       | Now 178
       <font color="yellow"></font>
       </b></font>
     </td>
     <td bgcolor="#9966ff" width="10%" height="25" onmouseover="style.backgroundColor='#2772D3'" onmouseout="style.backgroundColor=''">
     <c:if test="${userName != '-1' && !(empty userName)}">
     <p align="center"><font color="white" size="2"><b><a href="logout?route=Board" class="white">로그아웃</A></b></font></p>
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
     <p align="center"><font color="white" size="2"><b><a href="usermodify" class="white">정보수정</a></b></font></p>
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
       <td width="170px"  height="500" bgcolor="#ecf1ef" valign="top">
 <c:if test="${empty userName}">
		 <table width="100%" height="120" border="0">
   <form name="login_form" action="index" method="post" >
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
       <a href="logout?route=Board">로그오프</a><br>
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
   <td width="80%" valign="top">&nbsp;<br>
     <img src="./img/bullet-01.gif"><font size="3" face="돋움" color="blue"> <b>반갑습니다</b></font>
     <font size="2"> - 글쓰기</font><p>
     <img src="./img/bullet-03.gif"><font size="2" face="돋움" color="orange"> 잠깐</font> &nbsp;
     <img src="./img/bullet-02.gif"><font size="2" face="돋움">는 필수 입력 사항입니다.</font><p>
     <form method="post" name="boardmodify" action="board_modify">
	<input type="hidden" name="idx" value="${vo.idx }">
	  <table border="0">
       <tr>
         <td width="5%" align="right"><img src="./img/bullet-02.gif"></td>
         <td width="15%"><font size="2 face="돋움"">글쓴이</font></td>
         <td width="80%">
         <input type="text" size="20" name="name" value="${vo.name }"></td>
       </tr>
       <tr>
         <td align="right">&nbsp;</td>
         <td ><font size="2 face="돋움"">메일주소</font></td>
         <td>
          <input type="text" size="20" name="email" value=${vo.email }></td>
       </tr>
	   <tr>
         <td align="right"><img src="./img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">제목</font></td>
         <td><input type="text" size="60" name="subject" value="${vo.subject }"></td>
       </tr>
       <tr>
         <td align="right"><img src="./img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">내용</font></td>
         <td><textarea wrap="physical" rows="10" name="contents" cols="60">${vo.contents }</textarea></td>
       </tr>
	   <tr>
         <td align="right"><img src="./img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">비밀번호</font></td>
          <td><input type="password" size="10" name="pass" ><font size="2" face="돋움">*.수정과 삭제시 꼭 입력하셔야 합니다.</font></td>
        </tr>
        <tr></tr>
		<tr>
          <td align="right">&nbsp;</td>
          <td><font size="2">&nbsp;</font></td>
          <td>
                     <a href="javascript:send()"><img src="./img/save.gif" border=0></a>&nbsp;&nbsp;&nbsp;
                     <a href="#"><img src="./img/cancle.gif" border=0></a>
          </td>
        </tr>
      </table>
      </form>
    </td>
  </tr>
  </table>
			

    </td>
  </tr>
  </table>
  </body>
  </html>

  하단 메뉴

