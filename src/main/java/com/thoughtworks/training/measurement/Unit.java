package com.thoughtworks.training.measurement;

public interface Unit {
    Quantity conversionToBase(double value);
}
