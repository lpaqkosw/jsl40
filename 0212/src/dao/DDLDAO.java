package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.db.DBManager;

public class DDLDAO {
	DBManager manager = DBManager.getInstance();
    Connection conn = null;
    PreparedStatement pstmt= null;
    ResultSet rs = null;
    
    public int tabCreate() throws Exception {
    	StringBuffer query = new StringBuffer();
    	int row=-1;
    	query.append("create table aaa(");
    	query.append("dno number(2), dname varchar2(3) not null, regdate date, score number(3), primary key(dno))");
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query.toString());
    	row = pstmt.executeUpdate();
    	
    	pstmt.close();
    	conn.close();
    	
		return row;
    }
    
    public int insertAAA(int dno, String dname, String date,int score) throws Exception{
    	String query = "insert into aaa values (?,?,?,?)";
    	
    	conn=manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	pstmt.setInt(1, dno);
    	pstmt.setString(2, dname);
    	pstmt.setString(3, date);
    	pstmt.setInt(4, score);
    	
    	int row = pstmt.executeUpdate();
    	
    	pstmt.close();
    	conn.close();
    	
    	return row;
    }
    
    public int aaaUpdate(int dno, String dname, int score) throws Exception{
    	String query = "update aaa set dname=?, score =? where dno=?";
    	conn= manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	pstmt.setString(1, dname);
    	pstmt.setInt(2, score);
    	pstmt.setInt(3, dno);
    	int row = pstmt.executeUpdate();
    	
    	pstmt.close();
    	conn.close();
    	return row;
    }
    
    public int aaaDelete(int dno) throws Exception{
    	String query = "delete from aaa where dno =?";
    	conn = manager.getConnection();
    	pstmt = conn.prepareStatement(query);
    	pstmt.setInt(1, dno);
    	int row = pstmt.executeUpdate();
    	
    	pstmt.close();
    	conn.close();
    	return row;
    }
}
