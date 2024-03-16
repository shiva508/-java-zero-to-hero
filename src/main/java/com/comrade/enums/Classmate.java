package com.comrade.enums;

public enum Classmate {
    SHIVA(408),NITHYA(504),KOUSAR(423),GEETA;
    final Integer rollNumber;
    Classmate(Integer rollNumber){
        this.rollNumber=rollNumber;
    }
    Classmate(){
        this.rollNumber=501;
    }
    public Integer getRollNumber() {
        return rollNumber;
    }
}
