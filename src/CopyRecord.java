import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CopyRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
			
			String query="Select * from stud";
			Statement st=con.createStatement();
			Statement st1=con.createStatement();
			
			ResultSet rs=st.executeQuery(query);
		   
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name=rs.getString(2);
				System.out.println(id+" "+name);
				String query1 = "insert into studcopy(id,name) values('"+id+"','"+name+"')";
				st1.executeUpdate(query1);
			}
			System.out.println("Record added successfully");
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
