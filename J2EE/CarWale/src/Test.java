import java.sql.*;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			Statement stmt=con.createStatement();

//			ResultSet res=stmt.executeQuery("Select * from emp_info.employee ");
//			stmt.executeUpdate("insert into carinfo.latestcars values('TEMP899','ALTO','2002',38992)");
//			stmt.execute("insert into carinfo.latestcars values('TEMP900','Bugatti','2023',157500)");
//			stmt.execute("insert into carinfo.latestcars values('TEMP911','Mustang','2022',829388)");
//			stmt.execute("insert into carinfo.latestcars values('TEMP912','Ferrari','2029',923992)");
//			stmt.executeUpdate("insert into carinfo.list_cars values('TEMP899','ALTO','2002',38992)");
//			stmt.execute("insert into carinfo.list_cars values('TEMP900','Bugatti','2023',157500)");
//			stmt.execute("insert into carinfo.list_cars values('TEMP911','Mustang','2022',829388)");
//			stmt.execute("insert into carinfo.list_cars values('TEMP912','Ferrari','2029',923992)");
//			stmt.execute("insert into carinfo.list_cars values('TEMP600','Swift','2015',505000)");
//			stmt.execute("insert into carinfo.list_cars values('TEMP91','Artiga','2018',92399)");
			


			

		} catch (Exception e) {
			System.out.println("handled");
			
		}
	}

}
