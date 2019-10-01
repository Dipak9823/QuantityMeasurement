package com.thoughtworks.training.measurement.temprature;

import com.thoughtworks.training.measurement.AddableQuantity;
import com.thoughtworks.training.measurement.NonAddableQuantity;
import com.thoughtworks.training.measurement.NonAddableUnit;

public class Celsius implements NonAddableUnit {
    private final double conversionFactor = 1;


    @Override
    public NonAddableQuantity conversionToBase(double value) {
        return new NonAddableQuantity(value * conversionFactor, new Celsius());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Celsius;
    }
}
