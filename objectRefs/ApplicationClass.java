package com.avecoder.javafoundations.objectRefs;

public class ApplicationClass {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        int value = mc.numOne;
        System.out.println("value is " + value);
//
//       System.out.println("ms is " + mc);
//        mc.numOne = 999;
//        mc.numTwo = 1000;
//        System.out.println("mc is " + mc);
//
//        SecondClass sc = new SecondClass();

//        System.out.println("numOne in SecondClass is " + sc.getOneClass().numOne);
//        sc.getOneClass().numOne = 12345;
//        System.out.println("numOne in SecondClass is " + sc.getOneClass().numOne);

//        System.out.println("numOne in a multiple SecondClass is " + sc.getManyClasses()[0].numOne);
//        sc.getManyClasses()[0].numOne = 12345;
//        System.out.println("numOne in a multiple SecondClass is " + sc.getManyClasses()[0].numOne);
//
//        System.out.println("mc is " + mc);
//        mc.myMethod();
//        System.out.println("mc is " + mc);
//
        System.out.println("mc is the same reference as \"this\" "
                            + "inside a method called on mc? " + mc.goCompare(mc));
    }


}
