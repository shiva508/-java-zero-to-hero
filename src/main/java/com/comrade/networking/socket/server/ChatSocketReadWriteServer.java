package com.comrade.networking.socket.server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatSocketReadWriteServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(3333);
			Socket socket=serverSocket.accept();
			DataInputStream inputStream=new DataInputStream(socket.getInputStream());
			DataOutputStream outputStream=new DataOutputStream(socket.getOutputStream());
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			String inputData="";
			String outputData="";
			while (!inputData.equals("stop")) {
				inputData=inputStream.readUTF();
				System.out.println(inputData);
				outputData=bufferedReader.readLine();
				outputStream.writeUTF(outputData);
				outputStream.flush();
			}
			inputStream.close();  
			socket.close();  
			serverSocket.close();  
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
