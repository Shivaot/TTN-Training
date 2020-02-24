package com.tothenew.Ques3;

@FunctionalInterface
interface Mul {
    int mul(int a,int b);
}

public class UsingStatic {
    public static int mul (int a,int b) {return a*b;}

    public static void main(String[] args) {
        Mul mul = UsingStatic::mul;
        System.out.println(mul.mul(2,3));
    }
}
