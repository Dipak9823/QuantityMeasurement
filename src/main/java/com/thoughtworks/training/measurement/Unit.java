package com.thoughtworks.training.measurement;

public enum Unit {
    INCH(1, Type.length), FOOT(12, Type.length,Unit.INCH), YARD(36, Type.length,Unit.INCH), LITER(1, Type.volume), GALLON(3.78, Type.volume,Unit.LITER);

    enum Type{
        length,
        volume
    }

    private double conversionFactor;
    protected Type type;
    private Unit baseUnit;

    Unit(double conversionFactor, Type type,Unit baseUnit) {
        this.conversionFactor = conversionFactor;
        this.type = type;
        this.baseUnit=baseUnit;
    }

    Unit(double conversionFactor, Type type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
        this.baseUnit=this;
    }
    Quantity conversionToBase(double value) {
        return new Quantity(value * conversionFactor,baseUnit) ;
    }
}
