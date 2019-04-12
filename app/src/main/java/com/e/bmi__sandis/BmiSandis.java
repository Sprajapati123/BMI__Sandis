package com.e.bmi__sandis;

public class BmiSandis {
    private double height, weight;

    public BmiSandis(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double calculate() {
        return weight / (height/100 * height/100);
    }


}