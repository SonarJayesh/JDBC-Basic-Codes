import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) {
     
        try{

        
            // Step1 Register the Driver
                Driver driver = new oracle.jdbc.driver.OracleDriver();
                DriverManager.registerDriver(driver);
                System.out.println("Driver Register Succesfully!!!");
            // Step2 Get the Connection
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","Jayesh");
                System.out.println("Connection succesfully Done!!!");
            
            // Step 3 Create Statement Object
			
                Statement stmt = connection.createStatement();
			    System.out.println("Statement Object Created...");

            //Step 4 Execute the Query
                //stmt.executeUpdate("create table StudentInfo(id number(3),name varchar2(10))");
			    //stmt.executeUpdate("insert into StudentInfo values(6,'Darshan')");
			    System.out.println("Query Executed...");

            // Close Connection
                connection.close();

                
            }catch(SQLException ex){

                    System.out.println("Error in Connection....."+ex.getMessage());
                }
    }
}