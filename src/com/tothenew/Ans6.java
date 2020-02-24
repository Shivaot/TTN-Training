package com.tothenew;

interface myInterface {
    default void show() {
        System.out.println("Hey from default method");
    }

    static void print() {
        System.out.println("Hey from static method");
    }
}

public class Ans6 implements myInterface {
    public static void main(String[] args) {
        Ans6 ans6 = new Ans6();
        ans6.show();
        myInterface.print();
    }
}
