package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchDataEx {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Day16","root", "root@123");
			
			Statement st=con.createStatement();
			String query="SELECT * from Employees";
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next()) {
				int id=rs.getInt("emp_id");
				String name=rs.getString("emp_name");
				double salary=rs.getDouble("salary");
				System.out.println(id + " " + name + " " + salary);
				
			}
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
			
		}

}
