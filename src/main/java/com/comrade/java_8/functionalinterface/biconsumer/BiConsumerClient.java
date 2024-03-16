package com.comrade.java_8.functionalinterface.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerClient {
    public static void main(String[] args) {
        BiConsumer<String, String> fullNameBuilder = (firstName, LastName) -> System.out.println(firstName.concat(" " + LastName));
        fullNameBuilder.accept("Shiva", "Dasari");
    }
}
