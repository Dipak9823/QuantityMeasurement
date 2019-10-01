package com.thoughtworks.training.measurement.length;

import com.thoughtworks.training.measurement.Quantity;
import com.thoughtworks.training.measurement.Unit;

public class Foot implements Unit {
    private final double conversionFactor = 12;

    @Override
    public Quantity conversionToBase(double value) {
        return new Quantity(value * conversionFactor, new Gram());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Foot;
    }
}
