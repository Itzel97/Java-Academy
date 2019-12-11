package ejercicio6;

import java.sql.Connection;
import java.sql.SQLException;
import java.apache.commons.dbcp.BasicDataSource;

public class DataConnection {

	private static BasicDataSource db;

	static {

		db = new BasicDataSource();
		db.setDriverClassName("com.mysql.cj.jdbc.Driver");
		db.setUsername("root");
		db.setUrl("jdbc:mysql://localhost:3306/mydb");
	}

	private BasicDataSource() {
		
	}

	public static Connection get

	connection() {
		Connection connection = null;
		
		try {
			connection = db.getConnection();
			}catch(SQLException e){
				e.printStackTrace();
			}
		return connection;
	}
}
