package com.comrade.interview.parentchildexception;

import java.io.IOException;
import java.text.ParseException;

public class Bat {

    public void handle(){
        System.out.println("Handle");
    }

    public void weight() throws IOException, ParseException {
        System.out.println("Weight");
    }


    public void height() throws IllegalArgumentException{
        System.out.println("Height");
    }
}
