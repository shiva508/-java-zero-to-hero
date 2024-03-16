package com.pool.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamClient {
	public static final String FILE_NAME = "/home/shiva/shiva/mywork/zero_to_hero_java/src/main/java/resources/io.txt";

	public static void main(String[] args) {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(FILE_NAME);
			byte[] data = new byte[1000];
			inputStream.read(data);
			String fileData = new String(data);
			System.out.println(fileData);
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
