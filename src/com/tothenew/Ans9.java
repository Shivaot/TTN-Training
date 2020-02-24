package com.tothenew;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ans9 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(
        integerList
                .stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList())
        );
    }
}
