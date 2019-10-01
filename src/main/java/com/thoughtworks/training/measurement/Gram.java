package com.thoughtworks.training.measurement;

public class Gram implements Unit{


    @Override
    public Quantity conversionToBase(double value) {
        return new Quantity(value,new Gram());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Gram;
    }
}
