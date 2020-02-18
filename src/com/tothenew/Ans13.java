package com.tothenew;

public class Ans13 {
    public static void main(String[] args) {
        try {
            throw new CustomException("hey i am custom exception");
        } catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
}

class CustomException extends Exception{
    CustomException(String message){
        super(message);
    }
}
