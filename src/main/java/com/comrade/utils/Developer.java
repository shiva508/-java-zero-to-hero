package com.comrade.utils;

import java.math.BigDecimal;

public class Developer {
	private String developerName;
	private BigDecimal salary;
	private Integer age;

	public Developer(String developerName, BigDecimal salary, Integer age) {
		this.developerName = developerName;
		this.salary = salary;
		this.age = age;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public Developer setDeveloperName(String developerName) {
		this.developerName = developerName;
		return this;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public Developer setSalary(BigDecimal salary) {
		this.salary = salary;
		return this;
	}

	public Integer getAge() {
		return age;
	}

	public Developer setAge(Integer age) {
		this.age = age;
		return this;
	}

	@Override
	public String toString() {
		return "Developer [developerName=" + developerName + ", salary=" + salary + ", age=" + age + "]";
	}

}
