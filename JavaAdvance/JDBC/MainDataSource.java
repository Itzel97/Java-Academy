package com.softtek.com.java.academy.jbdc;

import java.sql.Connection;
import java.sql.SQLException;



public class MainDataSource {
	   
 public static void main(String[] args) {
	try {
	            Connection connection = DataSourceDatabase.getConnection();

	            System.out.println(connection.getMetaData()
	                .getDatabaseProductName());
	            
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
}
	        

	    
}
