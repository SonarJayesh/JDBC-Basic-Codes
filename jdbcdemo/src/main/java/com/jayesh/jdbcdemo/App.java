package com.jayesh.jdbcdemo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


	public class App {
		
		public static void main(String[] args) {
		
			try {
	    	//step1 Register the Driver
				Driver d = new com.mysql.cj.jdbc.Driver();
				DriverManager.registerDriver(d);
				System.out.println("Driver Register Successfully!!");
	        
		    //Step2 Get the Connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","Jayesh");
				System.out.println("Connection Succsfully Done.. ");
				
				
			//step3 Create Statement Object
			//Statement stmt = con.createStatement();

				PreparedStatement pstmt = con.prepareStatement("insert into studentinfo values(?,?,?,?)");
				System.out.println("Statement object Created!!");

				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the Id: ");
				int id = sc.nextInt();
				
				System.out.println("Enter the Name: ");
				String name = sc.next();
				
				System.out.println("Enter the Email: ");
				String email = sc.next();
				
				System.out.println("Enter the contactNo: ");
				String contactno = sc.next();
				
				pstmt.setInt(1,id);
				pstmt.setString(2,name);
				pstmt.setString(3, email);
				pstmt.setString(4, contactno);

 			//step4 Exicute the Query
				//stmt.executeUpdate("create table student(id number(3),name varchar2(10))");
				//stmt.executeUpdate("insert into student values("+id+",'"+name+"')");	
				

				pstmt.executeUpdate();
				System.out.println("Query Exicuted!!..");
				
			//step5 close the Connection	
				con.close();
		}
		catch(SQLException ex) {
			
			System.out.println("Error in Connection!!"+ ex);
		}	

   }
}
