package com.comrade.interview.sortingcomparator;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordComparator {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile(" ");
        List<String> messages= Arrays.asList("Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,", "when an unknown printer took a galley of type and scrambled it to make a type specimen book.","It has survived not only five centuries, but also the leap into electronic typesetting,","remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker","including versions of Lorem Ipsum.");
        List<String> orderedWords= messages.stream().sorted(Comparator.naturalOrder()).map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(orderedWords);
        List<String> words=orderedWords.stream().flatMap(prase->Arrays.asList(pattern.split(prase)).stream()).collect(Collectors.toList());
        System.out.println(words);
        var otherApproach=orderedWords.stream().flatMap(prase->Arrays.asList(pattern.split(prase)).stream()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldVal,newVal)->newVal, LinkedHashMap::new));

    }
}
