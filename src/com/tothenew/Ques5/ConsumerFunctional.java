package com.tothenew.Ques5;

import java.util.function.Consumer;

public class ConsumerFunctional {
    public static void main(String[] args) {
        Consumer consumerFunctional = (e) -> {
            System.out.println(e);
        };
        consumerFunctional.accept("Hello");
    }
}
