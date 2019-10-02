package com.thoughtworks.training.measurement.temprature;

import com.thoughtworks.training.measurement.EquitableQuantity;
import com.thoughtworks.training.measurement.Unit;

public class Fahrenheit implements Unit {

    @Override
    public EquitableQuantity conversionToBase(double value) {
        return new EquitableQuantity(((value * 9/5)+32), new Celsius());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Celsius;
    }
}
