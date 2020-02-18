package com.tothenew;

public class Ans2 {
    public static void main(String[] args) {
        String sampleText = "edcba";
        char temp;
        char[] sampleTextArray = sampleText.toCharArray();
        for (int i=0;i<sampleTextArray.length;i++){
            for (int j=i+1;j<sampleTextArray.length;j++){
                if (sampleTextArray[i] > sampleTextArray[j]){
                    temp = sampleTextArray[i];
                    sampleTextArray[i] = sampleTextArray[j];
                    sampleTextArray[j] = temp;
                }
            }
        }
        for (int i=0;i<sampleTextArray.length;i++){
            System.out.println(sampleTextArray[i]);
        }
    }
}
