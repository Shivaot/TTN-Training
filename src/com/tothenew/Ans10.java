package com.tothenew;

public class Ans10 {
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2.5,3.6));
        System.out.println(multiply(2,3));
        System.out.println(multiply(2.5,3.2));
        System.out.println(concatString("name ","Shiva"));
        System.out.println(concatString("name ","is ","Shiva"));
    }
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static double add(double num1,double num2){
        return num1+num2;
    }

    public static int multiply(int num1,int num2){
        return num1*num2;
    }
    public static double multiply(double num1,double num2){
        return num1*num2;
    }

    public static String concatString(String str1,String str2){
        return str1+str2;
    }
    public static String concatString(String str1,String str2,String str3){
        return str1+str2+str3;
    }


}
