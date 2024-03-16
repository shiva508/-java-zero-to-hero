package com.comrade.interview.repeted.words;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordCountClient {
    public static void main(String[] args) {
        String message="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        Pattern pattern=Pattern.compile(" ");
        List<String> words= Arrays.asList(pattern.split(message));
        Map<String,Integer> countWordsUsingMap=words.stream().collect(Collectors.toMap(word->word,word->1,(oldWord,newWord)->oldWord+1));
        System.out.println(countWordsUsingMap);
        Map<String,Integer> countWordsUsingIntegerSum=words.stream().collect(Collectors.toMap(word->word,word->1,Integer::sum));
        System.out.println(countWordsUsingIntegerSum);
        Map<String,Integer> countWordsUsingMathAddExact=words.stream().collect(Collectors.toMap(Function.identity(),word->1,Math::addExact));
        System.out.println(countWordsUsingMathAddExact);
        Map<String,Long> countWordsUsingCollectorsCounting=words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countWordsUsingCollectorsCounting);


    }
}
