package com.comrade.exceptions;

public class ExceptionThrowsClient {
    public static void main(String[] args) {
        try {
            divisionOperation(10, 0);
        } catch (Exception e) {
            System.out.println(e);
        }

        additionOperation(10, 0);

        // try-catch,throws,throw
    }

    private static void additionOperation(int input1, int input2) {
        System.out.println("=======Start of Addition =================");
        int result = input1 - input2;
        System.out.println("ADDITION RESULT:" + result);
        System.out.println("=======END of Addition =================");
    }

    private static void divisionOperation(int input1, int input2) throws Exception{
        System.out.println("=======Start of DIVISION =================");
        int result = input1 / input2;
        System.out.println("DIVISION RESULT:" + result);
        System.out.println("=======END of DIVISION =================");
    }
}
