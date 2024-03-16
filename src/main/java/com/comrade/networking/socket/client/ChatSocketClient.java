package com.comrade.networking.socket.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChatSocketClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 6666);
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			dataOutputStream.writeUTF("Hi SHIVA we can do it");
			dataOutputStream.flush();
			dataOutputStream.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
