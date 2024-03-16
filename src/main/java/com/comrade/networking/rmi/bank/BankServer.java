package com.comrade.networking.rmi.bank;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class BankServer {

	public static void main(String[] args) {
		try {
			Remote stub = new BankImpl();
			Naming.rebind("rmi://localhost:5000/shiva", stub);
		} catch (RemoteException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
