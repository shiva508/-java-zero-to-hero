package com.comrade.threads.atomicreferance;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicreReranceClient {
    public static void main(String[] args) {
        String oldName = "Shiva";
        String newName = "Batman";
        AtomicReference<String> stringAtomicReference=new AtomicReference<>();
        stringAtomicReference.set("Moon Knight");
        if (stringAtomicReference.compareAndSet(oldName, newName)) {
            System.out.println("New value :" + stringAtomicReference.get());
        } else {
            System.out.println("Nothing changged !");
        }
    }
}
