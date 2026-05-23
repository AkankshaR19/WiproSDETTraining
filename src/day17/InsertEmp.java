package day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class InsertEmp {
	public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Day17",
                    "root",
                    "root@123");
            String query = "INSERT INTO Employee VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 101);
            ps.setString(2, "Rahul");
            ps.setString(3, "IT");
            ps.setDouble(4, 65000);
            ps.executeUpdate();
            
            ps.setInt(1, 102);
            ps.setString(2, "Priya");
            ps.setString(3, "HR");
            ps.setDouble(4, 45000);
            ps.executeUpdate();

            ps.setInt(1, 103);
            ps.setString(2, "Aman");
            ps.setString(3, "Finance");
            ps.setDouble(4, 72000);
            ps.executeUpdate();

            ps.setInt(1, 104);
            ps.setString(2, "Neha");
            ps.setString(3, "IT");
            ps.setDouble(4, 55000);
            ps.executeUpdate();

            ps.setInt(1, 105);
            ps.setString(2, "Riya");
            ps.setString(3, "Marketing");
            ps.setDouble(4, 48000);
            ps.executeUpdate();

            System.out.println("5 Records Inserted Successfully");
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
