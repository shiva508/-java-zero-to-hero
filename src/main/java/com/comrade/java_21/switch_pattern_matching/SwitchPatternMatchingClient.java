package com.comrade.java_21.switch_pattern_matching;

import com.comrade.java_21.record_patterns.JoinPoint;

public class SwitchPatternMatchingClient {
    public static void main(String[] args) {
        JoinPoint joinPoint = new JoinPoint(408.8f, 508.8f);
        String dev = "Shiva";
        Integer integer = 508;
        switchProcessor(joinPoint);
        switchProcessor(dev);
        switchProcessor(integer);
        switchProcessor21(joinPoint);
    }

    public static void switchProcessor(Object inputObject) {
        switch (inputObject){
            case JoinPoint joinPoint -> System.out.println(joinPoint.longitude() + joinPoint.latitude());
            case String dev -> System.out.println(dev);
            case null -> System.out.println("MAN BE THOUGHT FULL");
            default -> System.out.println("NOTHING MATCHING");
        }
    }
    public static void switchProcessor21(Object inputObject) {
        switch (inputObject){
            case JoinPoint(float latitude,float longitude) -> System.out.println(latitude + longitude);
            case String dev -> System.out.println(dev);
            case null -> System.out.println("MAN BE THOUGHT FULL");
            default -> System.out.println("NOTHING MATCHING");
        }
    }
}
