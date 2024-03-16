package com.comrade.java_8.streams.peek;

import com.comrade.utils.Role;
import com.comrade.utils.StreamUtil;

import java.util.List;
import java.util.stream.IntStream;

public class StreamPeekClient {
    public static void main(String[] args) {
        List<Role> roles= StreamUtil.rolesBuilder();
        var roleStream = roles.stream()
                              .peek(System.out::println)
                              .peek(role -> role.setRoleName("ROLE_" + role.getRoleName()))
                              .peek(System.out::println);
        dataManipulation();
    }
    private static void dataManipulation() {
        IntStream.iterate(0, i->i+1)
                 .peek(System.out::println)
                 .filter(i -> i % 2 == 0 )
                 .forEach(System.out::println);
    }
}
