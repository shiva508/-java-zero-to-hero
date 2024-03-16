package com.comrade.annotations;

@VeryImportant
public class Cat {
	@UsernameValidation
	String name;
	int age;

	public Cat(String name) {
		this.name = name;
	}

	@RunImmediatly(times=3)
	public void meow() {
		System.out.println("MEOW");
	}

	public void eat() {
		System.out.println("EAT");
	}
}
