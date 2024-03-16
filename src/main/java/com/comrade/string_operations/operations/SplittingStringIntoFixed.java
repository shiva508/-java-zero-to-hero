package com.comrade.string_operations.operations;

public class SplittingStringIntoFixed {

	public static void main(String[] args) {
		String data = "DASARI SHIVA";
		String[] dataArray = data.split("(?<=\\G.{2})");
		for (int i = 0; i < dataArray.length; i++) {
			System.out.println(dataArray[i]);
		}
	}
}
