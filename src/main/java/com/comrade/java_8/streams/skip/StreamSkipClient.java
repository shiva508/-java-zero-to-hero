package com.comrade.java_8.streams.skip;

import com.comrade.utils.Role;
import com.comrade.utils.StreamUtil;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSkipClient {
    public static void main(String[] args) {
        List<Role> roles= StreamUtil.rolesBuilder();
        var skip = roles.stream().sorted(Comparator.naturalOrder()).skip(2).collect(Collectors.toList());
        System.out.println(skip);
    }
}
