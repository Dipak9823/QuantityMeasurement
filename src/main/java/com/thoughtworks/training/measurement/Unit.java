package com.thoughtworks.training.measurement;

public enum Unit {
    INCH(1), FOOT(12), YARD(36), LITER(1);

    private double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    double conversionToBase(double value) {
        return value * conversionFactor;
    }
}
