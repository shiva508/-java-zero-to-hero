package com.comrade.i18n.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleResourceBundleClient {
	public static void main(String[] args) {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("resources/MessageBundle", Locale.US);
		System.out.println("Message in "+Locale.US+": "+resourceBundle.getString("greetings"));
		//CHNADING LOCALE TO ES
		Locale.setDefault(new Locale("es","ES"));
		ResourceBundle resourceBundle_ES=ResourceBundle.getBundle("resources/MessageBundle");
		System.out.println("Message in "+Locale.getDefault()+": "+resourceBundle_ES.getString("greetings"));
		
		Locale.setDefault(new Locale("hi","IN"));
		ResourceBundle resourceBundle_IN=ResourceBundle.getBundle("resources/MessageBundle");
		System.out.println("Message in "+Locale.getDefault()+": "+resourceBundle_IN.getString("greetings"));
	}
}
