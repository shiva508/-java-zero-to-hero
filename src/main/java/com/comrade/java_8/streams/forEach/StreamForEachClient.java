package com.comrade.java_8.streams.forEach;

import com.comrade.utils.Role;
import com.comrade.utils.StreamUtil;

import java.util.List;

public class StreamForEachClient {
    public static void main(String[] args) {
        List<Role> roles= StreamUtil.rolesBuilder();
        roles.stream().forEach(System.out::println);
    }
}
