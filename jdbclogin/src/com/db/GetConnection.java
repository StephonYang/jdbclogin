package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
//achieve connection
	public static final String driver="com.mysql.jdbc.Driver";
	public static final String url="jdbc:mysql://127.0.0.1:3306/users";
	public static Connection GetConnection(){
		Connection con=null;
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url, "root", "123456");
			System.out.println("连接成功");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return con;
	}
	
		
	

}
