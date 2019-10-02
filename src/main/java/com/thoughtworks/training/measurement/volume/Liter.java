package com.thoughtworks.training.measurement.volume;

import com.thoughtworks.training.measurement.AddableQuantity;
import com.thoughtworks.training.measurement.Unit;

public class Liter implements Unit {
    private final double conversionFactor = 1;


    @Override
    public AddableQuantity conversionToBase(double value) {

        return new AddableQuantity(value * conversionFactor,  this);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Liter;
    }
}
