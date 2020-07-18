package com.avecoder.javafoundations.polymorphism;

public class Dog extends Mammal {

    public void voice() {
        System.out.println("wof wof");
    }

    @Override
    public void name() {
        System.out.println("dog");
    }
}
