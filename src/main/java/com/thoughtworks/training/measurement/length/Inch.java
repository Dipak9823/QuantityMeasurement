package com.thoughtworks.training.measurement.length;

import com.thoughtworks.training.measurement.AddableQuantity;
import com.thoughtworks.training.measurement.Unit;

public class Inch implements Unit {
    private final int conversionFactor=1;
    @Override
    public AddableQuantity conversionToBase(double value) {
       return new AddableQuantity(value * conversionFactor,  this);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Inch;
    }
}
