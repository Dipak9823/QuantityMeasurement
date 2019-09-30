package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity zeroFoot = new Quantity(0, Unit.FOOT);
        Quantity anotherZeroFoot = new Quantity(0, Unit.FOOT);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Quantity zeroFoot = new Quantity(0, Unit.FOOT);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity twoFoot = new Quantity(2, Unit.FOOT);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);
        Quantity otherFoot = new Quantity(1.0, Unit.FOOT);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit.INCH);
        Quantity anotherZeroInch = new Quantity(0, Unit.INCH);

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit.INCH);

        assertFalse(zeroInch.equals(new Object()));
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity otherFoot = new Quantity(1, Unit.FOOT);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = new Quantity(1, Unit.INCH);
        Quantity twoInch = new Quantity(2, Unit.INCH);

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = new Quantity(1, Unit.INCH);
        Quantity twoInch = null;

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        Quantity oneInch = new Quantity(1, Unit.INCH);
        Quantity oneFoot = new Quantity(1, Unit.FOOT);

        assertFalse(oneFoot.equals(oneInch));
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit.INCH);
        Quantity zeroFoot = new Quantity(0, Unit.FOOT);

        assertTrue(zeroFoot.equals(zeroInch));
    }

    @Test
    void givenOneInchThreeFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = new Quantity(12, Unit.INCH);
        Quantity oneFoot = new Quantity(1, Unit.FOOT);

        assertTrue(oneFoot.equals(twelveInch));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twentyFourInch = new Quantity(24, Unit.INCH);
        Quantity twoFeet = new Quantity(2, Unit.FOOT);

        assertTrue(twoFeet.equals(twentyFourInch));
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = new Quantity(12, Unit.INCH);
        Quantity oneFoot = new Quantity(1, Unit.FOOT);

        assertTrue(twelveInch.equals(oneFoot));
    }

    @Nested
    class YardTest {
        @Test
        void givenZeroYardAndZeroYard_whenEquals_thenShouldBeEqual() {
            Quantity zeroYard = new Quantity(0, Unit.YARD);
            Quantity anotherZeroYard = new Quantity(0, Unit.YARD);

            assertEquals(zeroYard, anotherZeroYard);
        }

        @Test
        void givenOneYardAndTwoYard_whenEquals_thenShouldBeNotEqual() {
            Quantity oneYard = new Quantity(1, Unit.YARD);
            Quantity twoYard = new Quantity(2, Unit.YARD);

            assertNotEquals(oneYard, twoYard);
        }

        @Test
        void givenOneYardAndThreeFoot_whenEquals_thenShouldBeNotEqual() {
            Quantity oneYard = new Quantity(1, Unit.YARD);
            Quantity threeFoot = new Quantity(3, Unit.FOOT);

            assertEquals(oneYard, threeFoot);
        }
    }

    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeZero() {
        Quantity zeroInch = new Quantity(0, Unit.INCH);

        assertEquals(new Quantity(0, Unit.INCH), zeroInch.add(zeroInch));
    }

    @Test
    void givenOneInchAndZeroInch_WhenAdd_ThenShouldBeOne() {
        Quantity zeroInch = new Quantity(0, Unit.INCH);
        Quantity oneInch = new Quantity(1, Unit.INCH);

        assertEquals(new Quantity(1, Unit.INCH), zeroInch.add(oneInch));
    }

    @Test
    void givenTwoInchAndTwoInch_WhenAdd_ThenShouldBeFour() {
        Quantity twoInches = new Quantity(2, Unit.INCH);

        assertEquals(new Quantity(4, Unit.INCH), twoInches.add(twoInches));
    }

    @Test
    void givenZeroFootAndZeroFoot_WhenAdd_ThenShouldBeZeroFoot() {
        Quantity zeroFoot = new Quantity(0, Unit.FOOT);

        assertEquals(new Quantity(0, Unit.FOOT), zeroFoot.add(zeroFoot));
    }

    @Disabled
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeTwoFeet() {
        Quantity oneFoot = new Quantity(1, Unit.FOOT);

        assertEquals(new Quantity(2, Unit.FOOT), oneFoot.add(oneFoot));
    }

    @Test
    void givenOneFootAndTwoInches_WhenAdd_ThenShouldBeFourteenInches() {
        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity twoInches = new Quantity(2, Unit.INCH);

        assertEquals(new Quantity(14, Unit.INCH), oneFoot.add(twoInches));
    }

    @Disabled
    void givenTwoInchesAndOneFoot_WhenAdd_ThenShouldBeFourteenInches() {
        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity twoInches = new Quantity(2, Unit.INCH);

        assertEquals(new Quantity(14, Unit.INCH), twoInches.add(oneFoot));
    }

    @Test
    void givenZeroLiterAndZeroLiter_WhenAdd_ThenShouldBeZeroLiter() {
        Quantity zeroLiter = new Quantity(0, Unit.LITER);

        assertEquals(new Quantity(0, Unit.LITER), zeroLiter.add(zeroLiter));
    }

    @Disabled
    void givenOneGallonAndOneGallon_WhenAdd_ThenShouldBeTwoGallon() {
        Quantity oneGallon = new Quantity(1, Unit.GALLON);

        assertEquals(new Quantity(2, Unit.GALLON), oneGallon.add(oneGallon));
    }

    @Test
    void givenOneGallonAndOneLiter_WhenAdd_ThenShouldBeFourPointSevenEightLiters() {
        Quantity oneGallon = new Quantity(1, Unit.GALLON);
        Quantity oneLiter = new Quantity(1, Unit.LITER);


        assertEquals(new Quantity(4.779999999999999, Unit.LITER), oneGallon.add(oneLiter));
    }

    @Test
    void givenOneFootAndOneLiter_WhenAdd_ThenShouldThrowIllegalArgumentsException() {
        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity oneLiter = new Quantity(1, Unit.LITER);

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneLiter);
        });
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity oneGallon = new Quantity(1, Unit.GALLON);

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneGallon);
        });
    }

    @Test
    void givenOneInchAndOneLiter_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneInch = new Quantity(1, Unit.INCH);
        Quantity oneLiter = new Quantity(1, Unit.LITER);

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneLiter);
        });
    }

    @Test
    void givenOneInchAndOneGallon_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneInch = new Quantity(1, Unit.INCH);
        Quantity oneGallon = new Quantity(1, Unit.GALLON);

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneGallon);
        });
    }

    @Test
    void givenOneYardAndOneLiter_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneYard = new Quantity(1, Unit.YARD);
        Quantity oneLiter = new Quantity(1, Unit.LITER);

        assertThrows(IllegalArgumentException.class, () -> {
            oneYard.add(oneLiter);
        });
    }

    @Test
    void givenOneYardAndOneGallon_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneYard = new Quantity(1, Unit.YARD);
        Quantity oneGallon = new Quantity(1, Unit.GALLON);

        assertThrows(IllegalArgumentException.class, () -> {
            oneYard.add(oneGallon);
        });
    }

    @Test
    void givenOneInchAndOneLiter_WhenEquals_ThenShouldThrowIllegalArgumentException() {
        Quantity oneInch = new Quantity(1, Unit.INCH);
        Quantity oneLiter = new Quantity(1, Unit.LITER);

        assertFalse(oneInch.equals(oneLiter));
    }

}
