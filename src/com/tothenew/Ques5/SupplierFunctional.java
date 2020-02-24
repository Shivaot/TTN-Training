package com.tothenew.Ques5;

import java.util.function.Supplier;

public class SupplierFunctional {
    public static void main(String[] args) {
        Supplier supplier = () -> 2;
        System.out.println(supplier.get());
    }
}
