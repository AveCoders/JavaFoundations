package com.avecoder.javafoundations.objectRefs;

public class MyClass {
    public int numOne;
    public long numTwo;

    public void myMethod() {
       this.numOne = this.numOne + 1;
        numTwo++;
    }

    public boolean goCompare (MyClass mc) {
        return mc == this;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "numOne=" + numOne +
                ", numTwo=" + numTwo +
                '}';
    }
}
