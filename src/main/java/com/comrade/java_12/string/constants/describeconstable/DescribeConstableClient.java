package com.comrade.java_12.string.constants.describeconstable;

import java.util.Optional;

public class DescribeConstableClient {
    public static void main(String[] args) {
        String companyName="Dear Comrade";
        Optional<String> optionalString = companyName.describeConstable();
        System.out.println(optionalString);
        System.out.println(optionalString.get());
    }
}
