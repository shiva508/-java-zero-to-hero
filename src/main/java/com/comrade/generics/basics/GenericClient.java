package com.comrade.generics.basics;

import java.util.ArrayList;

public class GenericClient {
	public static void main(String[] args) {
		IntegerPrinter integerPrinter = new IntegerPrinter(508);
		integerPrinter.printDetails();
		// IntegerPrinter integerPrinter=new IntegerPrinter("string);
		GenericPrinter<String> stringGenericPrinter = new GenericPrinter<String>("Shiva");
		GenericPrinter<Integer> integerGenericPrinter = new GenericPrinter<>(123);
		ArrayList<Cat> cats=new ArrayList<>();
		cats.add(new Cat());
		//cats.add(new Dog());
		
	}
}
