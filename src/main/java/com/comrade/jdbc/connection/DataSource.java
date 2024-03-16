package com.comrade.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
	private static DataSource dataSource;
	public static Connection connection;
	
	private DataSource() {

	}

	public static DataSource getDataSourceInstance() {
		if(dataSource==null) {
			dataSource=new DataSource();
				try {
					Class.forName("org.h2.Driver");
					connection=DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				dataSource.connection=connection;
		}
		return dataSource;
	}
	
}
