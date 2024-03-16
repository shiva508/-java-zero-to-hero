package com.comrade.solid_principles.dip;

public class ShoppingDebitClient {
	private DebitCard debitCard;

	public ShoppingDebitClient(DebitCard debitCard) {
		this.debitCard = debitCard;
	}

	public void doBuyItem(double ammount) {
		this.debitCard.buyItem(ammount);
	}

	public static void main(String[] args) {
		DebitCard debitCard = new DebitCard();
		ShoppingDebitClient shoppingClient = new ShoppingDebitClient(debitCard);

		shoppingClient.doBuyItem(0);
	}
}
