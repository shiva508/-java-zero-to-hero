package com.comrade.i18n.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleCurrencyClient {
	public static void main(String[] args) {
		double amount=408.508;
		printNumberBasedOnLocale(new Locale("hi", "IN"),amount);
		printNumberBasedOnLocale(Locale.US,amount);
		printNumberBasedOnLocale(Locale.UK,amount);
		printNumberBasedOnLocale(Locale.GERMAN,amount);
		printNumberBasedOnLocale(Locale.ITALY,amount);
	}

	private static void printNumberBasedOnLocale(Locale locale,double amount) {
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
		String formatedCurrency=currencyFormat.format(amount);
		System.out.println(locale.toString()+" :"+formatedCurrency);

	}
}
