package com.comrade.constructor;

public class BaseConstructor {
    String name;

    public BaseConstructor() {
        this("");
        System.out.println("DEFAULT CONSTRUCTOR:BaseConstruct");
    }

    public BaseConstructor(String name) {
        this.name = name;
        System.out.println("WITH PARAM BASE CLASS:"+name);
    }
}
