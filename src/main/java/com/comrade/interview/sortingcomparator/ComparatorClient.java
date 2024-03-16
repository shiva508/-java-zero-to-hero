package com.comrade.interview.sortingcomparator;


import com.comrade.common_models.person.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorClient {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("John", 20), new Person("Sara", 21), new Person("Jane", 21),
				new Person("Greg", 35));

		List<Person> ascendingAge = persons.stream().sorted((person1, person2) -> person1.ageDifference(person2)).collect(Collectors.toList());
		System.out.println(ascendingAge);

		List<Person> ascendingAgeMethodRef = persons.stream().sorted(Person::ageDifference)
				.collect(Collectors.toList());
		System.out.println(ascendingAgeMethodRef);
		// descending
		List<Person> descending = persons.stream().sorted((person1, person2) -> person2.ageDifference(person1))
				.collect(Collectors.toList());
		System.out.println(descending);

		Comparator<Person> compareAscending = (person1, person2) -> person1.ageDifference(person2);
		Comparator<Person> compareDescending = compareAscending.reversed();

		List<Person> ascendingAgeComp = persons.stream().sorted(compareAscending).collect(Collectors.toList());
		System.out.println(ascendingAgeComp);

		List<Person> descendingComp = persons.stream().sorted(compareDescending).collect(Collectors.toList());
		System.out.println(descendingComp);

		List<Person> ascendingName = persons.stream()
				.sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
				.collect(Collectors.toList());
		System.out.println(ascendingName);

		persons.stream().min(Person::ageDifference).ifPresentOrElse(
				youngest -> System.out.println("Youngest: " + youngest), () -> System.out.println("NOTHING IS FOUND"));
		persons.stream().max(Person::ageDifference).ifPresentOrElse(eldest -> System.out.println("Eldest: " + eldest),
				() -> System.out.println("NOTHING IS FOUND"));

	}

}
