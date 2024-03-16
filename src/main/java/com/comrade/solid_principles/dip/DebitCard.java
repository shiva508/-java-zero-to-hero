package com.comrade.solid_principles.dip;

import com.comrade.solid_principles.dip.solution.BankCard;

public class DebitCard implements BankCard {
	@Override
	public void buyItem(double ammount) {
		System.out.println("Buy using credit card");
	}
}
