package com.thoughtworks.training.measurement.wieght;

import com.thoughtworks.training.measurement.AddableQuantity;
import com.thoughtworks.training.measurement.AddableUnit;

public class Gram implements AddableUnit {

    private final double conversionFactor = 1;

    @Override
    public AddableQuantity conversionToBase(double value) {
        return new AddableQuantity(value * conversionFactor, new Gram());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Gram;
    }
}
