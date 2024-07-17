import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
//import java.util.*;


public class PreparedStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int id;
		String name;
		System.out.println("Enter the student id");
		id=sc.nextInt();
		System.out.println("Ener student name");
		name=sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
			String query="insert into db.studcopy values(?,?)";
			PreparedStatement pt=con.prepareStatement(query);
			pt.setInt(1,id);
			pt.setString(2,name);
			pt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
