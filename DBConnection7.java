import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

class DBConnection7{

	public static void main(String[] args){
		
		try{
		    //Step1 Register the Driver
			Driver d = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			System.out.println("Driver Register Successfully!!");

		    //Step2 Get the Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","Jayesh");
			System.out.println("Connection Succsfully Done.. Connection Id:= "+con);

		    //Step3 Created Statement Object 
			Statement stmt = con.createStatement();
			System.out.println("Statement Object Created...");
			
		    //Step4 Exicute the Query
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
			
				
 		    //Step5 Close Connection
			con.close();		
	
		}
		catch(SQLException ex){
			System.out.println("Error in Connection!!");
		}
	}
}