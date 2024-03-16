package com.comrade.oops.obstraction.withabstract;

public class AbstractClient {
    public static void main(String[] args) {
        UserService userService= new UserServiceImpl();
        System.out.println(userService.getUserDetails());
    }
}
