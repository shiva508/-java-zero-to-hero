package com.comrade.networking.rmi.bank;

import java.io.Serializable;

public class Customer implements Serializable {
	private Integer no;
	private String firstName;
	private String lastName;
	private String email;
	private Double ammount;

	public Customer() {

	}

	public Integer getNo() {
		return no;
	}

	public Customer setNo(Integer no) {
		this.no = no;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public Customer setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public Customer setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Customer setEmail(String email) {
		this.email = email;
		return this;
	}

	public Double getAmmount() {
		return ammount;
	}

	public Customer setAmmount(Double ammount) {
		this.ammount = ammount;
		return this;
	}

	@Override
	public String toString() {
		return "Customer [no=" + no + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", ammount=" + ammount + "]";
	}

}
