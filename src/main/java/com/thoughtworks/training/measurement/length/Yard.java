package com.thoughtworks.training.measurement.length;

import com.thoughtworks.training.measurement.Quantity;
import com.thoughtworks.training.measurement.Unit;

public class Yard implements Unit {
    private final double conversionFactor=36;

    @Override
    public Quantity conversionToBase(double value) {
        return new Quantity(value * conversionFactor, new Gram());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Yard;
    }
}
