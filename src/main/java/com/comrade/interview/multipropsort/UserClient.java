package com.comrade.interview.multipropsort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserClient {
    public static void main(String[] args) {
        List<User> userList = Arrays.asList(new User("B",19,500),new User("Z",20,2000),new User("C",50,508770));
        List<User> userListSor =  userList.stream().sorted(Comparator.comparing(User::getName).thenComparing(User::getAge)).collect(Collectors.toList());
        System.out.println(userListSor);
    }
}
