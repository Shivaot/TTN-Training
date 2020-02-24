package com.tothenew;

interface myAnotherInterface {
    default void show() {
        System.out.println("Hey from default method");
    }
}
public class Ans7 implements myAnotherInterface {
    public void show() {
        System.out.println("hey from class");
    }

    public static void main(String[] args) {
        Ans7  ans7 = new Ans7();
        ans7.show();
    }

}
