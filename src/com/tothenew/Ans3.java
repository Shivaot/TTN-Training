package com.tothenew;

public class Ans3 {
    public static void main(String[] args) {
        String str = "aabbbd";
        System.out.println(countOccurWithoutLoop(str,'a',0));
    }

    private static int countOccurWithoutLoop(String str, char a, int i) {
        if (i >= str.length()) return 0;
        int eachCharCount;
        if (str.charAt(i) == a) eachCharCount = 1;
        else eachCharCount = 0;
        return eachCharCount + countOccurWithoutLoop(str, a, i + 1);
    }
}
