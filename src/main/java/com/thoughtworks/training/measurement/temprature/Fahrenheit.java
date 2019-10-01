package com.thoughtworks.training.measurement.temprature;

import com.thoughtworks.training.measurement.Quantity;
import com.thoughtworks.training.measurement.Unit;

public class Fahrenheit implements Unit {
   // private final double conversionFactor = 1;

    @Override
    public Quantity conversionToBase(double value) {
        return new Quantity(((value * 9/5)+32), new Celsius());
    }
}
