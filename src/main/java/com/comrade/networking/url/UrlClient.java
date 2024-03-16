package com.comrade.networking.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class UrlClient {
	public static void main(String[] args) {
		basicUrlOpearation();
		urlOperations();
		urlConnectionOperation();
		httpUrlConnection();
		ipAddressOpearation();  
		  
		

	}

	private static void ipAddressOpearation() {
		try {
			InetAddress ip = InetAddress.getByName("www.javatpoint.com");
			System.out.println("Host Name: "+ip.getHostName());  
			System.out.println("IP Address: "+ip.getHostAddress()); 
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void httpUrlConnection() {
		try {
			URL url = new URL("http://www.javatpoint.com/java-tutorial");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			for (int i = 1; i <= 8; i++) {
				System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
			}
			huc.disconnect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void urlConnectionOperation() {
		try {
			URL url = new URL("http://www.javatpoint.com/java-tutorial");
			URLConnection connection = url.openConnection();
			InputStream inputStream = connection.getInputStream();
			int i;
			while ((i = inputStream.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void urlOperations() {
		try {
			URL url = new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");
			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host Name: " + url.getHost());
			System.out.println("Port Number: " + url.getPort());
			System.out.println("Default Port Number: " + url.getDefaultPort());
			System.out.println("Query String: " + url.getQuery());
			System.out.println("Path: " + url.getPath());
			System.out.println("File: " + url.getFile());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void basicUrlOpearation() {
		try {
			URL url = new URL("https://www.google.com/");
			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host Name: " + url.getHost());
			System.out.println("Port Number: " + url.getPort());
			System.out.println("File Name: " + url.getFile());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
