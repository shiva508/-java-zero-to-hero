package com.pool.switch_flow;

import java.util.Scanner;

public class SwitchMainCalling {
    public static void main(String[] args) {
        System.out.print("Please enter a DAY:");
        Scanner scanner=new Scanner(System.in);
        //System.out.println(scanner.next());
        String day=scanner.next();
        System.out.println(day);
        challengeofday(day);//STATIC METHOD CALLING-->way 1

    }

    //STATIC METHOD
    public static void challengeofday(String day) {
        //String myday="wenesday";

        switch(day) {
            case "monday":
                System.out.println("value is 1");
                break;
            case "Tuesday":
                System.out.println("value is 2");
                break;
            case "wenesday":
                System.out.println("value is 3");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }
}
