package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEx2 {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Day16","root", "root@123");
			
			String query="insert into employees values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, 6);
			ps.setString(2, "Billu");
			ps.setInt(3, 106);
			ps.setDouble(4, 45000);
			int rows=ps.executeUpdate();
			System.out.println(rows+" row inserted");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
