package com.thoughtworks.training.measurement.length;

import com.thoughtworks.training.measurement.AddableQuantity;
import com.thoughtworks.training.measurement.Unit;

public class Yard implements Unit {
    private final double conversionFactor=36;

    @Override
    public AddableQuantity conversionToBase(double value) {
        return new AddableQuantity(value * conversionFactor,  new Inch());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Yard;
    }
}
