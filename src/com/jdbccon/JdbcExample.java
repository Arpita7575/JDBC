package com.jdbccon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			//Loding driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","root");
			//String query = "insert into student3(id, name , age) values (101,'Atharv',14)";
			//String query = "insert into student3(id, name , age) values (102,'Yash',24)";
		//	String query = "insert into student3(id, name , age) values (103,'Neha',23)";
			//String query = "insert into student3(id, name , age) values (104,'Aruna',24)";
			String query = "select* from student3";

			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
			}
			//System.out.println(count + " table created successfuly");
			con.close();
//			Statement st = (Statement) con.createStatement();
//			st.execute();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

}
