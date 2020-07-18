package com.avecoder.javafoundations.polymorphism;

public class Cat extends Mammal{

    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void name() {
        System.out.println("I'm a cat");
    }
}
