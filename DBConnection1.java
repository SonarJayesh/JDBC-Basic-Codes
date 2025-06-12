import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


class DBConnection1{

	public static void main(String[] args){
		try{
			//step1 Register the Driver

			Driver d = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			System.out.println("Driver Register Succesfully!!");
		}

		catch(SQLException ex)
		{
			System.out.println("Error in Database Connection!!");
		}
	}	
}