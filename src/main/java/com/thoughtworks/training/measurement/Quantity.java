package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof Quantity) {
            Quantity that = (Quantity) other;

            if (this.unit.type.equals(that.unit.type)) {
                return this.unit.conversionToBase(this.value) == that.unit.conversionToBase(that.value);
            }

            return false;
        }
        return false;
    }


    public Quantity add(Quantity that) {
        if (this.unit.type.equals(that.unit.type))
            return new Quantity(unit.conversionToBase(value) + that.unit.conversionToBase(that.value), that.unit);

        throw new IllegalArgumentException("");
    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}

