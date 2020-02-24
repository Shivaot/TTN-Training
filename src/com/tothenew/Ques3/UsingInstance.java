package com.tothenew.Ques3;

@FunctionalInterface
interface Add {
    int add(int a,int b);
}
@FunctionalInterface
interface Sub {
    int sub(int a,int b);
}

public class UsingInstance {

    public int add(int a,int b) {
        return a+b;
    }

    public int sub(int a,int b) {
        return a-b;
    }

    public static void main(String[] args) {
        Add add = new UsingInstance()::add;
        System.out.println(add.add(2,2));

        Sub sub = new UsingInstance()::sub;
        System.out.println(sub.sub(2,2));
    }
}
