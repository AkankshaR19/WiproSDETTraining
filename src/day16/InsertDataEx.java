package day16;
import java.sql.*;
public class InsertDataEx {
	public static void main(String[] args) {
		try {			
			String url = "jdbc:mysql://localhost:3306/Day16";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Day16","root", "root@123");
			
			Statement st=con.createStatement();
			String query="insert into employees values(5, 'Deva', 105, 30000)";
			int rows = st.executeUpdate(query);
			System.out.println(rows+" row inserted");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
