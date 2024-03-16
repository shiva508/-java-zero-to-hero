package com.comrade.interview.optional;

import java.util.Optional;

public class OptionalClient {
    public static void main(String[] args) {
        //String name = "Shiva";
        String name = null;
        //Optional<String> stringOptional = Optional.of(name);
        Optional<String> stringOptional = Optional.ofNullable(name);// For Null Expected
        System.out.println(stringOptional.isEmpty());
        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptional.empty().isPresent());

        //System.out.println(stringOptional.orElseThrow());

        //stringOptional.orElseThrow(() -> new RuntimeException("Empty Value"));
        //System.out.println(stringOptional.get());
        System.out.println(stringOptional.or(()-> "Something went wrong".describeConstable()));

    }
}
