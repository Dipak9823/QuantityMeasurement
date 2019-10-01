package com.thoughtworks.training.measurement;

import com.thoughtworks.training.measurement.length.Foot;
import com.thoughtworks.training.measurement.length.Inch;
import com.thoughtworks.training.measurement.length.Yard;
import com.thoughtworks.training.measurement.volume.Gallon;
import com.thoughtworks.training.measurement.volume.Liter;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity zeroFoot = new Quantity(0, new Foot());
        Quantity anotherZeroFoot = new Quantity(0, new Foot());

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Quantity zeroFoot = new Quantity(0, new Foot());

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = new Quantity(1, new Foot());
        Quantity twoFoot = new Quantity(2, new Foot());

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = new Quantity(1.0, new Foot());
        Quantity otherFoot = new Quantity(1.0, new Foot());

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = new Quantity(1, new Foot());
        Quantity twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = new Quantity(0, new Inch());
        Quantity anotherZeroInch = new Quantity(0, new Inch());

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Quantity zeroInch = new Quantity(0, new Inch());

        assertFalse(zeroInch.equals(new Object()));
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = new Quantity(1, new Foot());
        Quantity otherFoot = new Quantity(1, new Foot());

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = new Quantity(1, new Inch());
        Quantity twoInch = new Quantity(2, new Inch());

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = new Quantity(1, new Inch());
        Quantity twoInch = null;

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        Quantity oneInch = new Quantity(1, new Inch());
        Quantity oneFoot = new Quantity(1, new Foot());

        assertFalse(oneFoot.equals(oneInch));
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInch = new Quantity(0, new Inch());
        Quantity zeroFoot = new Quantity(0, new Foot());

        assertTrue(zeroFoot.equals(zeroInch));
    }

    @Test
    void givenOneInchThreeFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = new Quantity(12, new Inch());
        Quantity oneFoot = new Quantity(1, new Foot());

        assertTrue(oneFoot.equals(twelveInch));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twentyFourInch = new Quantity(24, new Inch());
        Quantity twoFeet = new Quantity(2, new Foot());

        assertTrue(twoFeet.equals(twentyFourInch));
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = new Quantity(12, new Inch());
        Quantity oneFoot = new Quantity(1, new Foot());

        assertTrue(twelveInch.equals(oneFoot));
    }

    @Nested
    class YardTest {
        @Test
        void givenZeroYardAndZeroYard_whenEquals_thenShouldBeEqual() {
            Quantity zeroYard = new Quantity(0, new Yard());
            Quantity anotherZeroYard = new Quantity(0, new Yard());

            assertEquals(zeroYard, anotherZeroYard);
        }

        @Test
        void givenOneYardAndTwoYard_whenEquals_thenShouldBeNotEqual() {
            Quantity oneYard = new Quantity(1, new Yard());
            Quantity twoYard = new Quantity(2, new Yard());

            assertNotEquals(oneYard, twoYard);
        }

        @Test
        void givenOneYardAndThreeFoot_whenEquals_thenShouldBeNotEqual() {
            Quantity oneYard = new Quantity(1, new Yard());
            Quantity threeFoot = new Quantity(3, new Foot());

            assertEquals(oneYard, threeFoot);
        }
    }

    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeZero() {
        Quantity zeroInch = new Quantity(0, new Inch());

        assertEquals(new Quantity(0, new Inch()), zeroInch.add(zeroInch));
    }

    @Test
    void givenOneInchAndZeroInch_WhenAdd_ThenShouldBeOne() {
        Quantity zeroInch = new Quantity(0, new Inch());
        Quantity oneInch = new Quantity(1, new Inch());

        assertEquals(new Quantity(1, new Inch()), zeroInch.add(oneInch));
    }

    @Test
    void givenTwoInchAndTwoInch_WhenAdd_ThenShouldBeFour() {
        Quantity twoInches = new Quantity(2, new Inch());

        assertEquals(new Quantity(4, new Inch()), twoInches.add(twoInches));
    }

    @Test
    void givenZeroFootAndZeroFoot_WhenAdd_ThenShouldBeZeroFoot() {
        Quantity zeroFoot = new Quantity(0, new Foot());

        assertEquals(new Quantity(0, new Foot()), zeroFoot.add(zeroFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeTwoFeet() {
        Quantity oneFoot = new Quantity(1, new Foot());

        assertEquals(new Quantity(2, new Foot()), oneFoot.add(oneFoot));
    }

    @Test
    void givenOneFootAndTwoInches_WhenAdd_ThenShouldBeFourteenInches() {
        Quantity oneFoot = new Quantity(1, new Foot());
        Quantity twoInches = new Quantity(2, new Inch());

        assertEquals(new Quantity(14, new Inch()), oneFoot.add(twoInches));
    }

    @Test
    void givenTwoInchesAndOneFoot_WhenAdd_ThenShouldBeFourteenInches() {
        Quantity oneFoot = new Quantity(1, new Foot());
        Quantity twoInches = new Quantity(2, new Inch());

        assertEquals(new Quantity(14, new Inch()), twoInches.add(oneFoot));
    }

    @Test
    void givenZeroLiterAndZeroLiter_WhenAdd_ThenShouldBeZeroLiter() {
        Quantity zeroLiter = new Quantity(0, new Liter());

        assertEquals(new Quantity(0, new Liter()), zeroLiter.add(zeroLiter));
    }

    @Test
    void givenOneGallonAndOneGallon_WhenAdd_ThenShouldBeTwoGallon() {
        Quantity oneGallon = new Quantity(1, new Gallon());

        assertEquals(new Quantity(2, new Gallon()), oneGallon.add(oneGallon));
    }

    @Test
    void givenOneGallonAndOneLiter_WhenAdd_ThenShouldBeFourPointSevenEightLiters() {
        Quantity oneGallon = new Quantity(1, new Gallon());
        Quantity oneLiter = new Quantity(1, new Liter());


        assertEquals(new Quantity(4.779999999999999, new Liter()), oneGallon.add(oneLiter));
    }

    @Test
    void givenOneFootAndOneLiter_WhenAdd_ThenShouldThrowIllegalArgumentsException() {
        Quantity oneFoot = new Quantity(1, new Foot());
        Quantity oneLiter = new Quantity(1, new Liter());

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneLiter);
        });
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneFoot = new Quantity(1, new Foot());
        Quantity oneGallon = new Quantity(1, new Gallon());

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneGallon);
        });
    }

    @Test
    void givenOneInchAndOneLiter_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneInch = new Quantity(1, new Inch());
        Quantity oneLiter = new Quantity(1, new Liter());

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneLiter);
        });
    }

    @Test
    void givenOneInchAndOneGallon_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneInch = new Quantity(1, new Inch());
        Quantity oneGallon = new Quantity(1, new Gallon());

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneGallon);
        });
    }

    @Test
    void givenOneYardAndOneLiter_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneYard = new Quantity(1, new Yard());
        Quantity oneLiter = new Quantity(1, new Liter());

        assertThrows(IllegalArgumentException.class, () -> {
            oneYard.add(oneLiter);
        });
    }

    @Test
    void givenOneYardAndOneGallon_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneYard = new Quantity(1, new Yard());
        Quantity oneGallon = new Quantity(1, new Gallon());

        assertThrows(IllegalArgumentException.class, () -> {
            oneYard.add(oneGallon);
        });
    }

    @Test
    void givenOneInchAndOneLiter_WhenEquals_ThenShouldThrowIllegalArgumentException() {
        Quantity oneInch = new Quantity(1, new Inch());
        Quantity oneLiter = new Quantity(1, new Liter());

        assertFalse(oneInch.equals(oneLiter));
    }

    @Test
    void givenZeroGramAndZeroGram_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroGram = new Quantity(0, new Gram());
        Quantity anotherZeroGram=new Quantity(0,new Gram());

        assertTrue(zeroGram.equals(anotherZeroGram));
    }

    @Test
    void givenZeroGramAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Quantity zeroGram = new Quantity(0, new Gram());

        assertFalse(zeroGram.equals(new Object()));
    }

    @Test
    void givenOneGramAndOneGram_WhenEquals_ThenShouldBeEqual() {

        Quantity oneGram = new Quantity(1.0, new Gram());
        Quantity otherOneGram = new Quantity(1.0, new Gram());

        assertTrue(oneGram.equals(otherOneGram));
    }

    @Test
    void givenOneGramAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = new Quantity(1, new Gram());
        Quantity twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }
}
