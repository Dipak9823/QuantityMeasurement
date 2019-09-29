package com.thoughtworks.training.measurement;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof Length) {
            Length that = (Length) other;
            return this.unit.conversionToBase(this.value) == that.unit.conversionToBase(that.value);
        }
        return false;
    }

    public Length add(Length other) {
        if(unit==Unit.GALLON||unit==Unit.LITER)
            return new Length(unit.conversionToBase(value)+ other.unit.conversionToBase(other.value), Unit.LITER);

        return new Length(unit.conversionToBase(value)+ other.unit.conversionToBase(other.value), Unit.INCH);
    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}

