package com.comrade.solid_principles.isp;

public class GooglePay implements UPIPayments,CashBackManager {

	@Override
	public void payMoney() {

	}

	@Override
	public void getScratchCard() {

	}

	@Override
	public void getCashBackAsCreditBalance() {
		//GOOGLEPAY SPECIFIC
	}

}
