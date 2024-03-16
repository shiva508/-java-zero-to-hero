package com.pool.bytearrayinputstream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamClient {
	public static void main(String[] args) {

		// readMethod();
		// availableMethod();
		skipMethod();
	}

	public static void skipMethod() {
		try {
			byte[] input = { 4, 0, 8, 5, 0, 8 };
			ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(input);
			System.out.println("Before Skip Available bytes:" + arrayInputStream.available());
			arrayInputStream.skip(3);
			System.out.println("After Skip Available bytes:" + arrayInputStream.available());
			int outputData = arrayInputStream.read();
			while (outputData != -1) {
				System.out.println("Data:" + outputData);
				outputData = arrayInputStream.read();
				System.out.println("Available bytes:" + arrayInputStream.available());
			}
			System.out.println("Available bytes:" + arrayInputStream.available());
			arrayInputStream.close();
		} catch (IOException e) {

		}
	}

	public static void availableMethod() {
		try {
			byte[] input = { 4, 0, 8, 5, 0, 8 };
			ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(input);
			System.out.println("Available bytes:" + arrayInputStream.available());
			int outputData = arrayInputStream.read();
			while (outputData != -1) {
				System.out.println("Data:" + outputData);
				outputData = arrayInputStream.read();
				System.out.println("Available bytes:" + arrayInputStream.available());
			}
			System.out.println("Available bytes:" + arrayInputStream.available());
			arrayInputStream.close();
		} catch (IOException e) {

		}

	}

	public static void readMethod() {
		try {
			byte[] input = { 4, 0, 8, 5, 0, 8 };
			ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(input);

			int outputData = arrayInputStream.read();
			while (outputData != -1) {
				System.out.println("Data:" + outputData);
				outputData = arrayInputStream.read();
			}
			arrayInputStream.close();
		} catch (IOException e) {

		}
	}
}
