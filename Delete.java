import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

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

                stmt.executeUpdate("delete from StudentInfo where id=6");
			    System.out.println("Query Executed...");

             
            // Close Connection
                connection.close();

                
            }catch(SQLException ex){

                    System.out.println("Error in Connection....."+ex.getMessage());
                }
    }
}