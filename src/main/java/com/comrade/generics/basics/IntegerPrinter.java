package com.comrade.generics.basics;

public class IntegerPrinter {
	Integer userId;

	public IntegerPrinter(Integer userId) {
		this.userId = userId;
	}

	public void printDetails() {
		System.out.println(this.userId);
	}
}
