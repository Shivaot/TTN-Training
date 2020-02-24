package com.tothenew;

import java.util.Arrays;
import java.util.List;

public class Ans12 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,2);

                integerList
                        .stream()
                        .filter(e->e%2==0 && e>3)
                        .forEach(System.out::println);


    }
}
