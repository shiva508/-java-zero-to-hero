package com.comrade.jdbc.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class H2SingletonClient {
	public static void main(String[] args) {
		DataSource dataSource=DataSource.getDataSourceInstance();
		Connection connection0=dataSource.connection;
		Connection connection1=dataSource.connection;
		System.out.println(connection0.hashCode());
		System.out.println(connection1.hashCode());
		try {
			System.out.println(connection0.getSchema());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
