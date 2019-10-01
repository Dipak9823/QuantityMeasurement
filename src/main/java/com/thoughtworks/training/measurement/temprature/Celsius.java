package com.thoughtworks.training.measurement.temprature;

import com.thoughtworks.training.measurement.Quantity;
import com.thoughtworks.training.measurement.Unit;

public class Celsius implements Unit {
    private final double conversionFactor = 1;


    @Override
    public Quantity conversionToBase(double value) {
        return new Quantity(value * conversionFactor, new Celsius());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Celsius;
    }
}
