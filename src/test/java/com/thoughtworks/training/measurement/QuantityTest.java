package com.thoughtworks.training.measurement;

import com.thoughtworks.training.measurement.length.Foot;
import com.thoughtworks.training.measurement.length.Inch;
import com.thoughtworks.training.measurement.length.Yard;
import com.thoughtworks.training.measurement.temprature.Celsius;
import com.thoughtworks.training.measurement.temprature.Fahrenheit;
import com.thoughtworks.training.measurement.volume.Gallon;
import com.thoughtworks.training.measurement.volume.Liter;
import com.thoughtworks.training.measurement.wieght.Gram;
import com.thoughtworks.training.measurement.wieght.KiloGram;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        AddableQuantity zeroFoot = new AddableQuantity(0, new Foot());
        AddableQuantity anotherZeroFoot = new AddableQuantity(0, new Foot());

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity zeroFoot = new AddableQuantity(0, new Foot());

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneFoot = new AddableQuantity(1, new Foot());
        AddableQuantity twoFoot = new AddableQuantity(2, new Foot());

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        AddableQuantity oneFoot = new AddableQuantity(1.0, new Foot());
        AddableQuantity otherFoot = new AddableQuantity(1.0, new Foot());

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneFoot = new AddableQuantity(1, new Foot());
        AddableQuantity twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        AddableQuantity zeroInch = new AddableQuantity(0, new Inch());
        AddableQuantity anotherZeroInch = new AddableQuantity(0, new Inch());

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        AddableQuantity zeroInch = new AddableQuantity(0, new Inch());

        assertFalse(zeroInch.equals(new Object()));
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        AddableQuantity oneFoot = new AddableQuantity(1, new Foot());
        AddableQuantity otherFoot = new AddableQuantity(1, new Foot());

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneInch = new AddableQuantity(1, new Inch());
        AddableQuantity twoInch = new AddableQuantity(2, new Inch());

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneInch = new AddableQuantity(1, new Inch());
        AddableQuantity twoInch = null;

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        AddableQuantity oneInch = new AddableQuantity(1, new Inch());
        AddableQuantity oneFoot = new AddableQuantity(1, new Foot());

        assertFalse(oneFoot.equals(oneInch));
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity zeroInch = new AddableQuantity(0, new Inch());
        AddableQuantity zeroFoot = new AddableQuantity(0, new Foot());

        assertTrue(zeroFoot.equals(zeroInch));
    }

    @Test
    void givenOneInchThreeFoot_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity twelveInch = new AddableQuantity(12, new Inch());
        AddableQuantity oneFoot = new AddableQuantity(1, new Foot());

        assertTrue(oneFoot.equals(twelveInch));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity twentyFourInch = new AddableQuantity(24, new Inch());
        AddableQuantity twoFeet = new AddableQuantity(2, new Foot());

        assertTrue(twoFeet.equals(twentyFourInch));
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity twelveInch = new AddableQuantity(12, new Inch());
        AddableQuantity oneFoot = new AddableQuantity(1, new Foot());

        assertTrue(twelveInch.equals(oneFoot));
    }

    @Nested
    class YardTest {
        @Test
        void givenZeroYardAndZeroYard_whenEquals_thenShouldBeEqual() {
            AddableQuantity zeroYard = new AddableQuantity(0, new Yard());
            AddableQuantity anotherZeroYard = new AddableQuantity(0, new Yard());

            assertEquals(zeroYard, anotherZeroYard);
        }

        @Test
        void givenOneYardAndTwoYard_whenEquals_thenShouldBeNotEqual() {
            AddableQuantity oneYard = new AddableQuantity(1, new Yard());
            AddableQuantity twoYard = new AddableQuantity(2, new Yard());

            assertNotEquals(oneYard, twoYard);
        }

        @Test
        void givenOneYardAndThreeFoot_whenEquals_thenShouldBeNotEqual() {
            AddableQuantity oneYard = new AddableQuantity(1, new Yard());
            AddableQuantity threeFoot = new AddableQuantity(3, new Foot());

            assertEquals(oneYard, threeFoot);
        }
    }

    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeZero() {
        AddableQuantity zeroInch = new AddableQuantity(0, new Inch());

        assertEquals(new AddableQuantity(0, new Inch()), zeroInch.add(zeroInch));
    }

    @Test
    void givenOneInchAndZeroInch_WhenAdd_ThenShouldBeOne() {
        AddableQuantity zeroInch = new AddableQuantity(0, new Inch());
        AddableQuantity oneInch = new AddableQuantity(1, new Inch());

        assertEquals(new AddableQuantity(1, new Inch()), zeroInch.add(oneInch));
    }

    @Test
    void givenTwoInchAndTwoInch_WhenAdd_ThenShouldBeFour() {
        AddableQuantity twoInches = new AddableQuantity(2, new Inch());

        assertEquals(new AddableQuantity(4, new Inch()), twoInches.add(twoInches));
    }

    @Test
    void givenZeroFootAndZeroFoot_WhenAdd_ThenShouldBeZeroFoot() {
        AddableQuantity zeroFoot = new AddableQuantity(0, new Foot());

        assertEquals(new AddableQuantity(0, new Foot()), zeroFoot.add(zeroFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeTwoFeet() {
        AddableQuantity oneFoot = new AddableQuantity(1, new Foot());

        assertEquals(new AddableQuantity(2, new Foot()), oneFoot.add(oneFoot));
    }

    @Test
    void givenOneFootAndTwoInches_WhenAdd_ThenShouldBeFourteenInches() {
        AddableQuantity oneFoot = new AddableQuantity(1, new Foot());
        AddableQuantity twoInches = new AddableQuantity(2, new Inch());

        assertEquals(new AddableQuantity(14, new Inch()), oneFoot.add(twoInches));
    }

    @Test
    void givenTwoInchesAndOneFoot_WhenAdd_ThenShouldBeFourteenInches() {
        AddableQuantity oneFoot = new AddableQuantity(1, new Foot());
        AddableQuantity twoInches = new AddableQuantity(2, new Inch());

        assertEquals(new AddableQuantity(14, new Inch()), twoInches.add(oneFoot));
    }

    @Test
    void givenZeroLiterAndZeroLiter_WhenAdd_ThenShouldBeZeroLiter() {
        AddableQuantity zeroLiter = new AddableQuantity(0, new Liter());

        assertEquals(new AddableQuantity(0, new Liter()), zeroLiter.add(zeroLiter));
    }

    @Test
    void givenOneGallonAndOneGallon_WhenAdd_ThenShouldBeTwoGallon() {
        AddableQuantity oneGallon = new AddableQuantity(1, new Gallon());

        assertEquals(new AddableQuantity(2, new Gallon()), oneGallon.add(oneGallon));
    }

    @Test
    void givenOneGallonAndOneLiter_WhenAdd_ThenShouldBeFourPointSevenEightLiters() {
        AddableQuantity oneGallon = new AddableQuantity(1, new Gallon());
        AddableQuantity oneLiter = new AddableQuantity(1, new Liter());


        assertEquals(new AddableQuantity(4.779999999999999, new Liter()), oneGallon.add(oneLiter));
    }

    @Test
    void givenOneFootAndOneLiter_WhenAdd_ThenShouldThrowIllegalArgumentsException() {
        AddableQuantity oneFoot = new AddableQuantity(1, new Foot());
        AddableQuantity oneLiter = new AddableQuantity(1, new Liter());

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneLiter);
        });
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        AddableQuantity oneFoot = new AddableQuantity(1, new Foot());
        AddableQuantity oneGallon = new AddableQuantity(1, new Gallon());

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneGallon);
        });
    }

    @Test
    void givenOneInchAndOneLiter_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        AddableQuantity oneInch = new AddableQuantity(1, new Inch());
        AddableQuantity oneLiter = new AddableQuantity(1, new Liter());

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneLiter);
        });
    }

    @Test
    void givenOneInchAndOneGallon_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        AddableQuantity oneInch = new AddableQuantity(1, new Inch());
        AddableQuantity oneGallon = new AddableQuantity(1, new Gallon());

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneGallon);
        });
    }

    @Test
    void givenOneYardAndOneLiter_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        AddableQuantity oneYard = new AddableQuantity(1, new Yard());
        AddableQuantity oneLiter = new AddableQuantity(1, new Liter());

        assertThrows(IllegalArgumentException.class, () -> {
            oneYard.add(oneLiter);
        });
    }

    @Test
    void givenOneYardAndOneGallon_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        AddableQuantity oneYard = new AddableQuantity(1, new Yard());
        AddableQuantity oneGallon = new AddableQuantity(1, new Gallon());

        assertThrows(IllegalArgumentException.class, () -> {
            oneYard.add(oneGallon);
        });
    }

    @Test
    void givenOneInchAndOneLiter_WhenEquals_ThenShouldThrowIllegalArgumentException() {
        AddableQuantity oneInch = new AddableQuantity(1, new Inch());
        AddableQuantity oneLiter = new AddableQuantity(1, new Liter());

        assertFalse(oneInch.equals(oneLiter));
    }

    @Test
    void givenZeroGramAndZeroGram_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity zeroGram = new AddableQuantity(0, new Gram());
        AddableQuantity anotherZeroGram = new AddableQuantity(0, new Gram());

        assertTrue(zeroGram.equals(anotherZeroGram));
    }

    @Test
    void givenZeroGramAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity zeroGram = new AddableQuantity(0, new Gram());

        assertFalse(zeroGram.equals(new Object()));
    }

    @Test
    void givenOneGramAndOneGram_WhenEquals_ThenShouldBeEqual() {

        AddableQuantity oneGram = new AddableQuantity(1.0, new Gram());
        AddableQuantity otherOneGram = new AddableQuantity(1.0, new Gram());

        assertTrue(oneGram.equals(otherOneGram));
    }

    @Test
    void givenOneGramAndNull_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneFoot = new AddableQuantity(1, new Gram());
        AddableQuantity twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenZeroKiloGramAndZeroKiloGram_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity zeroGram = new AddableQuantity(0, new KiloGram());
        AddableQuantity anotherZeroGram = new AddableQuantity(0, new KiloGram());

        assertTrue(zeroGram.equals(anotherZeroGram));
    }

    @Test
    void givenZeroKiloGramAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity zeroKiloGram = new AddableQuantity(0, new KiloGram());

        assertFalse(zeroKiloGram.equals(new Object()));
    }

    @Test
    void givenOneKiloGramtAndTwoKilogram_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneKiloGram = new AddableQuantity(1, new KiloGram());
        AddableQuantity twoKiloGram = new AddableQuantity(2, new KiloGram());

        assertFalse(oneKiloGram.equals(twoKiloGram));
    }

    @Test
    void givenOneKiloGramtAndOneKilogram_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneKiloGram = new AddableQuantity(1, new KiloGram());
        AddableQuantity twoKiloGram = new AddableQuantity(1, new KiloGram());

        assertTrue(oneKiloGram.equals(twoKiloGram));
    }

    @Test
    void givenZeroGramAndZeroGram_WhenAdd_ThenShouldBeZero() {
        AddableQuantity zeroInch = new AddableQuantity(0, new Gram());

        assertEquals(new AddableQuantity(0, new Gram()), zeroInch.add(zeroInch));
    }

    @Test
    void givenOneGramAndOneGram_WhenAdd_ThenShouldBeZero() {
        AddableQuantity oneGram = new AddableQuantity(1, new Gram());
        AddableQuantity anotherOneGram=new AddableQuantity(1,new Gram());

        assertEquals(new AddableQuantity(2, new Gram()), oneGram.add(anotherOneGram));
    }

    @Test
    void givenZeroKiloGramAndZeroKiloGram_WhenAdd_ThenShouldBeZero() {
        AddableQuantity zeroKiloGram = new AddableQuantity(0, new KiloGram());

        assertEquals(new AddableQuantity(0, new KiloGram()), zeroKiloGram.add(zeroKiloGram));
    }

    @Test
    void givenOneKiloGramAndOneKiloGram_WhenAdd_ThenShouldBeOneKiloGram() {
        AddableQuantity oneKiloGram = new AddableQuantity(1, new KiloGram());
        AddableQuantity anotherOneKiloGram=new AddableQuantity(1,new KiloGram());

        assertEquals(new AddableQuantity(2, new KiloGram()), oneKiloGram.add(anotherOneKiloGram));
    }

    @Test
    void givenOneKiloGramAndOneGram_WhenEquals_ThenShouldNotBeEqual() {
        AddableQuantity oneKiloGram = new AddableQuantity(1, new KiloGram());
        AddableQuantity oneGram=new AddableQuantity(1,new Gram());

        assertNotEquals(oneKiloGram,oneGram);
    }

    @Test
    void givenZeroKiloGramAndZeroGram_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity oneKiloGram = new AddableQuantity(0, new KiloGram());
        AddableQuantity oneGram=new AddableQuantity(0,new Gram());

        assertEquals(oneKiloGram,oneGram);
    }

    @Test
    void givenOneKiloGramAndOneGram_WhenAnd_ThenShouldBeOneThousandOneKiloGram() {
        AddableQuantity oneKiloGram = new AddableQuantity(1, new KiloGram());
        AddableQuantity oneGram=new AddableQuantity(1,new Gram());

        assertEquals(new AddableQuantity(1001,new Gram()),oneKiloGram.add(oneGram));
    }

    //Test cases for Temperature
    @Test
    void givenZeroCelsiusAndZeroCelsius_WhenEquals_ThenShouldBeEqual() {
        NonAddableQuantity zeroCelsius = new NonAddableQuantity(0, new Celsius());
        NonAddableQuantity anotherZeroCelsius = new NonAddableQuantity(0, new Celsius());

        assertTrue(zeroCelsius.equals(anotherZeroCelsius));
    }

    @Test
    void givenOneCelsiusAndOneCelsius_WhenEquals_ThenShouldBeEqual() {
        NonAddableQuantity oneCelsius = new NonAddableQuantity(1, new Celsius());
        NonAddableQuantity anotherOneCelsius = new NonAddableQuantity(1, new Celsius());

        assertTrue(oneCelsius.equals(anotherOneCelsius));
    }

    @Test
    void givenOneCelsiusAndTwoCelsius_WhenEquals_ThenShouldNotBeEqual() {
        NonAddableQuantity oneCelsius = new NonAddableQuantity(1, new Celsius());
        NonAddableQuantity twoCelsius = new NonAddableQuantity(2, new Celsius());

        assertFalse(oneCelsius.equals(twoCelsius));
    }

    @Test
    void givenZeroFahrenheitAndZeroFahrenheit_WhenEquals_ThenShouldBeEqual() {
        NonAddableQuantity zeroFahrenheit = new NonAddableQuantity(0, new Fahrenheit());
        NonAddableQuantity anotherZeroFahrenheit = new NonAddableQuantity(0, new Fahrenheit());

        assertTrue(zeroFahrenheit.equals(anotherZeroFahrenheit));
    }

    @Test
    void givenOneFahrenheitAndOneFahrenheit_WhenEquals_ThenShouldBeEqual() {
        NonAddableQuantity oneFahrenheit = new NonAddableQuantity(1, new Fahrenheit());
        NonAddableQuantity anotherOneFahrenheit = new NonAddableQuantity(1, new Fahrenheit());

        assertTrue(oneFahrenheit.equals(anotherOneFahrenheit));
    }

    @Test
    void givenOneFahrenheitAndTwoFahrenheit_WhenEquals_ThenShouldBeEqual() {
        NonAddableQuantity oneFahrenheit = new NonAddableQuantity(1, new Fahrenheit());
        NonAddableQuantity twoFahrenheit = new NonAddableQuantity(2, new Fahrenheit());

        assertFalse(oneFahrenheit.equals(twoFahrenheit));
    }

    @Test
    void givenOneFahrenheitAndTwoFahrenheit_WhenAdds_ThenShouldBeEqual() {
        NonAddableQuantity oneFahrenheit = new NonAddableQuantity(1, new Fahrenheit());
        NonAddableQuantity twoFahrenheit = new NonAddableQuantity(2, new Fahrenheit());

        //assertEquals(new NonAddableQuantity(3,new Fahrenheit()),oneFahrenheit.add(twoFahrenheit));
    }
}
