package com.tothenew.Ques9;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair(true,false,20,"red",100,12.5,false,true);
        System.out.println("----------------------Chair--------------------------------");
        System.out.println(chair.getColour());
        System.out.println(chair.getDensity());
        System.out.println(chair.getSize());
        System.out.println(chair.getWeight());
        System.out.println(chair.isMetal());
        System.out.println(chair.isWooden);
        System.out.println(chair.checkFire());
        System.out.println(chair.checkStress());

        System.out.println("----------------------Table--------------------------------");

        Table table = new Table(false,true,30,"blue",200,22.5,true,false);
        System.out.println(table.getColour());
        System.out.println(table.getDensity());
        System.out.println(table.getSize());
        System.out.println(table.getWeight());
        System.out.println(table.isMetal());
        System.out.println(table.isWooden);
        System.out.println(table.checkFire());
        System.out.println(table.checkStress());
    }
}
