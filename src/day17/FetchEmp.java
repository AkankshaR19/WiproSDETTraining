package day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class FetchEmp {
	public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Day17",
                    "root",
                    "root@123");
            String query = "SELECT * FROM Employee WHERE salary > ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDouble(1, 50000);
            ResultSet rs = ps.executeQuery();                    
            while(rs.next()) {
                System.out.println(
                        rs.getInt("emp_id") + " " +
                        rs.getString("emp_name") + " " +
                        rs.getString("department") + " " +
                        rs.getDouble("salary"));
            }
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
