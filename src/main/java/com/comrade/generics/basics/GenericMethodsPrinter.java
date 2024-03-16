package com.comrade.generics.basics;

public class GenericMethodsPrinter {
	public static void main(String[] args) {

	}

	public static <T> void sayHello(T anyLanguage) {
		System.out.println(anyLanguage);
	}

	public static <T, V> void sayHello(T anyLanguage, V someother) {
		System.out.println(anyLanguage);
	}

	public static <T> T returnHello(T anyLanguage) {
		System.out.println(anyLanguage);
		return anyLanguage;
	}
}
