package com.njclabs.mulesoft;

import java.sql.*;

public class connect_to_db 
{
	public static void main(String[] args) throws Exception
	{
		String dburl = "jdbc:mysql://localhost:3309/";
		String uname = "root";
		String pass  = "admin";
		Connection con = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(dburl,uname,pass);
		  
		if(con!=null)		{
			System.out.print("Database is Connected with the Java Applicaton");		}
		else {
			System.out.print("DB is not connected. Check the Code");
		}
	}
}
