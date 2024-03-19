package com.comrade.interview.addspaceinthemiddle;

import java.util.stream.Collectors;

public class StringAddSpeceClient {
    public static void main(String[] args) {
        String name = "Shiva";
        var chars = name.chars().mapToObj(Character::toString).collect(Collectors.joining(""));
        System.out.println(chars);
    }
}
