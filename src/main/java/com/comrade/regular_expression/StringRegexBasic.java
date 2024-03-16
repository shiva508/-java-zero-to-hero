package com.comrade.regular_expression;

public class StringRegexBasic {
    public static void main(String[] args) {
        String stringOne="I am shiva, seems I am struggling";
        String stringOneReplace=stringOne.replaceAll("I","You");
        System.out.println(stringOneReplace);
        String alphaNum="FDDD23023242GESSRSRSSSRSRS";
        String alphaNumReplace=alphaNum.replaceAll("\\.","$");
        System.out.println(alphaNumReplace);
        System.out.println(alphaNumReplace.matches("FDDD"));
        System.out.println(alphaNumReplace.matches("^FDDD"));
        System.out.println(alphaNumReplace.matches("FDDD23023242GESSRSRS"));
        System.out.println(alphaNumReplace.matches("^FDDD23023242GESSRSRS"));
        System.out.println(alphaNumReplace.replaceAll("SSRSRS$","OMEGA"));
        System.out.println(alphaNumReplace.replaceAll("SSRSRS$","OMEGA"));
        String alphaNumReplaceStartWith=alphaNum.replaceAll("[SS]","=");
        System.out.println(alphaNumReplaceStartWith);
    }
}
