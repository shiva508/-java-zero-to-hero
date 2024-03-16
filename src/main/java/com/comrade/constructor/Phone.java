package com.comrade.constructor;

public class Phone {
    private String brandName;
    private String colour;
    private Integer ramSize;
    private Double frontCamera;
    private Double backCamera;

    public Phone() {
        this.brandName = "MotoG";
        this.colour = "Mercury";
        this.ramSize = 16;
        this.frontCamera = 8.2;
        this.backCamera = 16.2;
    }

    public Phone(String brandName) {
        super();
        this.brandName = brandName;
    }

    public Phone(String brandName, String colour) {
        super();
        this.brandName = brandName;
        this.colour = colour;
    }

    public Phone(String brandName, String colour, Integer ramSize) {
        super();
        this.brandName = brandName;
        this.colour = colour;
        this.ramSize = ramSize;
    }

    public Phone(String brandName, String colour, Integer ramSize, Double frontCamera) {
        super();
        this.brandName = brandName;
        this.colour = colour;
        this.ramSize = ramSize;
        this.frontCamera = frontCamera;
    }

    public Phone(String brandName, String colour, Integer ramSize, Double frontCamera, Double backCamera) {
        super();
        this.brandName = brandName;
        this.colour = colour;
        this.ramSize = ramSize;
        this.frontCamera = frontCamera;
        this.backCamera = backCamera;
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.brandName);
        Phone phoneSingleParam = new Phone("MotoG");
        Phone phoneTwoParam = new Phone("MotoG", "Mercury");
        Phone phoneThreeParam = new Phone("MotoG", "Mercury", 16);
        Phone phoneFourParam = new Phone("MotoG", "Mercury", 16, 8.2);
        Phone phoneFiveParam = new Phone("MotoG", "Mercury", 16, 8.2, 16.4);
    }

}
