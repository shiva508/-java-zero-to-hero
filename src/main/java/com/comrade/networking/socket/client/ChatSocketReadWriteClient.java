package com.comrade.networking.socket.client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatSocketReadWriteClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 3333);
			DataInputStream inputStream=new DataInputStream(socket.getInputStream());
			DataOutputStream outputStream=new DataOutputStream(socket.getOutputStream());
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			String inputData="";
			String outputData="";
			while (!inputData.equals("stop")) {
				inputData=bufferedReader.readLine();
				outputStream.writeUTF(inputData);
				outputStream.flush();
				outputData=inputStream.readUTF();
				System.out.println(outputData);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
