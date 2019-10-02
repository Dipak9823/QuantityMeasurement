package com.thoughtworks.training.measurement.volume;

import com.thoughtworks.training.measurement.AddableQuantity;
import com.thoughtworks.training.measurement.Unit;

public class Gallon implements Unit {
    private final double conversionFactor=3.78;

    @Override
    public AddableQuantity conversionToBase(double value) {
        return new AddableQuantity(value*conversionFactor,new Liter());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Gallon;
    }
}
