package com.comrade.java_8.streams.limit;

import com.comrade.utils.Role;
import com.comrade.utils.StreamUtil;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamLimitClient {
    public static void main(String[] args) {
        List<Role> roles= StreamUtil.rolesBuilder();
        var limit = roles.stream().limit(2).collect(Collectors.toList());
        System.out.println(limit);
        dataManipulation();
    }

    private static void dataManipulation() {
        IntStream.iterate(0,i->i+1)
                 .limit(5)
                .filter(i -> i % 2 == 0 )
                .forEach(System.out::println);
    }

}
