package com.njclabs.mulesoft;

import java.sql.*;

public class create_database 
{
	public static void main(String[] args) throws Exception
	{ 
        String query = "CREATE DATABASE mulesoft"; 
		String dburl = "jdbc:mysql://localhost:3309/";
		String uname = "root";
		String pass  = "admin";
		
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(dburl,uname,pass);
		
		Statement st = con.createStatement();
		int status = st.executeUpdate(query);
		
		System.out.print(status);
	}
}
