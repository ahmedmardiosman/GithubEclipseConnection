package jdbcdemo;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {

		try {

			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test3", "ahmedmardiosman","aerospace");
			
			Statement myStmt = myConn.createStatement();
			
			
			ResultSet myRs = myStmt.executeQuery("SELECT * From Scores");
			
			while(myRs.next()) {
				System.out.println(myRs.getString("name")+ ", " +myRs.getString("class_id"));
			}
			
			

		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
