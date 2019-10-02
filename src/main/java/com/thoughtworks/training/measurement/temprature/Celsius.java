package com.thoughtworks.training.measurement.temprature;

import com.thoughtworks.training.measurement.EquitableQuantity;
import com.thoughtworks.training.measurement.Unit;

public class Celsius implements Unit {
    private final double conversionFactor = 1;


    @Override
    public EquitableQuantity conversionToBase(double value) {
        return new EquitableQuantity(value * conversionFactor, new Celsius());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Celsius;
    }
}
