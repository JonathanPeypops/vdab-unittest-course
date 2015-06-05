package com.realdolmen;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class FractionTest {
    @Test
    public void simplifyTest(){
        Fraction f = new Fraction(3,15);
        assertEquals("1/5",f.toString());
    }

    @Test
    public void testasDouble() throws Exception {
        Fraction f = new Fraction(10,4);
        assertEquals(2.5,f.asDouble());
    }

    @Test
    public void testEquals() throws Exception {
        Fraction one = new Fraction(3,10);
        Fraction two = new Fraction(6,20);
        assertEquals(true, one.equals(two));
    }

    @Test
    public void testToString() throws Exception {
        Fraction fraction = new Fraction(5,10);
        assertEquals("1/2",fraction.toString());
    }

    @Test
    public void testGetNumerator() throws Exception {
        Fraction f = new Fraction(5,10);
        assertEquals(1,f.getNumerator());
    }

    @Test
    public void testDenominator() throws Exception {
        Fraction f = new Fraction(5,10);
        assertEquals(2,f.getDenominator());
    }

    @Test (expected = ArithmeticException.class)
    public void testFraction() throws Exception {
        Fraction f = new Fraction(5,0);
    }

    @Test
    public void testReciprocal() throws Exception {
        Fraction f = new Fraction(5,8);
        assertEquals(new Fraction(8,5),f.reciprocal());
    }

    @Test
    public void testMultiply() throws Exception {
        Fraction one = new Fraction(5,8);
        Fraction two = new Fraction(3,8);
        Fraction multi = one.multiply(two);
        assertEquals(new Fraction(15,64),multi);
    }
    @Test
    public void testMultiplyNegativeNumerator() throws Exception {
        Fraction one = new Fraction(-5,8);
        Fraction two = new Fraction(3,8);
        Fraction multi = one.multiply(two);
        assertEquals(new Fraction(-15,64),multi);
    }
    @Test
    public void testMultiplyNgeativeDenominator() throws Exception {
        Fraction one = new Fraction(5,-8);
        Fraction two = new Fraction(3,8);
        Fraction multi = one.multiply(two);
        assertEquals(new Fraction(15,-64),multi);
    }
    @Test
    public void testMultiplyBothNegative() throws Exception {
        Fraction one = new Fraction(-5,-8);
        Fraction two = new Fraction(3,8);
        Fraction multi = one.multiply(two);
        assertEquals(new Fraction(15,64),multi);
    }
}
