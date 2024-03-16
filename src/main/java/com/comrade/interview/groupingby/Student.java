package com.comrade.interview.groupingby;

public class Student {
    private String name;
    private int rollNumber;
    private String stndard;

    public Student(String name, int rollNumber, String stndard) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.stndard = stndard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStndard() {
        return stndard;
    }

    public void setStndard(String stndard) {
        this.stndard = stndard;
    }
}
