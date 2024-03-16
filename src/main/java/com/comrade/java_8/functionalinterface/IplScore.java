package com.comrade.java_8.functionalinterface;

@FunctionalInterface
public interface IplScore {
    public Double netRunRate(Integer totalScore,Integer numberOfMatches);

    public default String playerDetails(String playerName){
        return playerName+" is right hand batter";
    }
    public static String matchesDetails(String playerName){
        return playerName+" played 180 matches";
    }
}
