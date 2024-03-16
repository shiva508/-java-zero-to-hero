package com.comrade.interview.findingelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindingElements {
	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");
		final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
		beforeJava8(friends);
		usingJava8(friends);
		duplicatePredicate();
		java8WithFilterPredicate(friends, editors, comrades);
		java8WithFilter(friends, editors, comrades);
		withCommonPredicate(friends);
		predicateWithFunction(friends);

	}

	private static void predicateWithFunction(final List<String> friends) {
		final Function<String, Predicate<String>> functionPredicate = (String letter) -> {
			Predicate<String> predicate = (String name) -> name.startsWith(letter);
			return predicate;
		};
		final Function<String, Predicate<String>> functionPredicate1 = (
				String letter) -> (String name) -> name.startsWith(letter);
		final Function<String, Predicate<String>> functionPredicate2 = letter -> name -> name.startsWith(letter);
		final long countFriendsStartN =friends.stream().filter(functionPredicate2.apply("N")).count();
	}

	private static void withCommonPredicate(final List<String> friends) {
		final long countFriendsStartN = friends.stream().filter(commonStartWith("N")).count();
		final long countFriendsStartB = friends.stream().filter(commonStartWith("B")).count();
	}

	private static void duplicatePredicate() {
		final Predicate<String> predicateStartWithN = name -> name.startsWith("N");
		final Predicate<String> predicateStartWithB = name -> name.startsWith("N");
	}

	private static void java8WithFilterPredicate(final List<String> friends, final List<String> editors,
			final List<String> comrades) {
		final Predicate<String> predicateStartWithN = name -> name.startsWith("N");
		final long countFriendsStartN = friends.stream().filter(predicateStartWithN).count();
		final long countEditorsStartN = editors.stream().filter(predicateStartWithN).count();
		final long countComradesStartN = comrades.stream().filter(predicateStartWithN).count();
	}

	private static void java8WithFilter(final List<String> friends, final List<String> editors,
			final List<String> comrades) {
		final long countFriendsStartN = friends.stream().filter(name -> name.startsWith("N")).count();
		final long countEditorsStartN = editors.stream().filter(name -> name.startsWith("N")).count();
		final long countComradesStartN = comrades.stream().filter(name -> name.startsWith("N")).count();
	}

	private static void usingJava8(final List<String> friends) {
		List<String> namesStartWithN = friends.stream().filter(name -> name.startsWith("N"))
				.collect(Collectors.toList());
	}

	private static void beforeJava8(final List<String> friends) {
		List<String> namesStartWithN = new ArrayList<>();
		for (String friendName : friends) {
			if (friendName.contains("N")) {
				namesStartWithN.add(friendName);
			}
		}
	}

	public static Predicate<String> commonStartWith(String letter) {

		return name -> name.startsWith(letter);
	}
}
