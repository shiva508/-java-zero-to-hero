package com.pool.fileoutputstream;

import java.io.FileOutputStream;

public class FileOutputStreamClient {
	public static final String OUTPUT_FILE = "/home/shiva/shiva/mywork/zero_to_hero_java/src/main/java/resources/iowrite.txt";

	public static void main(String[] args) {
		writeMethod();
		flushMethod();
	}

	public static void flushMethod() {
		try {

			String message = "Do not interfere into other people work\n";

			FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE, true);
			byte[] inputData = message.getBytes();
			fileOutputStream.write(inputData);
			fileOutputStream.flush();
			fileOutputStream.close();
			System.out.println("Completed writting data");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeMethod() {
		try {

			String message = "Do not interfere into other people work\n";

			FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE, true);
			byte[] inputData = message.getBytes();
			fileOutputStream.write(inputData);
			fileOutputStream.close();
			System.out.println("Completed writting data");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
