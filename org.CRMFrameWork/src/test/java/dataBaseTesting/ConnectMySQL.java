/**
 * 
 */
package dataBaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySQL {

	@Test
	public void testDB() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		System.out.println("Driver loaded");

		Connection con = DriverManager.getConnection("jdbc:mysql://hostname:3306/orangeHRM", "root", "Mohan");

		System.out.println("Connected to MYSQL DB");

		Statement smt = con.createStatement();
		
		ResultSet rs = smt.executeQuery("select * from orangeHRM");
		
		while(rs.next()){
			
			String uname = rs.getString("username");
			
			System.out.println(uname);
			
			String pass = rs.getString("password");
			
			System.out.println(pass);
		}
	}

}
