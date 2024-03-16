package com.comrade.oops.polymorphism.run_time;

public class Bank {
    public double interestRate(float noOfYears){
        double interestRate=0.0d;
        if (noOfYears >0.6f ) {
            interestRate=0.01d;
        } else if (noOfYears>1.0f) {
            interestRate=0.05d;
        }
        return interestRate;
    }
}
