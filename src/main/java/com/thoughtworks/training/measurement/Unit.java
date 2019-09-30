package com.thoughtworks.training.measurement;

public enum Unit {
    INCH(1, Type.length), FOOT(12, Type.length), YARD(36, Type.length), LITER(1, Type.volume), GALLON(3.78, Type.volume);

    enum Type{
        length,
        volume
    }
    private double conversionFactor;
    protected Type type;

    Unit(double conversionFactor, Type type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    double conversionToBase(double value) {
        return value * conversionFactor;
    }
}
