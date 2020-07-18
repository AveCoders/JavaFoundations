package com.avecoder.javafoundations.objectRefs;

import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PassByValue {

    public static void main(String[] args) {
        new PassByValue().go();
    }

    public void tomorrow(Calendar cal) {
        System.out.printf("Calendar before is %tF\n", cal);
        cal.add(Calendar.DATE, 1);
        System.out.printf("Calendar after is %tF\n", cal);
    }


    public static void addOne(int x) {
        System.out.println("int before is " + x);
        x = x + 1;
        System.out.println("int after is " + x);

    }

    public void go() {
        Calendar cal = new GregorianCalendar();
        int x = 1;
        tomorrow(cal);
        addOne(x);

       System.out.printf("Calendar after is %tF\n", cal);
       System.out.println("int after is " + x);
    }
}


