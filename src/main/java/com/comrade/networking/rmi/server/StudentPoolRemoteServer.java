package com.comrade.networking.rmi.server;

import com.comrade.networking.rmi.remoteinterface.StudentPoolRemoteAdder;
import com.comrade.networking.rmi.remoteinterface.StudentPoolRemoteInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class StudentPoolRemoteServer {
	public static void main(String[] args) {
		try {
			StudentPoolRemoteInterface stub = new StudentPoolRemoteAdder();
			Naming.rebind("rmi://localhost:5000/shiva", stub);

		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
