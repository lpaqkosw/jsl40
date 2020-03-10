<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>회원등록</title>
<STYLE TYPE="text/css">
<!--
body { font-family: 돋움, Verdana; font-size: 9pt}
td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000; BACKGROUND-POSITION: left top; BACKGROUND-REPEAT: no-repeat;}
-->
.formbox {
	BACKGROUND-COLOR: #F0F0F0; FONT-FAMILY: "Verdana", "Arial", "Helvetica", "돋움"; FONT-SIZE:9pt
} 
--->
</STYLE>
<script>

	function chkArray(s)
	{
		for (i=0;i<s.length;++i)
		{
			if (s[i].checked)
				return true;
		}
		
		return false;
	}
	
	function id_check()
	{
		window.open("id_check","id_check form","width=350 height=260");
	}

	function check()
	{
		if (form_name.name.value.length < 1)
		{
			alert("성명은 필수 입력 사항 입니다.");
			form_name.name.focus();
			return;
		}

		if (!/^\S{1,}$/.test(form_name.name.value))
		{
			alert("성명은 빈칸없이 입력하세요.");
			form_name.name.focus();
			return;
		}
		
		if (!/^[a-z0-9]{5,16}$/.test(form_name.userid.value))
		{
			alert("아이디는 5 ~ 16자 이내의 영문이나 숫자만 가능합니다.");
			form_name.userid.focus();
			return;
		}
	
		if (!/^[a-z0-9]{6,12}$/.test(form_name.passwd.value))
		{
			alert("비밀번호는 6 ~ 12자 이내의 영문이나 숫자만 가능합니다");
			form_name.passwd.focus();
			return;
		}
		
		if (form_name.passwd.value != form_name.repasswd.value)
		{
			alert("비밀번호가 일치하지 않습니다.");
			form_name.passwd.focus();
			return;
		}
		
		if (form_name.tel.value.length < 1)
		{
			alert("전화번호는 필수 입력 사항 입니다.");
			form_name.tel.focus();
			return;
		}
		
		if (!/^01(0|1|7|9)-\d{3,4}-\d{4}$/.test(form_name.tel.value))
		{
			alert("전화번호 형식이 맞지 않습니다. 다시 입력하세요.");
			form_name.tel.focus();
			return;
		}
		
		if (!/^[a-zA-Z0-9]{1,16}@[a-z]{1,5}.([a-z]{1,3}?(.[a-z]{1,3}))$/.test(form_name.email.value))
		{
			alert("이메일 형식이 맞지 않습니다. 다시 입력하세요.");
			form_name.email.focus();
			return;
		}
		
		if (!chkArray(form_name.fa))
		{
			alert("관심분야는 최소 1개 이상 선택하세요.");
			return;
		}
		
		if (form_name.job.selectedIndex == 0)
		{
			alert("직업을 선택하세요.");
			form_name.job.focus();
			return;
		}
		
		if (form_name.intro.value.length < 5)
		{
			alert("자기소개는 최소 5자 이상 써야 됩니다.");
			form_name.intro.focus();
			return;
		}
		
		form_name.submit();
	}
	
	function post_check()
	{
		window.open("post_check", "우편번호 검색", "width=350 height=250 scrollbars=yes");	
	}


</script>
</head>

<body bgcolor="#FFFFFF" LEFTMARGIN=0  TOPMARGIN=0 >
 
 <!-- 탑 메뉴 영역 삽입-->


<table border="0" width="800">
<tr>
  <td width="20%"  bgcolor="#ecf1ef" valign="top" style="padding-left:0;">
	
	<!--로그인 영역 삽입-->

  </td>
  <td width="80%" valign="top">&nbsp;<img src="Member/img/title1.gif" ><br>    
	<form name=form_name method=post action="userinfo_insert">
	<table border=0 cellpadding=0 cellspacing=0 border=0 width=730 valign=top>
		<tr><td align=center><br>                            
			<table cellpadding=0 cellspacing=0 border=0 width=650 align=center>       
				<tr>
					<td bgcolor="#7AAAD5">            
						<table cellpadding=0 cellspacing=0 border=0 width=100%>
							<tr bgcolor=#7AAAD5>
								<td align=left BORDER="0" HSPACE="0" VSPACE="0"><img src="Member/img/u_b02.gif"></td>
								<td align=center bgcolor="#7AAAD5"><FONT COLOR="#FFFFFF"><b>사용자등록&nbsp;</b><font color=black>(</font><font color=red>&nbsp;*&nbsp;</font><font color=black>표시항목은 반드시 입력하십시요.)</font></FONT></td>
								<td align=right BORDER="0" HSPACE="0" VSPACE="0"><img src="Member/img/u_b03.gif"></td>
							</tr>
						</table>
						<table cellpadding=3 cellspacing=1 border=0 width=100%>
							<tr>
								<td width=110 bgcolor=#EFF4F8>&nbsp;회원 성명<font color=red>&nbsp;*</font></td>
								<TD BGCOLOR=WHITE>
									<input type=text name=name size=16 maxlength=20 value="">성명은 빈칸없이 입력하세요.
								</td>
							</tr>
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;회원 ID<font color=red>&nbsp;*</font></td>
								<TD BGCOLOR=WHITE>
									<table cellspacing=0 cellpadding=0>
										<tr>
											<td align=absmiddle>
												<input type=text name=userid size=12 maxlength=16 value="" style="width:120" readonly>
											</td>
											<td>
                  			<a href="#" onClick="id_check()"><img src="Member/img/u_bt01.gif" hspace=2 border=0 name=img1  align=absmiddle></a>
                   		5~16자 이내의 영문이나 숫자만 가능합니다.
                  		</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;비밀번호<font color=red>&nbsp;*</font></td>
								<TD BGCOLOR=WHITE>
								<input type=password name=passwd size=8 maxlength=12 style="width:80">
                 6~12자 이내의 영문이나 숫자만 가능합니다.
								</td>
							</tr>
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;비밀번호확인<font color=red>&nbsp;*</font></td>
								<TD BGCOLOR=WHITE><input type=password name=repasswd size=8 maxlength=12 value="" style="width:80">비밀번호 확인을 위해서 비밀번호를 한번 더 입력해주세요. </td>
							</tr>
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;주소구분<font color=red>&nbsp;</font></td>
								<TD BGCOLOR=WHITE>
									<input type=radio name=gubun value=1 checked>직장&nbsp;&nbsp;
									<input type=radio name=gubun value=2>자택 
								</td>
							</tr>
							
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;우편번호<font color=red>&nbsp;</font></td>
								<TD BGCOLOR=WHITE>
									<table cellspacing=0 cellpadding=0>
										<tr>
											<td>
                  				<input type=text name=zip size=6 maxlength=6 >
                  		</td>
                  		<td>
      						<a href="#" onclick="post_check()">
      									<img src="Member/img/u_bt07.gif" hspace=2 border=0 name=img2 align=absmiddle>
      									</a>
 											</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;주소<font color=red>&nbsp;</font></td>
								<TD BGCOLOR=WHITE>
									<input type=text name=addr1 size=50 maxlength=100 value="">
								</td>
							</tr>
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;나머지 주소<font color=red>&nbsp;</font></td>
								<TD BGCOLOR=WHITE>
									<input type=text name=addr2 size=50 maxlength=100 value="">
								</td>
							</tr>
							<tr>
               <TD BGCOLOR="#EFF4F8">&nbsp;전화번호<font color=red>&nbsp;*</font></td>
                <TD BGCOLOR=WHITE>
                  <input type=text name=tel size=13 maxlength=13 value="">
               </td>
              </tr>
              <tr>
                <TD BGCOLOR="#EFF4F8">&nbsp;E-mail
                	<font color=red>&nbsp;</font>
                </td>
                <td bgcolor=WHITE valign=middle>
                  <input type=text name=email size=30 maxlength=30 value="">
                </td>
              </tr>
              <tr>
                <TD BGCOLOR="#EFF4F8">&nbsp;관심분야
                	<font color=red>&nbsp;</font>
                </td>
								<td bgcolor=WHITE valign=middle> 
									<input type="checkbox" name="fa" value="건강">건강 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="checkbox" name="fa" value="문화예술">문화예술 &nbsp;&nbsp;
									<input type="checkbox" name="fa" value="경제">경제 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="checkbox" name="fa" value="연예오락">연예오락 &nbsp;
									<input type="checkbox" name="fa" value="뉴스">뉴스
									<br><input type="checkbox" name="fa" value="여행레져">여행레져 &nbsp;&nbsp;
									<input type="checkbox" name="fa" value="생활">생활 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="checkbox" name="fa" value="스포츠">스포츠 &nbsp;&nbsp;
									<input type="checkbox" name="fa" value="교육">교육 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="checkbox" name="fa" value="컴퓨터">컴퓨터 &nbsp;&nbsp;
									<input type="checkbox" name="fa" value="학문">학문 &nbsp;&nbsp;
								</td>
              </tr>
              <tr>
                <TD BGCOLOR="#EFF4F8">&nbsp;직업<font color=red>&nbsp;</font></td>
                <TD BGCOLOR=WHITE>
                  <select name=job class="formbox">
 										<option value="0">선택하세요 ---
 										<option value="1">회사원
 										<option value="2">연구전문직
 										<option value="3">교수학생
 										<option value="4">일반자영업
 										<option value="5">공무원
 										<option value="6">의료인
 										<option value="7">법조인
 										<option value="8">종교.언론/예술인
 										<option value="9">농/축/수산/광업인
 										<option value="10">주부
 										<option value="11">무직
 										<option value="12">기타
									</select>
								</td>                
              </tr>
              <tr>
                <TD BGCOLOR="#EFF4F8">&nbsp;자기소개<font color=red>&nbsp;</font></td>
                <TD BGCOLOR=WHITE>
                  <textarea cols=65 rows=5 name="intro"></textarea>
                </td>
              </tr>
            </table>
            <table cellpadding=0 cellspacing=0 border=0 width=100%>
              <tr bgcolor=#7AAAD5>
                <td valign=bottom>
                  <img src="Member/img/u_b04.gif" align=left hspace=0 vspace=0 border=0>
                </td>
                <td align=center></td>
                <td valign=bottom>
                  <img src="Member/img/u_b05.gif" align=right hspace=0 vspace=0 border=0>
                </td>
              </tr>
              <tr bgcolor=#ffffff>
                <td colspan=3 align=center>
                  <a href="#" onClick="check()"><img src="Member/img/u_bt06.gif" vspace=3 border=0 name=img3></a>
                  <a href="#" onClick="form_name.reset()"><img src="Member/img/u_bt05.gif" border=0 hspace=10 vspace=3 name=img4></a>
                </td>
              </tr>
            </table> 
          </td>
        </tr>
      </td>
    </tr>
	</table>
	</form>
	</td>
</tr>
</table>

 <!-- copyright 영역 삽입-->
  

</body>
</html>
