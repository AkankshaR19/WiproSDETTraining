package day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class CountEmp {
	 public static void main(String[] args) {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/Day17",
	                    "root",
	                    "root@123");
	            String query = "SELECT COUNT(*) FROM Employee";
	            Statement st = con.createStatement();
	            ResultSet rs = st.executeQuery(query);
	            if(rs.next()) {
	                System.out.println(
	                        "Total Employees : " + rs.getInt(1));
	            }
	            con.close();
	        } catch(Exception e) {
	            System.out.println(e);
	        }
	    }
}
