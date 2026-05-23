package day17;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class StoredProcedureEx {
	public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Day17",
                    "root",
                    "root@123");
            CallableStatement cs =
                    con.prepareCall("{call SearchEmployee(?)}");
            cs.setInt(1, 101);
            ResultSet rs = cs.executeQuery();
            while(rs.next()) {
                System.out.println(
                        rs.getInt("emp_id") + " " +
                        rs.getString("emp_name") + " " +
                        rs.getDouble("salary"));
            }
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}
