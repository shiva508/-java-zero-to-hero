package com.comrade.java_8.functionalinterface.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionClient {
    public static void main(String[] args) {
        simpleBiFunction();
        biFunctionWithFunction();
        nonGeneraicWayClient();
        generaicWayClient();
    }

    private static void biFunctionWithFunction() {
        BiFunction<String, String, Integer> nameLengthSum = (firstname, lastName) -> firstname.length() + lastName.length();
        Function<Integer, String> resultGenerator = namelength -> "Total Length is: " + namelength;
        String result = nameLengthSum.andThen(resultGenerator).apply("Shiva", "Dasari");
        System.out.println(result);

    }

    private static void simpleBiFunction() {
        BiFunction<Integer, Integer, Integer> sumOfNum = (num1, num2) -> num1 + num2;
        Integer result = sumOfNum.apply(508, 408);
        System.out.println(result);

    }

    public static void nonGeneraicWayClient() {
        BiFunction<String, String, Integer> nameLengthSum = (firstname, lastName) -> firstname.length() + lastName.length();
        Function<Integer, String> resultGenerator = namelength -> "Total Length is: " + namelength;
        String result = nonGeneraicWay("Shiva", "Dasari", nameLengthSum, resultGenerator);
        System.out.println(result);

    }

    public static void generaicWayClient() {
        BiFunction<String, String, Integer> nameLengthSum = (firstname, lastName) -> firstname.length()
                + lastName.length();
        Function<Integer, String> resultGenerator = namelength -> "Total Length is: " + namelength;
        String result = genericWay("Shiva", "Dasari", nameLengthSum, resultGenerator);
        System.out.println(result);

    }

    public static String nonGeneraicWay(String firstname, String lastName, BiFunction<String, String, Integer> biFun,
            Function<Integer, String> fun) {
        return biFun.andThen(fun).apply(firstname, lastName);
    }

    public static <A1, A2, R1, R2> R2 genericWay(A1 a1, A2 a2, BiFunction<A1, A2, R1> biFun, Function<R1, R2> fun) {
        return biFun.andThen(fun).apply(a1, a2);
    }

}
