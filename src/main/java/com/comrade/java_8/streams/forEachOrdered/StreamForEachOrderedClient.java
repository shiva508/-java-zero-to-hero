package com.comrade.java_8.streams.forEachOrdered;

import com.comrade.utils.Role;
import com.comrade.utils.StreamUtil;

import java.util.List;

public class StreamForEachOrderedClient {
    public static void main(String[] args) {
            List<Role> roles= StreamUtil.rolesBuilder();
            roles.stream().forEachOrdered(System.out::println);
    }
}
