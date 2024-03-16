package com.comrade.exceptions;

public class ExceptionHandlingThrows {
    public static void main(String[] args) throws Exception {
        try {
            divisionOperation(10, 0);
        } catch (Exception e) {
            System.out.println(e);
        }

        additionOperation(10, 0);
    }

    private static void divisionOperation(int input1, int input2) throws Exception {
        int result = input1 / input2;
        System.out.println("DIVISION RESULT:"+result);
    }

    private static void additionOperation(int input1, int input2) {
        int result = input1 - input2;
        System.out.println("ADDITION RESULT:"+result);
    }
}
