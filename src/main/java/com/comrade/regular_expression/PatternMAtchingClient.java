package com.comrade.regular_expression;

import java.util.Arrays;

public class PatternMAtchingClient {
	public static void main(String[] args) {
		//oldApproach();
		//usingApproach();
		handlingNullApproach();
	}

	private static void oldApproach() {
		System.out.println(process(1));
		System.out.println(process("Hello"));
	}
	private static void usingApproach() {
		System.out.println(processUsingSwitch(1));
		System.out.println(processUsingSwitch("Hello"));
	}

	private static void handlingNullApproach() {
		Arrays.asList("Hello")
		.stream()
		.map(PatternMAtchingClient::processUsingSwitch)
		.forEach(System.out::println);
	}
	private static String process(Object input) {
		if (input instanceof Integer) {
			return "Given input is number:" + input;
		}
		if (input instanceof String str) {
			return "Given input length is:" + str.length();
		}
		return "No Clue";
	}
	
	private static String processUsingSwitch(Object input) {
		/*return switch (input) {
				case Integer i -> "Given input is number:" + i;
				case String  str -> "Given input length is:" + str.length();
				default ->"No Clue";
		
		};*/
		return "No";
	}
	
}
