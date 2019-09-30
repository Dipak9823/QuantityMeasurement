package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Length zeroFoot = new Length(0, Unit.FOOT);
        Length anotherZeroFoot = new Length(0, Unit.FOOT);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Length zeroFoot = new Length(0, Unit.FOOT);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Length oneFoot = new Length(1, Unit.FOOT);
        Length twoFoot = new Length(2, Unit.FOOT);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        Length oneFoot = new Length(1.0, Unit.FOOT);
        Length otherFoot = new Length(1.0, Unit.FOOT);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Length oneFoot = new Length(1, Unit.FOOT);
        Length twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Length zeroInch = new Length(0, Unit.INCH);
        Length anotherZeroInch = new Length(0, Unit.INCH);

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Length zeroInch = new Length(0, Unit.INCH);

        assertFalse(zeroInch.equals(new Object()));
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        Length oneFoot = new Length(1, Unit.FOOT);
        Length otherFoot = new Length(1, Unit.FOOT);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Length oneInch = new Length(1, Unit.INCH);
        Length twoInch = new Length(2, Unit.INCH);

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Length oneInch = new Length(1, Unit.INCH);
        Length twoInch = null;

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        Length oneInch = new Length(1, Unit.INCH);
        Length oneFoot = new Length(1, Unit.FOOT);

        assertFalse(oneFoot.equals(oneInch));
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        Length zeroInch = new Length(0, Unit.INCH);
        Length zeroFoot = new Length(0, Unit.FOOT);

        assertTrue(zeroFoot.equals(zeroInch));
    }

    @Test
    void givenOneInchThreeFoot_WhenEquals_ThenShouldBeEqual() {
        Length twelveInch = new Length(12, Unit.INCH);
        Length oneFoot = new Length(1, Unit.FOOT);

        assertTrue(oneFoot.equals(twelveInch));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenEquals_ThenShouldBeEqual() {
        Length twentyFourInch = new Length(24, Unit.INCH);
        Length twoFeet = new Length(2, Unit.FOOT);

        assertTrue(twoFeet.equals(twentyFourInch));
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        Length twelveInch = new Length(12, Unit.INCH);
        Length oneFoot = new Length(1, Unit.FOOT);

        assertTrue(twelveInch.equals(oneFoot));
    }

    @Nested
    class YardTest {
        @Test
        void givenZeroYardAndZeroYard_whenEquals_thenShouldBeEqual() {
            Length zeroYard = new Length(0, Unit.YARD);
            Length anotherZeroYard = new Length(0, Unit.YARD);

            assertEquals(zeroYard, anotherZeroYard);
        }

        @Test
        void givenOneYardAndTwoYard_whenEquals_thenShouldBeNotEqual() {
            Length oneYard = new Length(1, Unit.YARD);
            Length twoYard = new Length(2, Unit.YARD);

            assertNotEquals(oneYard, twoYard);
        }

        @Test
        void givenOneYardAndThreeFoot_whenEquals_thenShouldBeNotEqual() {
            Length oneYard = new Length(1, Unit.YARD);
            Length threeFoot = new Length(3, Unit.FOOT);

            assertEquals(oneYard, threeFoot);
        }
    }

    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeZero() {
        Length zeroInch = new Length(0, Unit.INCH);

        assertEquals(new Length(0, Unit.INCH), zeroInch.add(zeroInch));
    }

    @Test
    void givenOneInchAndZeroInch_WhenAdd_ThenShouldBeOne() {
        Length zeroInch = new Length(0, Unit.INCH);
        Length oneInch = new Length(1, Unit.INCH);

        assertEquals(new Length(1, Unit.INCH), zeroInch.add(oneInch));
    }

    @Test
    void givenTwoInchAndTwoInch_WhenAdd_ThenShouldBeFour() {
        Length twoInches = new Length(2, Unit.INCH);

        assertEquals(new Length(4, Unit.INCH), twoInches.add(twoInches));
    }

    @Test
    void givenZeroFootAndZeroFoot_WhenAdd_ThenShouldBeZeroFoot() {
        Length zeroFoot = new Length(0, Unit.FOOT);

        assertEquals(new Length(0, Unit.FOOT), zeroFoot.add(zeroFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeTwoFeet() {
        Length oneFoot = new Length(1, Unit.FOOT);

        assertEquals(new Length(2, Unit.FOOT), oneFoot.add(oneFoot));
    }

    @Test
    void givenOneFootAndTwoInches_WhenAdd_ThenShouldBeFourteenInches() {
        Length oneFoot = new Length(1, Unit.FOOT);
        Length twoInches = new Length(2, Unit.INCH);

        assertEquals(new Length(14, Unit.INCH), oneFoot.add(twoInches));
    }

    @Test
    void givenTwoInchesAndOneFoot_WhenAdd_ThenShouldBeFourteenInches() {
        Length oneFoot = new Length(1, Unit.FOOT);
        Length twoInches = new Length(2, Unit.INCH);

        assertEquals(new Length(14, Unit.INCH), twoInches.add(oneFoot));
    }

    @Test
    void givenZeroLiterAndZeroLiter_WhenAdd_ThenShouldBeZeroLiter() {
        Length zeroLiter = new Length(0, Unit.LITER);

        assertEquals(new Length(0, Unit.LITER), zeroLiter.add(zeroLiter));
    }

    @Test
    void givenOneGallonAndOneGallon_WhenAdd_ThenShouldBeTwoGallon() {
        Length oneGallon = new Length(1, Unit.GALLON);

        assertEquals(new Length(2, Unit.GALLON), oneGallon.add(oneGallon));
    }

    @Test
    void givenOneGallonAndOneLiter_WhenAdd_ThenShouldBeFourPointSevenEightLiters() {
        Length oneGallon = new Length(1, Unit.GALLON);
        Length oneLiter = new Length(1, Unit.LITER);


        assertEquals(new Length(4.779999999999999, Unit.LITER), oneGallon.add(oneLiter));
    }

    @Test
    void givenOneFootAndOneLiter_WhenAdd_ThenShouldThrowException() {
        Length oneFoot = new Length(1, Unit.FOOT);
        Length oneLiter = new Length(1, Unit.LITER);

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneLiter);
        });
    }

}
