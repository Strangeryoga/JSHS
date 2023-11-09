import java.sql.*;

public class Student {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connection established");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
//			Statement stmt=con.createStatement();
			
//			stmt.executeUpdate("insert into emp_info.employee values(333, 'Sandip', 'Developer', 'Washington')");
//			stmt.executeUpdate("insert into info.student values(20, 'Aniket', 'Alibagh')");
//			stmt.executeUpdate("delete from  emp_info.employee where id=356");
			
//			ResultSet res=stmt.executeQuery("DQL");
//			PreparedStatement pstmt=con.prepareStatement("insert into info.student values(23, 'Tejas', 'Alibagh')");
			
//			pstmt.executeUpdate();
			
			PreparedStatement pstmt=con.prepareStatement("insert into info.student values(?,?,?)");
			
			pstmt.setInt(1, 909);
			pstmt.setString(2, "tejas");
			pstmt.setString(3, "titwal");
			pstmt.execute();
		
		} catch (Exception e) {
			System.out.println("Hii buddy");
		}
	}

}
