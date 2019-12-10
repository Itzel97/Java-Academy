package com.softtek.com.java.academy.jbdc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainDataSource {

	public static List<User> usuarios = new ArrayList<>();
	public static List<UserRole> usuarioRole = new ArrayList<>();
	
	public static void main(String[] args) {
		try {
			Connection connection = DataSourceDatabase.getConnection();
			System.out.println(connection.getMetaData().getDatabaseProductName());

			String sql = "Select * from user";
			//String sql2 = "Select * from user_role";
			Statement stmt = null;
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
		
				
				while (rs.next()) {
					
					User usr = new User();
					usr.setUserName(rs.getString("username"));
					usr.setPassword(rs.getString("password"));
					usr.setName(rs.getString("name"));
					UserRole user_role_id = new UserRole();
					user_role_id.setUser_role_id(rs.getString("user_role_id"));
					usr.setActive(rs.getString("active"));

					usuarios.add(usr);
					System.out.println(usuarios.toString());
			}
			
		
			connection.close();

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println(usuarios.size());
	}

}
