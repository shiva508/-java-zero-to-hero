package com.comrade.java_8.ncopies;

import java.util.Collections;

public class StringJoinNCopiesClient {
	public static void main(String[] args) {
		String data = String.join("\n", Collections.nCopies(10, "Shiva"));
		System.out.println(data);
	}
}
