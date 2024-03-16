package com.comrade.interview.count;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurencesOfChar {
    public static void main(String[] args) {

        String word="aaaabbbccd";
        String counting = word.chars()
                             .mapToObj(Character::toString)
                             .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                             .entrySet()
                             .stream()
                             .map(stringLongEntry -> stringLongEntry.getValue()+stringLongEntry.getKey())
                             .collect(Collectors.joining(""));
        System.out.println(counting);


        StringBuilder stringBuilder=new StringBuilder(10);
        stringBuilder.append("shiva dasari");
        Map<String,Long> collect = stringBuilder.toString()
                .chars()
                .mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map.Entry<String,Long> stringLongEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        System.out.println(stringLongEntry);
        List<Map.Entry<String,Long>> stringLongEntries=collect.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3).toList();
        System.out.println(stringLongEntries);
        var replace = stringBuilder.toString().replace(stringLongEntry.getKey(), String.valueOf(stringLongEntry.getValue()));
        System.out.println(replace);
        //beforeJava8();
    }

    public static void beforeJava8(){
        StringBuilder stringBuilder=new StringBuilder(10);
        stringBuilder.append("shiva dasari");
        Map<Character,Integer> characterIntegerMap=new HashMap<>();
        char [] charValue = stringBuilder.toString().toCharArray();
        //FINDING HOW MANY TIMES EACH CHAR REPEATED
        for (int i = 0; i < charValue.length; i++) {
            Character character= charValue[i];
            if(characterIntegerMap.containsKey(character)){
                characterIntegerMap.replace(character,characterIntegerMap.get(character)+1);
            }else{
                characterIntegerMap.put(character,1);
            }
        }

        String maxRepeatedString=null;
        Integer maxValue=0;
        //FINDING CHAR THAT REPETED MAX TIME
        for (Map.Entry<Character,Integer> entry:characterIntegerMap.entrySet()) {
            if(maxValue<entry.getValue()){
                maxValue=entry.getValue();
                maxRepeatedString= String.valueOf(entry.getKey());
            }
        }
        System.out.println("maxRepeatedString="+maxRepeatedString);
        System.out.println("maxValue="+maxValue);

        //REPLACE MAX TIME REPEATED CHAR WITH NUMBER OF TIMES REPEATED

        assert maxRepeatedString != null;
        String newString=stringBuilder.toString().replace(maxRepeatedString,String.valueOf(maxValue));
        System.out.println(newString);
    }
}
