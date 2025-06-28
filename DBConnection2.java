import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


class DBConnection2{

	public static void main(String[] args){
		try{
			//step1 Register the Driver

			Driver d = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			System.out.println("Driver Register Succesfully!!");

			//step2 Get Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","Jayesh");	
			System.out.println("Connection is Succsfully Done.. Connection Id:="+con);	

	
		}
		catch(SQLException ex)
		{
			System.out.println("Error in Database Connection!!");
		}
	}	
}