package com.njclabs.mulesoft;

import java.sql.*;

public class inserting_data_to_table 
{
	public static void main(String[] args) throws Exception
	{   
		String dburl = "jdbc:mysql://localhost:3309/mulesoft";
		String uname = "root";
		String pass  = "admin";
		Connection con = null;
		
		String query = "INSERT INTO movies values('Titanic','Leonardo','Kate','James',1997)";
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(dburl,uname,pass);
		
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		
		System.out.println(count+" row/s affected/");
		
		st.close();
		con.close();
		
	}
}
