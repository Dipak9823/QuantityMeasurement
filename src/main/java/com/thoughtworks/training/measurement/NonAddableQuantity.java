package com.thoughtworks.training.measurement;

public class NonAddableQuantity {
    protected final double value;
    protected final Unit unit;

    public NonAddableQuantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if(other instanceof NonAddableQuantity) {
            NonAddableQuantity that= (NonAddableQuantity) other;
            NonAddableQuantity myBase = unit.conversionToBase(value);
            NonAddableQuantity otherBase = that.unit.conversionToBase(that.value);

            return myBase.unit.equals(otherBase.unit) && myBase.value == otherBase.value;
        }


        return false;
    }
}
