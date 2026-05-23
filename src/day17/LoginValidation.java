package day17;
import java.sql.*;
import java.util.Scanner;
public class LoginValidation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username:");
        String uname = sc.next();
        System.out.println("Enter Password:");
        String pass = sc.next();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Day17",
                    "root",
                    "root@123");
            String query = "SELECT * FROM Users WHERE username=? AND password=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, uname);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid Username or Password");
            }
            con.close();
           sc.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
