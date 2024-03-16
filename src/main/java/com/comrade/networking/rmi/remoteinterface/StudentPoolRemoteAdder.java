package com.comrade.networking.rmi.remoteinterface;

import java.net.MalformedURLException;

import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StudentPoolRemoteAdder extends UnicastRemoteObject implements StudentPoolRemoteInterface {

	public StudentPoolRemoteAdder() throws RemoteException {
		super();
	}


	@Override
	public int add(int input1, int input2) throws RemoteException {
		
		return input1+input2;
	}
}
