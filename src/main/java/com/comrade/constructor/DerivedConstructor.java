package com.comrade.constructor;

public class DerivedConstructor extends BaseConstructor {
    public DerivedConstructor() {
        System.out.println("DEFAULT CONSTRUCTOR:DerivedConstruct");
    }
    public DerivedConstructor(String name) {
        super(name);
        System.out.println("PARAMETER CONSTRUCTOR:"+name);
    }

    public static void main(String[] args) {
        DerivedConstructor construct=new DerivedConstructor("Shiva");
    }
}
