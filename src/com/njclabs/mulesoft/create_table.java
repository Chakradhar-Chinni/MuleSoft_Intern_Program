package com.njclabs.mulesoft;

import java.sql.*;

public class create_table 
{
	public static void main(String[] args) throws Exception
	{
		String dburl = "jdbc:mysql://localhost:3309/mulesoft";
		String uname = "root";
		String pass  = "admin";
		Connection con = null;
		
		String query = "CREATE TABLE movies( " + 
				"movie_name VARCHAR(20)," + 
				" actor VARCHAR(20), " + 
				" actress VARCHAR(20), " + " director VARCHAR(20), " +  "Release_Year INT )";
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(dburl,uname,pass);
		
		Statement st = con.createStatement();              
		int status = st.executeUpdate(query);
		
		System.out.print(status);
	}
}
