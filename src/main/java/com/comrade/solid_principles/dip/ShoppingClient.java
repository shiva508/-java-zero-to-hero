package com.comrade.solid_principles.dip;

public class ShoppingClient {
	private CreditCard creditCard;

	public ShoppingClient(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public void doBuyItem(double ammount) {
		this.creditCard.buyItem(ammount);
	}

	public static void main(String[] args) {
		CreditCard creditCard = new CreditCard();
		ShoppingClient shoppingClient = new ShoppingClient(creditCard);

		shoppingClient.doBuyItem(0);
	}
}
