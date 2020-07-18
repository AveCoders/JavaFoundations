package com.avecoder.javafoundations;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HelloWorld {
    public static void main(String[] args) {
      //  System.out.println(args[0]);
        Calendar cal = new GregorianCalendar(2015, 10, 21);
        System.out.println("cal is " + cal);
        StringBuilder sb = new StringBuilder("XXX");
        System.out.println("sb is " + sb);
    }
}
