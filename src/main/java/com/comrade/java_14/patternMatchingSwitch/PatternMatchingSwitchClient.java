package com.comrade.java_14.patternMatchingSwitch;

public class PatternMatchingSwitchClient {
    public static void main(String[] args) {
        System.out.println(beforeJava17Formatter("Java 17"));
        System.out.println(beforeJava17Formatter(17));
    }

   private static String beforeJava17Formatter(Object input) {
        String formatted = "unknown";
        if (input instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (input instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (input instanceof Double d) {
            formatted = String.format("double %f", d);
        } else if (input instanceof String s) {
            formatted = String.format("String %s", s);
        }
       return formatted;
   }
   /*private static String afterJava17Formatter(Object input){
        return switch (input){
            case Integer intVal -> String.format("int %d", intVal);
            case Long longVal    -> String.format("long %d", longVal);
            case Double doubleVal  -> String.format("double %f", doubleVal);
            case String stringVal  -> String.format("String %s", stringVal);
            default        -> input.toString();
       };
   }*/

}
