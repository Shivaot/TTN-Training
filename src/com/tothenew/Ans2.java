package com.tothenew;

import java.util.HashSet;
import java.util.Set;

public class Ans2 {
    public static void main(String[] args) {
        String str = "hey hey I am am repeating";
        Set<String> stringSet = new HashSet<>();
        int counter = 0;
        for (String ch: str.split(" ")){
            if (!stringSet.contains(ch)){
                stringSet.add(ch);
            } else {
                counter++;
                System.out.println(ch);
            }
        }
        System.out.println("Total number of repeating words are: " + counter);
    }
}
