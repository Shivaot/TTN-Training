package com.tothenew;
@FunctionalInterface
interface greaterThan {
    boolean compare(int a,int b);
}
@FunctionalInterface
interface incByOne {
    int increment(int n);
}
@FunctionalInterface
interface concat {
    String conc(String str1,String str2);
}
@FunctionalInterface
interface toUpperCase {
    String upCase(String str);
}
public class Ans1 {
    public static void main(String[] args) {
        greaterThan greaterThan = (a,b) -> {return a>b;};
        System.out.println(greaterThan.compare(5,4));

        incByOne incByOne = (a) -> {return ++a;};
        System.out.println(incByOne.increment(0));

        concat concat = (str1,str2) -> {return str1+str2;};
        System.out.println(concat.conc("firstName","lastName"));

        toUpperCase toUpperCase = (str) -> {return str.toUpperCase();};
        System.out.println(toUpperCase.upCase("hey"));

    }
}
