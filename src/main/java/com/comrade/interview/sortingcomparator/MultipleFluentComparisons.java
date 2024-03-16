package com.comrade.interview.sortingcomparator;



import com.comrade.common_models.person.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class MultipleFluentComparisons {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("John", 20), new Person("Sara", 21), new Person("Jane", 21),
				new Person("Greg", 35));
		List<Person> personsName = persons.stream()
											.sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
											.collect(Collectors.toList());
		Function<Person, String> byName = person -> person.getName();
		Function<Person, Integer> byAge = person -> person.getAge();
		List<Person> personsNameComp = persons.stream().sorted(Comparator.comparing(byName))
				.collect(Collectors.toList());
		List<Person> personsNameAndAgeComp = persons.stream().sorted(Comparator.comparing(byAge).thenComparing(byAge))
				.collect(Collectors.toList());
		List<Person> ageMoreThan20 = new ArrayList<>();
		Predicate<Person> agePredicate = person -> person.getAge() > 20;
		persons.stream().filter(agePredicate).forEach(data -> ageMoreThan20.add(data));
		persons.stream().filter(agePredicate).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		persons.stream().filter(agePredicate).collect(Collectors.toList());
		groupByAge(persons);
		comWithFilter(persons);
	}

	private static void comWithFilter(List<Person> persons) {
		Comparator<Person> ageComp = Comparator.comparing(Person::getAge);
		Map<Character, Optional<Person>> oldestPersonOfEachLetter = persons.stream().collect(Collectors
				.groupingBy(person -> person.getName().charAt(0), Collectors.reducing(BinaryOperator.maxBy(ageComp))));
	}

	private static void groupByAge(List<Person> persons) {
		Function<Person, Integer> ageFunction = Person::getAge;
		Map<Integer, List<Person>> groupbyPerson = persons.stream().collect(Collectors.groupingBy(Person::getAge));
		Map<Integer, List<Person>> groupbyPersonWithFunction = persons.stream()
				.collect(Collectors.groupingBy(ageFunction));
		Map<Integer, List<String>> nameOfPeopleByAge = persons.stream().collect(
				Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
	}
}
