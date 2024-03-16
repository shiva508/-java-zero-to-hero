package com.comrade.java_11.nestedaccess;

import java.lang.reflect.Field;

public class Pitch {
    class Crees{
        private String width="20 cm";
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Crees crees=new Pitch().new Crees();
        System.out.println(crees.width);
        Field field = Crees.class.getDeclaredField("width");
        //field.set(crees,"40 cm");

    }
}
