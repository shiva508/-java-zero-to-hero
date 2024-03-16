package com.comrade.exceptions;

public class ExceptionHandling {
    public static void main(String[] args){
        try {
            divisionOperation(10, 0);
        } catch (CustomException e) {
            e.printStackTrace();
        }
        additionOperation(10, 0);
        isUsernameIsRavi("Ravi");
    }

    private static void isUsernameIsRavi(String name) {
        if(name.equals("Ravi")) {
            throw new RaviException("User Name is Ravi exception");
        }else {
            System.out.println("user name is not ravi");
        }

    }

    private static void divisionOperation(int input1, int input2){
        try {
            int result = input1 / input2;
            System.out.println("DIVISION RESULT:"+result);
        } catch (ArithmeticException e) {
            throw new CustomException("Ravi exception is custuom exception");
        }

    }

    private static void additionOperation(int input1, int input2) {
        int result = input1 - input2;
        System.out.println("ADDITION RESULT:"+result);
    }
}
