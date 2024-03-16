package com.comrade.interview.abstractchallenge;

public class ExpenditureClient {
    public static final int BASIC = 408;
    public static void main(String[] args) {
        FunctionExpenditure functionExpenditure = new FunctionExpenditure() {
            @Override
            public int expectedExpenditure(int initial) {
                return initial;
            }
        };

        ExpenditureClient expenditureClient = new ExpenditureClient();
        FunctionOrganizer functionOrganizer =  expenditureClient.new FunctionOrganizer(){
            public int expectedExpenditure(int initial) {
                return initial;
            }
        };
        System.out.println(functionExpenditure.expectedExpenditure(BASIC));
        System.out.println(functionOrganizer.expectedExpenditure(BASIC));
        System.out.println(functionOrganizer.expectedExpenditure(Integer.valueOf(BASIC)));

    }

    abstract class FunctionOrganizer implements BirthdayExpenditure{
        public int expectedExpenditure(Integer initial) {
            return initial*2;
        }
    }
}
