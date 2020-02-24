package com.tothenew.Ques5;

import java.util.function.Function;

public class FunctionFunctional {
    public static void main(String[] args) {
        Function<Integer,Integer> function = (a) -> {return a*100;};
        System.out.println(function.apply(2));
    }
}
