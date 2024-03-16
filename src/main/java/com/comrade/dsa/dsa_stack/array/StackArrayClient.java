package com.comrade.dsa.dsa_stack.array;

public class StackArrayClient {
    public static void main(String[] args) {
        StackArray stackArray=new StackArray();
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.print();
        stackArray.pop();
        stackArray.print();
        stackArray.push(5);
        stackArray.print();
    }
}
