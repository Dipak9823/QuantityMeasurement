package com.thoughtworks.training.measurement.length;

import com.thoughtworks.training.measurement.AddableQuantity;
import com.thoughtworks.training.measurement.Unit;

public class Foot implements Unit {
    private final double conversionFactor = 12;

    @Override
    public AddableQuantity conversionToBase(double value) {
        return new AddableQuantity(value * conversionFactor,  new Inch());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Foot;
    }
}
