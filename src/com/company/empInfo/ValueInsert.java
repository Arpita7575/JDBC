package com.company.empInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ValueInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stubz
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			
			String query = "select* from Employee";
			//String query = "insert into Employee(id , name ,salary ,depNo ,joiningDt ) Values (102,'Shreya',23000,32,'23.11.2023')";
			//String query = "insert into Employee(id , name ,salary ,depNo ,joiningDt ) Values (103,'Sneha',24000,33,'23.11.2022')";
			//String query = "insert into Employee(id , name ,salary ,depNo ,joiningDt ) Values (104,'Neha',25000,34,'23.11.2021')";

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
//			
//			Statement st=con.createStatement();
//			
//			int count = st.executeUpdate(query);
//			System.out.println(count + " Data inserted");
//			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
