package Problema6;
import java.sql.Connection;

import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DataSourceDatabase {

    private static BasicDataSource ds;

    static {
    
        ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUsername("root");
        ds.setUrl("jdbc:mysql://localhost:3306/mysql");
    }
    private DataSourceDatabase() {

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
