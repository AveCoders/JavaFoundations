package com.avecoder.javafoundations.objectRefs;

public class SecondClass {

    private MyClass[] mcs = {
            new MyClass(), new MyClass(), new MyClass()
    };

    public MyClass getOneClass() {
        return mcs[0];
    }

    public MyClass[] getManyClasses() {
        return mcs;
    }

    public void displayClasses() {
        System.out.println("Classes: ");
        for (MyClass mc : mcs) {
            System.out.println(mc.toString());
        }
        System.out.println("--------------------//////////////////////|||||||||||||||\\\\\\\\\\\\---------------");
    }
}
