package com.comrade.java_21.record_patterns;

public class RecordPatternsClient {
    public static void main(String[] args) {
        JoinPoint joinPoint = new JoinPoint(1.0f,2.0f);
        if (joinPoint instanceof JoinPoint joinPointInstance){
            var sum = joinPointInstance.longitude() + joinPointInstance.latitude();
            System.out.println(sum);
        }

        if (joinPoint instanceof JoinPoint(float latitude, float longitude)){
            var sum = latitude + longitude;
            System.out.println(sum);
        }
    }
}
