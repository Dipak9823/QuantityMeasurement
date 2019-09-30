package com.thoughtworks.training.measurement;

import javax.print.attribute.standard.PrintQuality;

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
                return this.unit.conversionToBase(this.value).value == that.unit.conversionToBase(that.value).value;
            }

            return false;
        }
        return false;
    }


    public Quantity add(Quantity that) {

        Quantity myBase=unit.conversionToBase(value);
        Quantity otherBase=that.unit.conversionToBase(that.value);
        if (this.unit.type.equals(that.unit.type))
            return new Quantity(myBase.value + otherBase.value,myBase.unit);

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

