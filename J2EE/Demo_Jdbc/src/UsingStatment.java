//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//
//import com.mysql.cj.xdevapi.Statement;
//
//public class UsingStatment {
//	
//	public static void main(String[] args) {
//		try {
//			//Load and Register the Driver class
//			Class.forName("com.mysql.jdbc.Driver");
//			
//			//Establish the connection with the database
//			String url="jdbc:mysql://localhost:3306";
//			String name="root";
//			String pass="root";
//			Connection con=DriverManager.getConnection(url,name,pass);
//			
//			//Creating a platform or statment
////			Statement stmt=con.createStatement();
//			String sql="select * from student";
//			
//			//Execute the sql queries of the statment
////			ResultSet result=((java.sql.Statement)).executeQuery(sql);
//			
//			//Process the resultant data from the database
////			while(result.next()) {
////				System.out.println("name: "+ result.getInt("id"));
////				System.out.println("address: "+result.getString("address"));
////				System.out.println("mno: "+result.getString("mno"));
////				System.out.println("name: "+result.getString("name"));
////			}
////			
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////	}
//
////}
