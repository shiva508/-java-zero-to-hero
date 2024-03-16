package com.comrade.exceptions;

public class CustomExceptionHandling {
    public static void main(String[] args) {
        userCheck("shiva");
        getthebanckDetails();
    }

    private static void getthebanckDetails() {
        System.out.println("BANK DETAILS");
    }

    private static void userCheck(String name) {
        if(name.equals("ravi")) {//==
            System.out.println("Name is Ravi");
        }else {
            System.out.println("Name is Not Ravi");
            throw new ShivaException("SEEEDSDSFAF");
        }
    }
}
