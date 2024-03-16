package com.comrade.arrays.patterns;

public class PatternsClient {
    public static void main(String[] args) {
        int input=8;
        patternOne(input);
        patternTwo(input);
        patternThree(input);
        patternFive(input);
        patternSix(input);
    }

    private static void patternSix(int input) {
        for (int i = input; i >=0 ; i--) {
            for (int j = input; j >=0 ; j--) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        System.out.println("<================>");
    }

    private static void patternFive(int input) {
        for (int i = 0; i <= input; i++) {
            for (int j = 0; j <= input; j++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        System.out.println("<================>");
    }

    private static void patternThree(int input) {
        for (int i = input; i >= 0; i--) {
            for (int j = input; j >= 0; j--) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        System.out.println("<================>");
    }

    private static void patternTwo(int input) {
        for (int i = 0; i <= input; i++) {
            for (int j = 0; j <= input; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("<================>");
    }

    private static void patternOne(int input) {
        for (int i = 0; i <= input; i++) {
            for (int j = 0; j <= input; j++) {
                System.out.print(j +" ");
            }
            System.out.println("");
        }
        System.out.println("<================>");
    }
}
