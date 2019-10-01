package com.thoughtworks.training.measurement.temprature;

import com.thoughtworks.training.measurement.Quantity;
import com.thoughtworks.training.measurement.Unit;
import com.thoughtworks.training.measurement.wieght.Gram;

public class Celsius implements Unit {
    private final double conversionFactor=1;


    @Override
    public Quantity conversionToBase(double value) {
        return new Quantity(0,new Celsius());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Celsius;
    }
}
