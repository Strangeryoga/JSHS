import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UsingPreparedStatment {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement pstmt=con.prepareStatement("insert into info.student values(54,'tejas','dombivali')");
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("handled");
		}
	}

}
