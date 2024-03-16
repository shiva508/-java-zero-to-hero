package com.comrade.reflection.classforname;

public class Happyness {
	private String happinessName;
	private String happyMoveent;

	public Happyness() {
		super();
	}

	public Happyness(String happinessName, String happyMoveent) {
		super();
		this.happinessName = happinessName;
		this.happyMoveent = happyMoveent;
	}

	public String getHappinessName() {
		return happinessName;
	}

	public void setHappinessName(String happinessName) {
		this.happinessName = happinessName;
	}

	public String getHappyMoveent() {
		return happyMoveent;
	}

	public void setHappyMoveent(String happyMoveent) {
		this.happyMoveent = happyMoveent;
	}

	public int addTwoSouls(int soul1, int soul2) {
		return soul1 + soul2;
	}
}
