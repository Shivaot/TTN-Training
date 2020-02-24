package com.tothenew;

import java.util.Arrays;
import java.util.List;

public class Ans10 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(
                integerList
                .stream()
                .filter(e->e>5)
                .mapToInt(e->e)
                .sum()
        );
    }
}
