package com.comrade.i18n.datatimezone;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleDateTimezoneClient {
	public static void main(String[] args) {
		dateFormateI18n();
		timeFormateI18n();
	}

	private static void timeFormateI18n() {
		printTimeBasedOnLocate(new Locale("hi", "IN"));
		printTimeBasedOnLocate(Locale.ITALIAN);
		printTimeBasedOnLocate(Locale.FRENCH);
	}

	private static void printTimeBasedOnLocate(Locale locale) {
		DateFormat dateFormate = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
		Date currentdate=new Date();
		String formattedTime=dateFormate.format(currentdate);
		System.out.println(locale.toString()+" :"+formattedTime);
	}

	private static void dateFormateI18n() {
		printDateBasedOnLocale(new Locale("en", "US"));
		printDateBasedOnLocale(new Locale("hi", "IN"));
		printDateBasedOnLocale(Locale.JAPAN);
		printDateBasedOnLocale(Locale.CHINESE);
	}

	private static void printDateBasedOnLocale(Locale locale) {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, locale);
		Date currentDate = new Date();
		String formattedDate = dateFormat.format(currentDate);
		System.out.println(locale.toString() + " " + formattedDate);
	}
}
