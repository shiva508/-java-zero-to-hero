package com.comrade.interview.passwordgenerator;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PasswordGeneratorClient {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()_+-=[]{}|;:'\",.<>?";
        //random password of 10 char
        //4 caps and 4 small and 2 special
        int smallStartMax=0;
        int smallEndMax=25;
        int capStartMax=26;
        int capEndMax=51;
        int minChar=5;
        int minSpecialChar=2;
        var smallLetters = getLetters(smallStartMax, smallEndMax, alphabet, minChar);
        var capitalLetter = getLetters(capStartMax, capEndMax, alphabet, minChar);
        var specialLetter = getLetters(0, specialChars.length()-1, specialChars, minSpecialChar);
        var password = Stream.of(capitalLetter,smallLetters,specialLetter).parallel().collect(Collectors.joining(""));
        System.out.println(password);

    }

    private static String getLetters(int smallStartMax, int smallEndMax, String alphabet, int minChar) {
        return IntStream.range(smallStartMax, smallEndMax)
                .mapToObj(value -> (String.valueOf(alphabet.charAt(new Random().nextInt(smallStartMax, smallEndMax)))))
                .toList().stream().limit(minChar).collect(Collectors.joining(""));
    }
}
