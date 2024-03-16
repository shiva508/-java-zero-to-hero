package com.comrade.networking.rmi.bank;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BankImpl extends UnicastRemoteObject implements Bank {

	protected BankImpl() throws RemoteException {
		super();
	}

	@Override
	public List<Customer> getCustomers() throws RemoteException {
		List<Customer> customers = new ArrayList<Customer>();
		try {
			Class.forName("org.h2.Driver");
			Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
			PreparedStatement statement = connection.prepareStatement("select * from user");
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				customers.add(new Customer().setNo(resultSet.getInt(0)).setFirstName(resultSet.getString(1))
						.setLastName(resultSet.getString(2)).setAmmount(resultSet.getDouble(3)));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
