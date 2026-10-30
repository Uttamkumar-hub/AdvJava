package com.JDBC.mainMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main (String [] args) {
		final String URL="jdbc:mysql://localhost:3306/mydata87";
		final String username="root";
		final String password="Uttam@123";
		
//		String query= "insert into student values(4, 'Venkat', 99, 27, 'SDPT')";
//		String query ="update student set StLocation='Kukatpally' where StID=1";
		String query= "delete from student where StID=1";
		
//		             <-------Stage 1------>
		try {
			Connection connection = DriverManager.getConnection(URL, username, password);
			
//			          <-------Stage 2------>
			Statement st = connection.createStatement();
			
//                    <------Stage 3-------->
			int rows= st.executeUpdate(query);
			
			System.out.println(rows+": inserted....");
			connection.close();
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
	

		
		
	}

}
