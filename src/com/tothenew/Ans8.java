package com.tothenew;

interface justAInterface {
    default void show() {
        System.out.println("hey from justAInterface");
    }
}

interface justAnotherInterface {
    default void show() {
        System.out.println("hey from justAnotherInterface");
    }
}

public class Ans8 implements justAInterface,justAnotherInterface {

    @Override
    public void show() {
        System.out.println("hey from Ans8 class");
    }

    public static void main(String[] args) {
        Ans8 ans8 = new Ans8();
        ans8.show();
    }
}
