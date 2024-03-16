package com.comrade.networking.socket.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatSocketServer {
	public static void main(String[] args) {
		createServerInstance();
	}

	public static void createServerInstance() {
		
		try {
			ServerSocket serverSocket = new ServerSocket(6666);
			Socket socket =serverSocket.accept();
			DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
			String messageFromClient=dataInputStream.readUTF();
			System.out.println("Message from client:"+messageFromClient);
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
}
