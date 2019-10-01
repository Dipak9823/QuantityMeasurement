package com.thoughtworks.training.measurement.volume;

import com.thoughtworks.training.measurement.Quantity;
import com.thoughtworks.training.measurement.Unit;

public class Gallon implements Unit {
    private final double conversionFactor=3.78;

    @Override
    public Quantity conversionToBase(double value) {
        return new Quantity(value*conversionFactor,new Liter());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Gallon;
    }
}
