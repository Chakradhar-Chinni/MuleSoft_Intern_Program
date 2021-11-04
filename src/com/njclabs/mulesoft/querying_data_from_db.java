package com.njclabs.mulesoft;

import java.sql.*;

public class querying_data_from_db 
{
	public static void main(String[] args) throws Exception    
	{
		String dburl = "jdbc:mysql://localhost:3309/mulesoft"; 
		String uname = "root";
		String pass  = "admin"; 
		Connection con = null; 
		
		String query = "SELECT * FROM movies"; 
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(dburl,uname,pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			String data = rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getInt(5);
			System.out.println(data);			
		}
		
		st.close();
		con.close();
	}
}
