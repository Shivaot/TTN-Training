package com.tothenew;

@FunctionalInterface
interface Take2ReturnOne {
    int returnOne (int a,int b);
}

public class Ans2 {
    public static void main(String[] args) {
        Take2ReturnOne take2ReturnOne = (a,b) -> a;
        System.out.println(take2ReturnOne.returnOne(2,3));
    }
}
