package day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DeleteEmp {
	public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Day17",
                    "root",
                    "root@123");
            String query = "DELETE FROM Employee WHERE emp_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 105);
            int rows = ps.executeUpdate();
            System.out.println(rows + " Record Deleted");
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}
