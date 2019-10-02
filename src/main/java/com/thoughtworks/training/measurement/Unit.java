package com.thoughtworks.training.measurement;

public interface Unit {
    public NonAddableQuantity conversionToBase(double value);
}
