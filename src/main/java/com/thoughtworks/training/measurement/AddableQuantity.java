package com.thoughtworks.training.measurement;

public class AddableQuantity extends EquitableQuantity {
    private final double value;
    private final Unit unit;

    public AddableQuantity(double value, Unit unit) {
        super(value, unit);
        this.value = value;
        this.unit = unit;
    }


    public AddableQuantity add(AddableQuantity that) {

        AddableQuantity myBase = (AddableQuantity) unit.conversionToBase(value);
        AddableQuantity otherBase = (AddableQuantity) that.unit.conversionToBase(that.value);
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

