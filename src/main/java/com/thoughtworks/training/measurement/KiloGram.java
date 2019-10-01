package com.thoughtworks.training.measurement;

public class KiloGram implements Unit {
    private final double conversionFactor = 1000;

    @Override
    public Quantity conversionToBase(double value) {
        return new Quantity(value * 1000, new Gram());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof KiloGram;
    }
}
