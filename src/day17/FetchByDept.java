package day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class FetchByDept {
	public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Day17",
                    "root",
                    "root@123");
            String query =
                    "SELECT * FROM Employee ORDER BY department";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                System.out.println(
                        rs.getString("department") + " " +
                        rs.getString("emp_name"));
            }
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
