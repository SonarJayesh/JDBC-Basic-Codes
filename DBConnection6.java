import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

class DBConnection6{

	public static void main(String[] args){

		try{
			//step1 Register the Driver
				Driver d = new oracle.jdbc.driver.OracleDriver();
				DriverManager.registerDriver(d);
				System.out.println("Driver Register Succesfully!!");

			//Step2 Get Connection
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","Jayesh");
				System.out.println("Connection Succesfully Done!!");

			//step3 Create Statement Object
				//Statement stmt = con.createStatement();

				PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?)");
				System.out.println("Statement object Created!!");

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Id and Name: ");
				int id = sc.nextInt();
				String name = sc.next();

				pstmt.setInt(1,id);
				pstmt.setString(2,name);

 			//step4 Exicute the Query
				//stmt.executeUpdate("create table student(id number(3),name varchar2(10))");
				//stmt.executeUpdate("insert into student values("+id+",'"+name+"')");	
				

				pstmt.executeUpdate();
				System.out.println("Query Exicuted!!..");
			
			//step5 Close Connection
				con.close();	
			
		}
		catch(SQLException ex)
		{
			System.out.println("Error in Connection");
		}
	
	}
}