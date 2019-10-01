package com.thoughtworks.training.measurement;

public enum Unit1 {
    INCH(1), FOOT(12, Unit1.INCH), YARD(36, Unit1.INCH), LITER(1), GALLON(3.78, Unit1.LITER);

//    enum Type {
//        length,
//        volume
//    }

    private double conversionFactor;
    //protected Type type;
    private Unit1 baseUnit;

    Unit1(double conversionFactor , Unit1 baseUnit) {
        this.conversionFactor = conversionFactor;
       // this.type = type;
        this.baseUnit = baseUnit;
    }

    Unit1(double conversionFactor) {
        this.conversionFactor = conversionFactor;
        //this.type = type;
        this.baseUnit = this;
    }

    Quantity conversionToBase(double value) {
        return new Quantity(value * conversionFactor, baseUnit);
    }
}
