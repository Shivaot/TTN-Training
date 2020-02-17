package com.tothenew;

import java.util.HashSet;
import java.util.Set;

public class Ans5 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{3,4,5,6,7};
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<arr1.length;i++) {
            set.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++) {
            if (set.contains(arr2[i])){
                System.out.println("Common elements between 2 arrays are: " + arr2[i]);
            }
        }
    }
}
