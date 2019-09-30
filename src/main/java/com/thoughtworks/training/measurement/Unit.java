package com.thoughtworks.training.measurement;

public enum Unit {
    INCH(1, "length"), FOOT(12, "length"), YARD(36, "length"), LITER(1, "volume"), GALLON(3.78, "volume");

    private double conversionFactor;
    private String type;

    Unit(double conversionFactor, String type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    double conversionToBase(double value, String type) {
        if (this.type.equals(type)) {
            return value * conversionFactor;
        }
        throw new IllegalArgumentException("");
    }
}
