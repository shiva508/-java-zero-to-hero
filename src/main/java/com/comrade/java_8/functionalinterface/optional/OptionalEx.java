package com.comrade.java_8.functionalinterface.optional;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		Optional<String> optional=Optional.of("Shiva");
		System.out.println(optional.isPresent());
		System.out.println("=====================");
		Optional<String> is1=optional.ofNullable(null);
		System.out.println(is1.isPresent());
		System.out.println("=====================");
		System.out.println(optional.empty());
		System.out.println("=====================");
		System.out.println(is1.empty());
		System.out.println("=====================");
		optional.ifPresent(name->System.out.println(name.length()));
	}

}
