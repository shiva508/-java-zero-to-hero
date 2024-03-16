package com.comrade.java_13.switchblock;

public class SwitchBlockClient {
    public static void main(String[] args) {
        basicSwitchOperation();
        patternMatchingSwitch();
        basicApiSwitchOperation();
    }

    //Uncomment on java 19
    private static void patternMatchingSwitch() {
        /*Object input=2;
        Object Integer;
        String result=switch (input){
            case Integer i->"Integer";
            case Double  d->"Double";
            default -> "HAPPY LIFE";
        };
        System.out.println(result);*/
    }

    private static void basicSwitchOperation() {
        //String input="shiva";
        String input="FACEBOOK";
        String result= switch (input){
            case "FACEBOOK","TWITTER","INSTAGRAM" -> "SOCIAL NETWORK";
            case "UDEMY","PLURALITE" -> "EDUCATION";
            default -> "HAPPY LIFE";
        };
        System.out.println(result);
    }

    private static void basicApiSwitchOperation() {
        String input="";
        String result= switch (input){
            case "FACEBOOK","TWITTER","INSTAGRAM" -> "SOCIAL NETWORK";
            case "UDEMY","PLURALITE" -> "EDUCATION";
            default -> {
                if (input.isEmpty()) {
                    yield "Provide some input man";
                }else {
                    yield "HAPPY LIFE";
                }
            }
        };
        System.out.println(result);
    }
}
