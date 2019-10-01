package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity zeroFoot = new Quantity(0, Unit1.FOOT);
        Quantity anotherZeroFoot = new Quantity(0, Unit1.FOOT);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Quantity zeroFoot = new Quantity(0, Unit1.FOOT);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = new Quantity(1, Unit1.FOOT);
        Quantity twoFoot = new Quantity(2, Unit1.FOOT);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = new Quantity(1.0, Unit1.FOOT);
        Quantity otherFoot = new Quantity(1.0, Unit1.FOOT);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = new Quantity(1, Unit1.FOOT);
        Quantity twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit1.INCH);
        Quantity anotherZeroInch = new Quantity(0, Unit1.INCH);

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit1.INCH);

        assertFalse(zeroInch.equals(new Object()));
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = new Quantity(1, Unit1.FOOT);
        Quantity otherFoot = new Quantity(1, Unit1.FOOT);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = new Quantity(1, Unit1.INCH);
        Quantity twoInch = new Quantity(2, Unit1.INCH);

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = new Quantity(1, Unit1.INCH);
        Quantity twoInch = null;

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        Quantity oneInch = new Quantity(1, Unit1.INCH);
        Quantity oneFoot = new Quantity(1, Unit1.FOOT);

        assertFalse(oneFoot.equals(oneInch));
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit1.INCH);
        Quantity zeroFoot = new Quantity(0, Unit1.FOOT);

        assertTrue(zeroFoot.equals(zeroInch));
    }

    @Test
    void givenOneInchThreeFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = new Quantity(12, Unit1.INCH);
        Quantity oneFoot = new Quantity(1, Unit1.FOOT);

        assertTrue(oneFoot.equals(twelveInch));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twentyFourInch = new Quantity(24, Unit1.INCH);
        Quantity twoFeet = new Quantity(2, Unit1.FOOT);

        assertTrue(twoFeet.equals(twentyFourInch));
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = new Quantity(12, Unit1.INCH);
        Quantity oneFoot = new Quantity(1, Unit1.FOOT);

        assertTrue(twelveInch.equals(oneFoot));
    }

    @Nested
    class YardTest {
        @Test
        void givenZeroYardAndZeroYard_whenEquals_thenShouldBeEqual() {
            Quantity zeroYard = new Quantity(0, Unit1.YARD);
            Quantity anotherZeroYard = new Quantity(0, Unit1.YARD);

            assertEquals(zeroYard, anotherZeroYard);
        }

        @Test
        void givenOneYardAndTwoYard_whenEquals_thenShouldBeNotEqual() {
            Quantity oneYard = new Quantity(1, Unit1.YARD);
            Quantity twoYard = new Quantity(2, Unit1.YARD);

            assertNotEquals(oneYard, twoYard);
        }

        @Test
        void givenOneYardAndThreeFoot_whenEquals_thenShouldBeNotEqual() {
            Quantity oneYard = new Quantity(1, Unit1.YARD);
            Quantity threeFoot = new Quantity(3, Unit1.FOOT);

            assertEquals(oneYard, threeFoot);
        }
    }

    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeZero() {
        Quantity zeroInch = new Quantity(0, Unit1.INCH);

        assertEquals(new Quantity(0, Unit1.INCH), zeroInch.add(zeroInch));
    }

    @Test
    void givenOneInchAndZeroInch_WhenAdd_ThenShouldBeOne() {
        Quantity zeroInch = new Quantity(0, Unit1.INCH);
        Quantity oneInch = new Quantity(1, Unit1.INCH);

        assertEquals(new Quantity(1, Unit1.INCH), zeroInch.add(oneInch));
    }

    @Test
    void givenTwoInchAndTwoInch_WhenAdd_ThenShouldBeFour() {
        Quantity twoInches = new Quantity(2, Unit1.INCH);

        assertEquals(new Quantity(4, Unit1.INCH), twoInches.add(twoInches));
    }

    @Test
    void givenZeroFootAndZeroFoot_WhenAdd_ThenShouldBeZeroFoot() {
        Quantity zeroFoot = new Quantity(0, Unit1.FOOT);

        assertEquals(new Quantity(0, Unit1.FOOT), zeroFoot.add(zeroFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeTwoFeet() {
        Quantity oneFoot = new Quantity(1, Unit1.FOOT);

        assertEquals(new Quantity(2, Unit1.FOOT), oneFoot.add(oneFoot));
    }

    @Test
    void givenOneFootAndTwoInches_WhenAdd_ThenShouldBeFourteenInches() {
        Quantity oneFoot = new Quantity(1, Unit1.FOOT);
        Quantity twoInches = new Quantity(2, Unit1.INCH);

        assertEquals(new Quantity(14, Unit1.INCH), oneFoot.add(twoInches));
    }

    @Test
    void givenTwoInchesAndOneFoot_WhenAdd_ThenShouldBeFourteenInches() {
        Quantity oneFoot = new Quantity(1, Unit1.FOOT);
        Quantity twoInches = new Quantity(2, Unit1.INCH);

        assertEquals(new Quantity(14, Unit1.INCH), twoInches.add(oneFoot));
    }

    @Test
    void givenZeroLiterAndZeroLiter_WhenAdd_ThenShouldBeZeroLiter() {
        Quantity zeroLiter = new Quantity(0, Unit1.LITER);

        assertEquals(new Quantity(0, Unit1.LITER), zeroLiter.add(zeroLiter));
    }

    @Test
    void givenOneGallonAndOneGallon_WhenAdd_ThenShouldBeTwoGallon() {
        Quantity oneGallon = new Quantity(1, Unit1.GALLON);

        assertEquals(new Quantity(2, Unit1.GALLON), oneGallon.add(oneGallon));
    }

    @Test
    void givenOneGallonAndOneLiter_WhenAdd_ThenShouldBeFourPointSevenEightLiters() {
        Quantity oneGallon = new Quantity(1, Unit1.GALLON);
        Quantity oneLiter = new Quantity(1, Unit1.LITER);


        assertEquals(new Quantity(4.779999999999999, Unit1.LITER), oneGallon.add(oneLiter));
    }

    @Test
    void givenOneFootAndOneLiter_WhenAdd_ThenShouldThrowIllegalArgumentsException() {
        Quantity oneFoot = new Quantity(1, Unit1.FOOT);
        Quantity oneLiter = new Quantity(1, Unit1.LITER);

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneLiter);
        });
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneFoot = new Quantity(1, Unit1.FOOT);
        Quantity oneGallon = new Quantity(1, Unit1.GALLON);

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneGallon);
        });
    }

    @Test
    void givenOneInchAndOneLiter_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneInch = new Quantity(1, Unit1.INCH);
        Quantity oneLiter = new Quantity(1, Unit1.LITER);

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneLiter);
        });
    }

    @Test
    void givenOneInchAndOneGallon_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneInch = new Quantity(1, Unit1.INCH);
        Quantity oneGallon = new Quantity(1, Unit1.GALLON);

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneGallon);
        });
    }

    @Test
    void givenOneYardAndOneLiter_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneYard = new Quantity(1, Unit1.YARD);
        Quantity oneLiter = new Quantity(1, Unit1.LITER);

        assertThrows(IllegalArgumentException.class, () -> {
            oneYard.add(oneLiter);
        });
    }

    @Test
    void givenOneYardAndOneGallon_WhenAdd_ThenShouldThrowIllegalArgumentException() {
        Quantity oneYard = new Quantity(1, Unit1.YARD);
        Quantity oneGallon = new Quantity(1, Unit1.GALLON);

        assertThrows(IllegalArgumentException.class, () -> {
            oneYard.add(oneGallon);
        });
    }

    @Test
    void givenOneInchAndOneLiter_WhenEquals_ThenShouldThrowIllegalArgumentException() {
        Quantity oneInch = new Quantity(1, Unit1.INCH);
        Quantity oneLiter = new Quantity(1, Unit1.LITER);

        assertFalse(oneInch.equals(oneLiter));
    }

}
