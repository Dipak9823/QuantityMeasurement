package com.thoughtworks.training.measurement.volume;

import com.thoughtworks.training.measurement.Quantity;
import com.thoughtworks.training.measurement.Unit;

public class Liter implements Unit {
    private final double conversionFactor = 1;


    @Override
    public Quantity conversionToBase(double value) {

        return new Quantity(value * conversionFactor,this);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Liter;
    }
}
