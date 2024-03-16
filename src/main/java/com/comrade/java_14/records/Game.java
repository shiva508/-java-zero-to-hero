package com.comrade.java_14.records;

public final class Game {
    private final String name;
    private final Integer score;
    public Game(String name, Integer score) {
        this.name = name;
        this.score = score;
    }
    public String name(){
        return name;
    }
    public Integer score(){
        return score;
    }
}
