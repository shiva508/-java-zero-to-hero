package com.comrade.java_8.comparator;


import com.comrade.utils.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorClient {

	static Comparator<Developer> developerComparatorSortByName = new Comparator<Developer>() {
		@Override
		public int compare(Developer devl1, Developer devl2) {
			return devl1.getDeveloperName().compareTo(devl2.getDeveloperName());
		}
	};

	static Comparator<Developer> developerComparatorSortByAge = new Comparator<Developer>() {
		@Override
		public int compare(Developer devl1, Developer devl2) {
			return devl1.getAge() - devl2.getAge();
		}
	};

	static Comparator<Developer> developerComparatorSortBySalary = new Comparator<Developer>() {
		@Override
		public int compare(Developer devl1, Developer devl2) {
			return devl1.getSalary().compareTo(devl2.getSalary());
		}
	};

	static Comparator<Developer> developerLambdaComparatorSortByName = (Developer devl1, Developer devl2) -> devl1
			.getDeveloperName().compareTo(devl2.getDeveloperName());
	static Comparator<Developer> developerLambdaComparatorSortByAge = (Developer devl1,
			Developer devl2) -> devl1.getAge() - devl2.getAge();

	static Comparator<Developer> developerLambdaComparatorSortBySalary = (Developer devl1, Developer devl2) -> devl1
			.getSalary().compareTo(devl2.getSalary());

	public static void main(String[] args) {
		List<Developer> listDevs = getDevelopers();
		System.out.println(listDevs);
		Collections.sort(listDevs, developerComparatorSortByName.thenComparing(developerComparatorSortByAge)
				.thenComparing(developerComparatorSortBySalary));

	}

	private static List<Developer> getDevelopers() {
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		return result;
	}
}
