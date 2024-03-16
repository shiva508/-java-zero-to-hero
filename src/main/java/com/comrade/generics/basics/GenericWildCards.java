package com.comrade.generics.basics;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCards {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		printWildData(integers);
		List<Cat> cats = new ArrayList<>();
		printWildData(cats);
	}

	public static void printData(List<Object> data) {

	}

	public static void printWildData(List<?> data) {

	}

}
