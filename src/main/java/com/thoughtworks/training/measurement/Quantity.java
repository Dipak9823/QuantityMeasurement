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

            return this.unit.conversionToBase(this.value) == that.unit.conversionToBase(that.value);
        }
        return false;
    }

    public Quantity add(Quantity other) {

        if (this.unit == Unit.FOOT && other.unit == Unit.LITER || this.unit == Unit.FOOT && other.unit == Unit.GALLON) {
            throw new IllegalArgumentException("unit are not of same type");
        }
        if (unit == Unit.GALLON || unit == Unit.LITER)
            return new Quantity(unit.conversionToBase(value) + other.unit.conversionToBase(other.value), Unit.LITER);

        return new Quantity(unit.conversionToBase(value) + other.unit.conversionToBase(other.value), Unit.INCH);
    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}

