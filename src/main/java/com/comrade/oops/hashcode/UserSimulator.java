package com.comrade.oops.hashcode;

public class UserSimulator {
    public static void main(String[] args) {
        User user1 = new User().setName("shiva").setAge(29).setAdharNumber("111222333");
        User user2 = new User().setName("shivaaa").setAge(29).setAdharNumber("111222333");
        System.out.println(user1.equals(user2));
    }
}
