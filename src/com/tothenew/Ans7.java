package com.tothenew;

/*
Number of days = ⌊ n / (24 * 3600) ⌋
Number of Hours = ⌊ (n % (24 * 3600)) / 3600 ⌋
Number of Minutes = ⌊ (n % (24 * 3600 * 3600)) / 60 ⌋
Number of Seconds = ⌊ (n % (24 * 3600 * 3600 * 60)) / 60 ⌋
*/

public class Ans7 {
    public static void main(String[] args) {
        int second = 3691304;
        int days = second / (24 * 3600);

        second = second % (24 * 3600);
        int hour = second / 3600;

        second %= 3600;
        int minutes = second / 60 ;

        second %= 60;
        int seconds = second;
        System.out.println(days + " " + hour + " " + minutes + " " + second );
    }
}
