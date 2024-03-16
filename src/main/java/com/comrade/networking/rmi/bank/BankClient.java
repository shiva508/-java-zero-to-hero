package com.comrade.networking.rmi.bank;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class BankClient {
	public static void main(String[] args) {
		try {
			Bank bank = (Bank) Naming.lookup("rmi://localhost:5000/shiva");
			List<Customer> customers = bank.getCustomers();
			for (Customer customer : customers) {
				System.out.println(customer);
			}
		} catch (RemoteException | MalformedURLException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
