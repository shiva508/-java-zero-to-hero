package com.comrade.constructor;

public class Bat {
    String height;
    String width;
    public Bat() {
        this.height="1M";
        this.width="1M";
    }

    public Bat(String height, String width) {
        super();
        this.height = height;
        this.width = width;
        System.out.println("Super class constructor is called");
    }
}
