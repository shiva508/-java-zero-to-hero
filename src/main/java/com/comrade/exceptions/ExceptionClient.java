package com.comrade.exceptions;

public class ExceptionClient {
    public static void main(String[] args) {
        divisionOperation(10, 0);
        divisionOperation1(10, 0);
        divisionOperation2(10, 0);
        additionOperation(10, 0);

        // try-catch,throws,throw
    }

    private static void additionOperation(int input1, int input2) {
        System.out.println("=======Start of Addition =================");
        int result = input1 - input2;
        System.out.println("ADDITION RESULT:" + result);
        System.out.println("=======END of Addition =================");
    }

    private static void divisionOperation(int input1, int input2) {
        System.out.println("=======Start of DIVISION =================");
        try {
            int result = input1 / input2;
            System.out.println("DIVISION RESULT:" + result);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("=======END of DIVISION =================");
    }

    private static void divisionOperation1(int input1, int input2) {
        System.out.println("=======Start of DIVISION =================");
        try {
            int result = input1 / input2;
            System.out.println("DIVISION RESULT:" + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("=======END of DIVISION =================");
    }

    private static void divisionOperation2(int input1, int input2) {
        System.out.println("=======Start of DIVISION 2=================");
        try {
            int result = input1 / input2;
            System.out.println("DIVISION RESULT:" + result);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("FINALLY");
        }
        System.out.println("=======END of DIVISION 2=================");
    }

    private static void divisionOperation3(int input1, int input2) {
        System.out.println("=======Start of DIVISION 2=================");
        try {
            int result = input1 / input2;
            System.out.println("DIVISION RESULT:" + result);
        } finally {
            System.out.println("FINALLY");
        }
        System.out.println("=======END of DIVISION 2=================");
    }

}
