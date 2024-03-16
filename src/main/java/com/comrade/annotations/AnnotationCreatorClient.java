package com.comrade.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationCreatorClient {
	public static void main(String[] args) {
		Cat cat = new Cat("Cat Celin");

		annotationVerifier(cat);
	}

	private static void annotationVerifier(Cat cat) {
		try {
			if (cat.getClass().isAnnotationPresent(VeryImportant.class)) {
				System.out.println("Important class");
			} else {
				System.out.println("Not Important class");
			}

			for (Method method : cat.getClass().getDeclaredMethods()) {
				if (method.isAnnotationPresent(RunImmediatly.class)) {
					RunImmediatly immediatly = method.getAnnotation(RunImmediatly.class);
					for (int i = 0; i < immediatly.times(); i++) {
						method.invoke(cat);
					}

				}
			}

			for (Field field : cat.getClass().getDeclaredFields()) {
				if (field.isAnnotationPresent(UsernameValidation.class)) {
					Object userName = field.get(cat);
					if (userName instanceof String name) {
						System.out.println(name.toUpperCase());
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
