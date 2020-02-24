package com.tothenew.Ques5;

import java.util.function.Predicate;

public class PredicateFunctional {
    public static void main(String[] args) {
        Predicate<Integer> predicate = e -> e>20;
        System.out.println(predicate.test(21));
    }
}
