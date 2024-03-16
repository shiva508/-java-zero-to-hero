package com.comrade.java_14.exception;

public class HelpfulNullPointerExceptionClient {
    public static void main(String[] args) {
        User user=null;
        System.out.println(user.getUserName());
    }
}
