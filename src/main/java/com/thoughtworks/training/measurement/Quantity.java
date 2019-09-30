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

            if (this.unit == Unit.INCH && that.unit == Unit.LITER) {
                return false;
            }

            if ((this.unit == Unit.GALLON || this.unit == Unit.LITER) && (that.unit == Unit.LITER || that.unit == Unit.GALLON)) {
                return this.unit.conversionToBase(this.value, "volume") == that.unit.conversionToBase(that.value, "volume");
            }

            return this.unit.conversionToBase(this.value, "length") == that.unit.conversionToBase(that.value, "length");
        }
        return false;
    }

    public Quantity add(Quantity that) {
        if ((this.unit == Unit.GALLON || this.unit == Unit.LITER) && (that.unit == Unit.LITER || that.unit == Unit.GALLON))
            return new Quantity(unit.conversionToBase(value, "volume") + that.unit.conversionToBase(that.value, "volume"), Unit.LITER);

        return new Quantity(unit.conversionToBase(value, "length") + that.unit.conversionToBase(that.value, "length"), Unit.INCH);
    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}

