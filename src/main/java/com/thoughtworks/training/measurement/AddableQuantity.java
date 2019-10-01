package com.thoughtworks.training.measurement;

public class AddableQuantity {
    private final double value;
    private final AddableUnit unit;

    public AddableQuantity(double value, AddableUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof AddableQuantity) {
            AddableQuantity that = (AddableQuantity) other;
            AddableQuantity myBase = unit.conversionToBase(value);
            AddableQuantity otherBase = that.unit.conversionToBase(that.value);

            return myBase.unit.equals(otherBase.unit) && myBase.value == otherBase.value;
        }
        return false;
    }


    public AddableQuantity add(AddableQuantity that) {

        AddableQuantity myBase = unit.conversionToBase(value);
        AddableQuantity otherBase = that.unit.conversionToBase(that.value);
        if (myBase.unit.equals(otherBase.unit))
            return new AddableQuantity(myBase.value + otherBase.value, myBase.unit);

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

