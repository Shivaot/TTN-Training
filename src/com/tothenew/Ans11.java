package com.tothenew;

import java.util.Arrays;
import java.util.List;

public class Ans11 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        System.out.println(
                integerList
                        .stream()
                        .map(e->e*2)
                        .mapToInt(e->e)
                        .average()
        );
    }
}
