package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.GetConnection;
import com.entity.Users;

public class UserDao {
	private Connection con;
	private PreparedStatement pst;
	String sql="";
	boolean i=false;
	
	public boolean login(Users user){
		con=GetConnection.GetConnection();
		sql = "select * from users where username=? and password=?";
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				i=true;
				rs.close();
				pst.close();
			}
			else{
				i=false;
				rs.close();
				pst.close();
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return i;

		
	}
	public void addUser(Users user){
		con=GetConnection.GetConnection();
		sql="insert into users(username,password,gender) values(?,?,?)";
		try{
			pst=con.prepareStatement(sql);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getGender());
			pst.executeUpdate();
			pst.close();
			con.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
