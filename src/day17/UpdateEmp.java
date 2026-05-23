package day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class UpdateEmp {
	public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Day17",
                    "root",
                   "root@123");
           String query =
                    "UPDATE Employee SET salary=? WHERE emp_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDouble(1, 80000);
            ps.setInt(2, 101);
            int rows = ps.executeUpdate();
            System.out.println(rows + " Record Updated");
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}
