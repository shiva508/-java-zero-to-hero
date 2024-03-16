package com.comrade.networking.rmi.remoteinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StudentPoolRemoteInterface extends Remote {
	public int add(int input1, int input2) throws RemoteException;
}
