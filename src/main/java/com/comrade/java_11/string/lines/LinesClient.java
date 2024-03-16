package com.comrade.java_11.string.lines;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinesClient {
    public static void main(String[] args) {
        String companyName="Manikanta \nDriving \nSchool \nPvt.ltd";
        System.out.println(companyName);
        Stream<String> names= companyName.lines();
        String modifiedName= names.collect(Collectors.joining(""));
        System.out.println(modifiedName);
    }
}
