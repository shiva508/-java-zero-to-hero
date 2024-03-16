package com.comrade.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternClient {
	public static void main(String[] args) {
		basicOperations();
		String inputData = "asasasasas";
		String regEXpression = "[abc]";
		Pattern pattern2 = Pattern.compile(regEXpression);
		Matcher matcher = pattern2.matcher(inputData);
		if (matcher.find()) {
			System.out.println("OM");
		}
	}

	private static void basicOperations() {
		String inputPattern = "ab";
		String inputData = "shiva dasari ab";
		Pattern pattern = Pattern.compile(inputPattern);
		Matcher matcher = pattern.matcher(inputData);
		if (matcher.find()) {
			System.out.println(matcher.start() + "=======" + matcher.end() + "+++++++++++:" + matcher.group());
		}
	}
}
