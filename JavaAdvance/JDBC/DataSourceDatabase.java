package com.softtek.com.java.academy.jbdc;

import java.sql.Connection;
import java.sql.SQLException;
//importar librerias con build path.
import java.sql.SQLDataException;
import org.apache.commons.dbcp.BasicDataSource;

public class DataSourceDatabase {

		private static BasicDataSource ds;
		
		
		static {
			
			//Data sources are provided and configures normally
			ds= new BasicDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUsername("root");
			ds.setUrl("jdbc:mysql://localhost/mydb");
		}
		
		private DataSourceDatabase () {
			
		}
		
		public static Connection getConnection() {

	        Connection connection = null;
	        
	        try {
	            connection = ds.getConnection();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }
}
