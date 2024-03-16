package com.comrade.i18n.locale;

import java.util.Locale;

public class LocaleClient {
	public static void main(String[] args) {
		//localeBasicOperations();
		//displayEnglishInOtherLanguages();
		listOfLocaleOperations();
	}

	private static void listOfLocaleOperations() {
		Locale locales[]= {new Locale("en","US"),new Locale("fr","FR"),new Locale("it","IT")};
		for (Locale locale : locales) {
			String displayName=locale.getDisplayLanguage(locale);
			System.out.println(locale.toString()+" "+displayName );
		}
	}

	private static void displayEnglishInOtherLanguages() {
		Locale enLocale1=new Locale("en","US");
		Locale frLocale1=new Locale("fr","FR");
		Locale usLocale1=new Locale("es","ES");
		System.out.println("US:"+enLocale1.getDisplayLanguage());
		System.out.println("ENGLISH NAME IN FRENCH:"+enLocale1.getDisplayLanguage(frLocale1));
		System.out.println("ENGLISH NAME IN SPANISH:"+enLocale1.getDisplayLanguage(usLocale1));
	}

	private static void localeBasicOperations() {
		//Locale locale = Locale.getDefault();
		Locale locale = new Locale("EN", "IN");
		System.out.println(locale);
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.toString());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Country());
		System.out.println(locale.getISO3Language());
		System.out.println(locale.getLanguage());
		Locale lis[]=Locale.getAvailableLocales();
		for (Locale locale2 : lis) {
			System.out.println(locale2.getCountry()+" "+locale2.getLanguage());
		}
	}
}
