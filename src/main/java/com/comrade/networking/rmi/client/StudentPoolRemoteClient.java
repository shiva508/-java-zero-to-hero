package com.comrade.networking.rmi.client;

import com.comrade.networking.rmi.remoteinterface.StudentPoolRemoteInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class StudentPoolRemoteClient {
	public static void main(String[] args) throws RemoteException {
		try {
			StudentPoolRemoteInterface stub = (StudentPoolRemoteInterface) Naming.lookup("rmi://localhost:5000/shiva");
			System.out.println(stub.add(508, 408));
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
