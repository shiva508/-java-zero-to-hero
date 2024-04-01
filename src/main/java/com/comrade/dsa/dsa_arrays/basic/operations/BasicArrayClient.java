package com.comrade.dsa.dsa_arrays.basic.operations;

public class BasicArrayClient {
    public static void main(String[] args) {
        BasicArrayOperations basicArray=new BasicArrayOperations();
        basicArray.push(1);
        basicArray.push(2);
        basicArray.push(3);
        basicArray.printData();
        basicArray.pop();
        basicArray.printData();
        basicArray.push(3);
        basicArray.push(4);
        basicArray.push(5);
        basicArray.printData();
        basicArray.deleteValue(3);
        basicArray.printData();

    }
}
