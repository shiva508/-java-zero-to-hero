package com.comrade.interview.addspaceinthemiddle;

import java.util.stream.Collectors;

public class StringAddSpeceClient {
    public static void main(String[] args) {
        String name = "Shiva";
        name.chars().mapToObj(Character::toString).collect(Collectors.joining(""));
    }
}
