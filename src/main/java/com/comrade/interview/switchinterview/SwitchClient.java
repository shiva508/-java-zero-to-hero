package com.comrade.interview.switchinterview;

public class SwitchClient {
    public static void main(String[] args) {
        // Note without break all statements gets executed
        String inputData="IN_PROGRESS";
        switch (inputData){
            case "STARTED":  System.out.println("Started");
            case "IN_PROGRESS": System.out.println("IN_PROGRESS");
            case "COMPLETED": System.out.println("COMPLETED");
        }
    }
}
