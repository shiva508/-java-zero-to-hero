package com.comrade.constructor.chaining;

public class ConstructorChaining {
    public ConstructorChaining() {
        this("Hi !,");
    }

    public ConstructorChaining(String message1) {
        this(message1, "How Are You?");
    }

    public ConstructorChaining(String message1, String message2) {
        System.out.println(message1+" "+message2);
    }
}
