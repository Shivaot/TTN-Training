package com.tothenew.Ques9;

public class Table extends Furniture implements iFurniture {
    public Table(boolean isWooden, boolean isMetal, int size, String colour, double weight, double density, boolean isFire, boolean isStress) {
        super(isWooden, isMetal, size, colour, weight, density, isFire, isStress);
    }

    public boolean isWooden() {
        return isWooden;
    }

    public boolean isMetal() {
        return isMetal;
    }

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public boolean checkFire() {
        return false;
    }

    @Override
    public boolean checkStress() {
        return false;
    }
}
