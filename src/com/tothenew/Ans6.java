package com.tothenew;

public class Ans6 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,7,7,5};
        int result = 0;
        for (int i=0;i < arr.length;i++) {
            result ^= arr[i];
        }
        System.out.println(result);
    }
}
