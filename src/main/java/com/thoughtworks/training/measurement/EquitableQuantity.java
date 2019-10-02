package com.thoughtworks.training.measurement;

public class EquitableQuantity {
    protected final double value;
    protected final Unit unit;

    public EquitableQuantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if(other instanceof EquitableQuantity) {
            EquitableQuantity that= (EquitableQuantity) other;
            EquitableQuantity myBase = unit.conversionToBase(value);
            EquitableQuantity otherBase = that.unit.conversionToBase(that.value);

            return myBase.unit.equals(otherBase.unit) && myBase.value == otherBase.value;
        }


        return false;
    }
}
