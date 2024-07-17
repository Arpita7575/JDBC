package com.company.empInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			
			String query = "create table Employee(id int, name varchar(20),salary int,depNo int,joiningDt date)";
			Statement st=con.createStatement();
			st.execute(query);
			System.out.println("Table created");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
