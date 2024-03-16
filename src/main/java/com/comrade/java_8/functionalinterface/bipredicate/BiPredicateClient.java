package com.comrade.java_8.functionalinterface.bipredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateClient {
    public static void main(String[] args) {

        List<Domain> domains = Arrays.asList(new Domain("google.com", 1),
                new Domain("i-am-spammer.com", 10),
                new Domain("mkyong.com", 0),
                new Domain("microsoft.com", 2));

        defaultDataFiltering(domains);
        defaultDataFilteringGenaric(domains, ((domineName, score) -> domineName.equals("google.com")
                || score > 0));
    }

    private static void defaultDataFiltering(List<Domain> domains) {
        BiPredicate<String, Integer> defauPredicate = (domineName, score) -> domineName.equals("google.com")
                || score > 0;
        List<Domain> filterdDomine = domains.stream()
                .filter(domine -> defauPredicate.test(domine.getName(), domine.getScore()))
                .collect(Collectors.toList());
        System.out.println(filterdDomine);
    }

    public static <T extends Domain> List<T> defaultDataFilteringGenaric(List<T> domines,
            BiPredicate<String, Integer> biPredicate) {

        return domines.stream().filter(data -> biPredicate.test(data.getName(), data.getScore()))
                .collect(Collectors.toList());
    }

    public void sampleBiPredicate() {
        BiPredicate<String, String> nameComparatoer = (nameOne, nameTwo) -> nameOne.equalsIgnoreCase(nameTwo);
        boolean resultOne = nameComparatoer.test("ShiVa", "Shiva");
        System.out.println(resultOne);
    }
}
