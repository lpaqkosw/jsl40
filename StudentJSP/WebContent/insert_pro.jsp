<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection, java.sql.DriverManager, java.sql.SQLException ,java.sql.*" %>
<%!
	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "jsl40", "1234");
		return con;
	}

	public int insertStu(int bun, String name, String sex, int kor, int eng, int mat, String date){
		String sql = "insert into tbl_score_001 values(?,?,?,?,?,?,?)";
		int row = 0;
		Connection con =null;
		PreparedStatement ps = null;
		try{
		con = getConnection();
		ps = con.prepareStatement(sql);
		ps.setInt(1, bun);
		ps.setString(2, name);
		ps.setString(3, sex);
		ps.setInt(4, kor);
		ps.setInt(5, eng);
		ps.setInt(6, mat);
		ps.setString(7, date);
		row = ps.executeUpdate();
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(ps!=null)ps.close();
				if(con!=null)con.close();
				return row;
			}
			catch(Exception e2){
				e2.printStackTrace();
				return row;
			}
		}
	}
%>
<%
	request.setCharacterEncoding("utf-8");
	int bun = Integer.parseInt(request.getParameter("bun"));
	String name = request.getParameter("name");
	out.print(name);
	String sex = request.getParameter("sex");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int mat = Integer.parseInt(request.getParameter("mat"));
	String date = request.getParameter("date");
	
	int row = insertStu(bun,name,sex,kor,eng,mat,date);
	
%>

<% if(row == 0) {%>
	<script>
		alert("error");
		history.back();
	</script>
<%} else{%>
	<script>
		alert("등록되었습니다");
		location.href="./list.jsp";
	</script>
<%}%>