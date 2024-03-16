package com.comrade.solid_principles.dip.solution;

import com.comrade.solid_principles.dip.CreditCard;
import com.comrade.solid_principles.dip.DebitCard;

public class ShopingDipClient {
	private final BankCard bankCard;

	public ShopingDipClient(BankCard bankCard) {
		super();
		this.bankCard = bankCard;
	}

	public void doBuyItem(double ammount) {
		this.bankCard.buyItem(ammount);
	}

	public static void main(String[] args) {
		BankCard bankCard = new DebitCard();
		ShopingDipClient shoppingClient = new ShopingDipClient(bankCard);

		shoppingClient.doBuyItem(0);

		BankCard bankCardCredit = new CreditCard();
		ShopingDipClient shoppingCreditClient = new ShopingDipClient(bankCardCredit);

		shoppingCreditClient.doBuyItem(0);
	}
}
