package com.comrade.java_8.collectors.toMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapClient {
	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		covertingToUpperCaseBeforJava8(friends);
		covertingToUpperCaseUsingforEach(friends);
		covertingToUpperCaseUsingMap(friends);
		measuringLengthOfNamesUsingMap(friends);
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		manupulationNumbersUsingMap(num);
	}

	private static void manupulationNumbersUsingMap(List<Integer> num) {
		List<Integer> list = num.stream().map(data -> data * 8).collect(Collectors.toList());
	}

	private static void measuringLengthOfNamesUsingMap(List<String> friends) {
		friends.stream().map(name -> name.length()).forEach(length -> System.out.println(length));
	}

	private static void covertingToUpperCaseBeforJava8(List<String> friends) {
		List<String> UPPER_CASE_NAMES = new ArrayList<>();
		for (String friendName : friends) {
			UPPER_CASE_NAMES.add(friendName.toUpperCase());
		}
		System.out.println(UPPER_CASE_NAMES);
	}

	private static void covertingToUpperCaseUsingMap(List<String> friends) {
		List<String> UPPER_CASE_NAMES = friends.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(UPPER_CASE_NAMES);
	}

	private static void covertingToUpperCaseUsingforEach(List<String> friends) {
		List<String> UPPER_CASE_NAMES = new ArrayList<>();
		friends.forEach(name -> UPPER_CASE_NAMES.add(name.toUpperCase()));
		System.out.println(UPPER_CASE_NAMES);
	}
}
