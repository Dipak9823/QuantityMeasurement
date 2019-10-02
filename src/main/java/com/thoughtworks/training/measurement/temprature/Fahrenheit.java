package com.thoughtworks.training.measurement.temprature;

import com.thoughtworks.training.measurement.NonAddableQuantity;
import com.thoughtworks.training.measurement.Unit;

public class Fahrenheit implements Unit {

    @Override
    public NonAddableQuantity conversionToBase(double value) {
        return new NonAddableQuantity(((value * 9/5)+32), new Celsius());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Celsius;
    }
}
