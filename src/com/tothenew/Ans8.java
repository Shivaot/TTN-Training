package com.tothenew;

public class Ans8 {
    public static void main(String[] args) {
        StringBuffer sampleText = new StringBuffer("Hello World");
        sampleText.reverse().delete(4,9);
        System.out.println(sampleText);
    }
}
