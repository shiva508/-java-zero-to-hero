package com.pool.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamClient {
	public static final String OUTPUT_FILE = "/home/shiva/shiva/mywork/zero_to_hero_java/src/main/java/resources/iowrite.txt";

	public static void main(String[] args) {

		try {

			OutputStream outputStream = new FileOutputStream(OUTPUT_FILE);
			String INPUT_TEXT = "My Name is Shiva";
			byte[] inputByteArray = INPUT_TEXT.getBytes();
			outputStream.write(inputByteArray);
			outputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
