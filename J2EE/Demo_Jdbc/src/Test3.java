import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement pstmt=con.prepareStatement("insert into info.student values(50,'tejas','dombivali')");
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("handled");
		}
	}
}
