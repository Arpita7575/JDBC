import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
			
			//String query = "create table stud(id int, name varchar(20))";
//			String query = "insert into stud value (101,'ABC')";
		//	String query = "insert into stud value (102,'xyz')";
		//	String query = "update stud SET name='pqr' where id = 101";
		//	String query = "delete from stud where id=102";
			//String query = "insert into stud value (103,'Neha')";
			String query = "insert into stud value (104,'Atharv')";
			Statement st=con.createStatement();
			
			
			st.executeUpdate(query);
			System.out.println("inserted");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

