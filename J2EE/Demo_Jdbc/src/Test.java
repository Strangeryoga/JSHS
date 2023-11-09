import java.sql.*;


public class Test {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); //FQCN
			System.out.println("Driver class loaded and registered");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root"); //URL
			System.out.println("Connection built");
			
			Statement stmt=con.createStatement();
			System.out.println("Platform created..!!!!!!");
			
			stmt.executeUpdate("DML Query");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Catched");
			
		}
		
	
	}

}
