package com.comrade.interview.parentchildexception;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.text.ParseException;

public class MrfBat extends Bat{

    //Not allowed to throw exception
   /* public void handle()  throws Exception{
        System.out.println("Handle");
    }*/
    //When the parent class method doesn't throw any exceptions, the child class method can't throw any checked exception, but it may throw any unchecked exceptions.
    public void handle() throws IllegalArgumentException {
        System.out.println("Handle");
    }

    //When the parent class method throws one or more checked exceptions, the child class method can throw any unchecked exception.
    public void weight() throws IOException {
        System.out.println("Weight");
    }


    //When the parent class method has a throws clause with an unchecked exception, the child class method can throw none or any number of unchecked exceptions, even though they are not related.
    public void height() throws IllegalArgumentException, BufferOverflowException {
        System.out.println("Height");
    }
}
