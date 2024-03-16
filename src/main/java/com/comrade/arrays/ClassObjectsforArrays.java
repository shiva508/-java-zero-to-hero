package com.comrade.arrays;

import org.apache.commons.codec.Charsets;

public class ClassObjectsforArrays {
    public static void main(String[] args) {
        int[] intArray = new int[2];
        byte[] byteArray = new byte[3];
        short[] shortArray = new short[4];
        String[] stringArray = new String[5];
        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(byteArray.getClass().getSuperclass());
        System.out.println(shortArray.getClass());
        System.out.println(shortArray.getClass().getSuperclass());
        System.out.println(stringArray.getClass());
        System.out.println(stringArray.getClass().getSuperclass());

        String name="Shiva";
        byte[] nameByte=name.getBytes(Charsets.UTF_8);
        System.out.println(nameByte);
        String ddd=new String(nameByte, Charsets.UTF_8);
        System.out.println(ddd );
    }
}
