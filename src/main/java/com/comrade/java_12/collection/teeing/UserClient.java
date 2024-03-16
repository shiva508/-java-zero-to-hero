package com.comrade.java_12.collection.teeing;

import java.util.*;
import java.util.stream.Collectors;

public class UserClient {
    public static void main(String[] args) {
        List<User> users= Arrays.asList(new User(1,"Shiva",4000.0d),
                                        new User(2,"Satish",8000.0d),
                                        new User(3,"Gopi",6000.0d),
                                        new User(4,"Ravi",16000.0d));
        Map<String, User> stringUserMap = users.stream().collect(Collectors.teeing(
                Collectors.maxBy(Comparator.comparing(User::getSalary)),
                Collectors.minBy(Comparator.comparing(User::getSalary)),
                (maxObj, minObj) -> {
                    Map<String, User> map = new HashMap<>(2);
                    map.put("Max", maxObj.get());
                    map.put("Min", minObj.get());
                    return map;
                })
        );
        System.out.println(stringUserMap);
    }
}
