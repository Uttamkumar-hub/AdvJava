package com.JDBC.mainMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class resultSet {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/mydata87";
		final String username="root";
		final String password="Uttam@123";
		
		String query="select *from student";
		
		
		try {
			Connection connection= DriverManager.getConnection(URL, username, password);
			
			Statement st=connection.createStatement();
			
			ResultSet rs= st.executeQuery(query);
			
			System.out.println("StID \t StName  \t StMarks \t StAge  \t StLocation ");
			while(rs.next()) {
				int StID=rs.getInt(1);
				String StName=rs.getString(2);
				int StMarks=rs.getInt(3);
				int StAge=rs.getInt(4);
				String StLocation=rs.getString(5);
				System.out.println(StID+" \t"+StName+" \t\t"+StMarks+" \t \t"+StAge+" \t\t"+StLocation);
			}
			
//			rs.next();
			
			
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
