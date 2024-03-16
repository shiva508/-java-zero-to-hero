package com.comrade.java_8.streams.reduce;



import com.comrade.utils.Scan;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class ReduceClient {
	public static void main(String[] args) {
		int[] inputNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] strings = { "a", "b", "c", "d", "e" };
		List<Scan> invoices = Arrays.asList(new Scan("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
				new Scan("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
				new Scan("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2)));
		sumOfNumbersBeforeJaa8(inputNumbers);
		sumOfNumbersAfterJaa8(inputNumbers);
		sumOfNumbersAfterJaa8MethodReferance(inputNumbers);
		reducedBasedOperations(inputNumbers);
		reducedBasedStringOperations(strings);
		reduceAndMapOperationOnObject(invoices);
	}

	private static void reduceAndMapOperationOnObject(List<Scan> invoices) {
		BigDecimal sum =invoices.stream().map(invoice -> invoice.getQty().multiply(invoice.getPrice())).reduce(BigDecimal.ZERO,
				BigDecimal::add);
		System.out.println(sum);
		System.out.println(sum.setScale(2,RoundingMode.HALF_UP));
		
	}

	private static void reducedBasedStringOperations(String[] strings) {
		String joinngString = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);
		System.out.println(joinngString);
		String joinngStringModified = Arrays.stream(strings).reduce("", (a, b) -> {
			if (!"".equals(a)) {
				return a + "|" + b;
			} else {
				return b;
			}
		});
		System.out.println(joinngStringModified);
		String joiningText = String.join("|", strings);
		System.out.println(joiningText);
	}

	private static void reducedBasedOperations(int[] inputNumbers) {
		Arrays.stream(inputNumbers).reduce(0, (input1, input2) -> input1 + input2);
		Arrays.stream(inputNumbers).reduce(0, (input1, input2) -> input1 - input2);
		Arrays.stream(inputNumbers).reduce(0, (input1, input2) -> input1 * input2);
		/* MAX AND MIN */
		int MAX_VALUE1 = Arrays.stream(inputNumbers).reduce(0, (input1, input2) -> input1 > input2 ? input1 : input2);
		int MAX_VALUE2 = Arrays.stream(inputNumbers).reduce(0, Integer::max);
		System.out.println("MAX_VALUE1:" + MAX_VALUE1 + " = MAX_VALUE2:" + MAX_VALUE2);
		int MIN_VALUE1 = Arrays.stream(inputNumbers).reduce(0, (input1, input2) -> input1 < input2 ? input1 : input2);
		int MIN_VALUE2 = Arrays.stream(inputNumbers).reduce(0, Integer::min);
		System.out.println("MIN_VALUE1:" + MIN_VALUE1 + " = MIN_VALUE2:" + MIN_VALUE2);
	}

	private static void sumOfNumbersAfterJaa8MethodReferance(int[] inputNumbers) {
		int sumOfNumber = Arrays.stream(inputNumbers).reduce(0, Integer::sum);
		System.out.println("SUM OF NUMBERS:" + sumOfNumber);
	}

	private static void sumOfNumbersAfterJaa8(int[] inputNumbers) {
		int sumOfNumber = Arrays.stream(inputNumbers).reduce(0, (input1, input2) -> input1 + input2);
		System.out.println("SUM OF NUMBERS:" + sumOfNumber);
	}

	private static void sumOfNumbersBeforeJaa8(int[] inputNumbers) {
		int sumOfNumber = 0;
		for (int i = 0; i < inputNumbers.length; i++) {
			sumOfNumber += inputNumbers[i];
		}
		System.out.println("SUM OF NUMBERS:" + sumOfNumber);
	}
}
