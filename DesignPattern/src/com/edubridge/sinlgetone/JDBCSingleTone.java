package com.edubridge.sinlgetone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleTone {
	private static JDBCSingleTone jdbc;
	private JDBCSingleTone() {}
	public static JDBCSingleTone getInstance() {
		if (jdbc==null) {
			jdbc=new JDBCSingleTone();
			
		}
		return jdbc;
	}
	private static Connection getConnection()throws ClassNotFoundException, SQLException{
	Connection Con=null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/singletone", "root","root");
	return Con;
}
	
	
//Insert
	public int insert(String name,String pass, int id)throws SQLException{
	Connection c=null;
	PreparedStatement ps=null;
	int recordCounter=0;
	try {
		c=this.getConnection();
	ps=c.prepareStatement("insert into employee(eid,uname,upass)values(?,?,?);");
	ps.setInt(1, id);
	ps.setString(2,  name);
	ps.setString(3, pass);
	recordCounter=ps.executeUpdate();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		if(ps!=null) {
			ps.close();
	}
	if(c!=null) {
		c.close();
	}
	
}
	return recordCounter;	
	}
	
	
	
//View
	public void view()throws SQLException{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	try {
		con=this.getConnection();
		ps=con.prepareStatement("select * from employee");
		
		rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("Id"+rs.getInt(1)+"Name= "+rs.getNString(2)+"\t"+"Password= "+rs.getString(3));
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		if(rs!=null) {
		rs.close();
		}
		if(ps!=null) {
			ps.close();			
		}
		if(con!=null) {
			con.close();
			}
		}
	}
	
	

//Update
	public int update(String uname,int id,String password)throws SQLException {
	Connection c=null;
	PreparedStatement ps=null;
	int recordCounter=0;
	
	try {
		c=this.getConnection();
		ps=c.prepareStatement("update employee set uname=?, upass=? where eid=?; ");
		ps.setString(1, uname);
		ps.setString(2,  password);
		ps.setInt(3,  id);
		recordCounter=ps.executeUpdate();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		if(ps!=null) {
			ps.close();
		}
		if(c!=null) {
			c.close();
		}
			
	}
	return recordCounter;
}
		
	
	
	
//Delete
	public int delete(int userid) throws SQLException {
	Connection c=null;
	PreparedStatement ps=null;
	int recordCounter=0;
	try {
		c=this.getConnection();
		ps = c.prepareStatement("delete from employee where eid='"+userid+"'");
		int recordCounter1 = ps.executeUpdate();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		if(ps!=null) {
			ps.close();
		}
		if(ps!=null) {
			ps.close();			
		}
		if(c!=null) {
			c.close();
		}
			
	}
	return recordCounter;
}
 private Connection getConnection1() {
	return null;
}

}


