package com.tothenew;


public class Ans2 {
    public static void main(String[] args) {
        String str = "hey hey i am am repeating";
        int count;

        String words[] = str.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for(int i = 0; i < words.length; i++) {
            count=1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    words[j] = "";
                }
            }
            if(count > 1 && words[i] != "")
                System.out.println(words[i]);
        }
    }
}

