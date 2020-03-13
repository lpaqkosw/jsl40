<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.util.*, java.sql.*" %>
<%!

public static Connection getConnection() throws Exception{
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "jsl40", "1234");
	return con;
}

	class StuVO{
	int bun;
	String name;
	String sex;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	String grade;
	
	
}

	public List<StuVO> getList(){
		List<StuVO> list = new ArrayList<StuVO>();
		String sql = "select * from tbl_score_001";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				StuVO vo = new StuVO();
				vo.bun = rs.getInt("bun");
				vo.name = rs.getString("name");
				if(rs.getString("gender").equals("M")){
					vo.sex = "남자";
				}
				else{
					vo.sex="여자";
				}
				vo.kor = rs.getInt("kor");
				vo.eng = rs.getInt("eng");
				vo.mat = rs.getInt("mat");
				vo.tot = vo.kor+vo.eng+vo.mat;
				vo.avg = Math.round((vo.tot/3.0)*100)/100.0;
				switch((int)vo.avg/10){
				case 10:
				case 9:{
					vo.grade = "수";
					break;
				}
				case 8:{
					vo.grade = "우";
					break;
				}
				case 7:{
					vo.grade ="미";
					break;
				}
				case 6:{
					vo.grade="양";
					break;
				}
				default:{
					vo.grade="가";
				}
				}
				
				list.add(vo);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return list;
		}
		finally{
			try{
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(con!=null)con.close();
			}
			catch(Exception e2){
				e2.printStackTrace();
				
			}
			return list;
		}
	}



%>

<%
	request.setCharacterEncoding("utf-8");
	List<StuVO> list = getList(); 

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		margin:0;
		padding:0;
	}
	
	a{
		text-decoration: none;
	}
	
	.title{
		text-align: center;
		background-color: black;
		padding: 20px;
		color: white;
	}
	
	.navi{
		padding: 20px;
		background-color: gray;
		overflow: hidden;
		text-decoration: none;
		list-style: none;
	}
	
	.navi li{
		text-align: center;
		float:left;
		padding-right: 50px;
	}
	
	ul{
	}
	
	.section{
		background-color: white;
	}
	.sectionTitle{
		text-align: center;
		padding: 50px;
	}
	
	.footer{
		padding: 20px;
		background-color: black;
		
	}
	
	footer{
		padding: 10px;
		color: white;
		text-align: center;
		
	}
	
	.context{
		padding: 100px;
		padding-top: 30px;
	}
	
	table{
		margin: auto;
		padding-bottom: 100px;
		
	}
	
	td{
		text-align: center;
		width: 50px;
		border: 1px solid;
	}
	
	
</style>
</head>
<body>
	<div class="title">
	<header>
		<h1>(과정평가형 정보처리산업기사) 학생정적 관리 프로그램 ver 2009-06</h1>
	</header>

</div>
		<ul class="navi">
			<li><a href="./insert.jsp">학생정보등록</a></li>
			<li><a href="./list.jsp">학생성적조회</a></li>
			<li><a href="./index.jsp">홈으로</a></li>
		</ul>
<div class="section">
	
		<h2 class="sectionTitle">학생성적조회 화면</h2>
		<table>
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>성별</td>
				<td>국어</td>
				<td>영어</td>
				<td>수학</td>
				<td>총점</td>
				<td>평균</td>
				<td>등급</td>
			</tr>

<% if(list.size()>0){
	for(int i = 0; i < list.size();i++){

%>
			<tr>
				<td><%=list.get(i).bun %></td>
				<td><%=list.get(i).name %></td>
				<td><%=list.get(i).sex %></td>
				<td><%=list.get(i).kor %></td>
				<td><%=list.get(i).eng %></td>
				<td><%=list.get(i).mat %></td>
				<td><%=list.get(i).tot %></td>
				<td><%=String.format("%.2f",list.get(i).avg) %></td>
				<td><%=list.get(i).grade %></td>
			</tr>
<%}}

else{%>
	<tr>
		<td colspan="9">학생 없음</td>
	</tr>
	
<%} %>
		</table>
</div>

<div class="footer">
	<footer>
		HRDKOREA Copyright@2019 All rights reserved. Human Resources Develoment Service of Korea
	</footer>
</div>
</body>
</html>