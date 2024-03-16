package com.comrade.i18n.number;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleNumberClient {
	public static void main(String[] args) {
		double number=408.508;
		printNumberBasedOnLocale(new Locale("hi", "IN"),number);
		printNumberBasedOnLocale(Locale.US,number);
		printNumberBasedOnLocale(Locale.UK,number);
		printNumberBasedOnLocale(Locale.GERMAN,number);
		printNumberBasedOnLocale(Locale.ITALY,number);
	}

	private static void printNumberBasedOnLocale(Locale locale,double number) {
		NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
		String formatedNumber=numberFormat.format(number);
		System.out.println(locale.toString()+" :"+formatedNumber);

	}
}
