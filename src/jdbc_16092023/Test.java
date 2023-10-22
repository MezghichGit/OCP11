package jdbc_16092023;

import java.sql.*;

public class Test {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zooocp11","root","");
		System.out.println(conn);
		
		//Statement stmt = conn.createStatement();
		
		//String sql = "insert into animal(espece,age) values('poisson',2)";
		
		//String sql = "delete from animal where age <=3 ";
		
		//String sql = "update animal set espece ='toto' where id='3'";
		
		//int id = stmt.executeUpdate(sql);
		
		//System.out.println("Inserted : "+id);
		
		/*
		ResultSet rs = stmt.executeQuery("select * from animal");
		while(rs.next())
		{
			int id = rs.getInt("id");
			String espece = rs.getString("espece");
			int age = rs.getInt("age");
			
			System.out.println("ID = "+id+" | Espece = "+espece+" | Age = "+age);
		}
		*/
		
		//Statement stmt = conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select espece from animal");
		
		rs.next();
		rs.previous();
		rs.previous();
		rs.next();
		rs.next();
		rs.absolute(2);
		System.out.println(rs.getString(1));
		/*rs.afterLast();
		System.out.println(rs.previous()); // true
		
		System.out.println(rs.getInt(1)); //4 
		System.out.println(rs.previous()); // true
	    System.out.println(rs.getInt(1)); // 1
	    System.out.println(rs.last()); // true 
	    System.out.println(rs.getInt(1)); //     
	    System.out.println(rs.first()); // 
	    System.out.println(rs.getInt(1)); // 
	    rs.beforeFirst();*/
	   // System.out.println(rs.getInt(1)); // throws SQLException 

		
	
	}

}

