package com.comrade.reflection.classforname;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassForNameClient {
	static Class clazzzz = null;
	static {
		ClassForNameClient.clazzzz = String.class;
		System.out.println(clazzzz.getName());
		System.out.println(clazzzz.isInterface());
		System.out.println(clazzzz.isPrimitive());
		System.out.println(clazzzz.isAnnotation());
		System.out.println(clazzzz.isArray());
		System.out.println(clazzzz.getTypeName());
		System.out.println(clazzzz.getSuperclass());
		System.out.println(clazzzz.getMethods());
	}

	public static void main(String[] args) {

		try {
			Class className = Class.forName("com.pool.reflection.classforname.Happyness");
			System.out.println(className.getName());
			System.out.println(className.isInterface());
			Class classNameInterface = Class.forName("com.pool.reflection.classforname.Joyfull");
			System.out.println(classNameInterface.getName());
			System.out.println(classNameInterface.isInterface());
			Happyness happyness = new Happyness();
			printClassName(happyness);
			Class floatClass = Float.class;
			System.out.println(floatClass.getName());
			Class floatClazz = Class.forName("java.lang.Float");
			System.out.println(floatClazz);
			System.out.println("===============================================");
			Class claxxxx = Class.forName("com.pool.reflection.classforname.Happyness");
			System.out.println(claxxxx.getName());
			Happyness happyness2 = new Happyness();
			Class clcccc = happyness2.getClass();
			System.out.println(clcccc.getName());
			System.out.println("FIELDS::::::::::::::::::::::::::::");
			Field fields[] = clcccc.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field);
			}

			System.out.println("CONSTRUCTORS:::::::::::::::::::::::");
			Constructor[] constructors = clcccc.getConstructors();
			for (Constructor constructor : constructors) {
				System.out.println(constructor);
			}
			System.out.println("METHODS::::::::::::::::");
			Method[] methods = clcccc.getMethods();
			for (Method method : methods) {
				System.out.println(method);
			}
			System.out.println("CALLING METHOD USING REFLECTION::::::::");
			Method methodalling = clcccc.getMethod("addTwoSouls", int.class, int.class);
			int sumOfSouls = (int) methodalling.invoke(happyness2, 408, 508);
			System.out.println(sumOfSouls);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void printClassName(Object happyness) {
		Class clazz = happyness.getClass();
		System.out.println(clazz.getName());
	}
}
