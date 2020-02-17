package com.tothenew;

public class Ans4 {
    public static void main(String[] args) {
        String sampleText = "I am string @ # I AM STRING 1 2";
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        char ch;
        for (int i=0;i<sampleText.length();i++) {
            ch = sampleText.charAt(i);
            if (Character.isUpperCase(ch)){
                upperCaseCount++;
            }
            else if(Character.isLowerCase(ch)){
                lowerCaseCount++;
            }
            else if(Character.isDigit(ch)){
                digitCount++;
            }
            else{
                specialCharCount++;
            }
        }
        System.out.println("Number of UpperCase = " + upperCaseCount);
        System.out.println("Percentage of UpperCase = " + ((double)upperCaseCount/sampleText.length()) * 100 + " %");
        System.out.println("Number of LowerCase = " + lowerCaseCount);
        System.out.println("Percentage of LowerCase = " + ((double)lowerCaseCount/sampleText.length()) * 100 + " %");
        System.out.println("Percentage of Digit = " + digitCount);
        System.out.println("Percentage of Digit = " + ((double)digitCount/sampleText.length()) * 100 + " %");
        System.out.println("Number of Special Characters = " + specialCharCount);
        System.out.println("Percentage of UpperCase = " + ((double)specialCharCount/sampleText.length()) * 100 + " %");
    }
}
