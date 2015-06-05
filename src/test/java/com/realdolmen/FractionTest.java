package com.realdolmen;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class FractionTest {
    @Test
    public void simplifyTest(){
        Fraction f = new Fraction(3,15);
        assertEquals("1/5",f.simplify());
    }

    @Test
    public void testasDouble() throws Exception {
        Fraction fr = new Fraction(10,4);
        assertEquals(2.5,fr.asDouble());
    }

    @Test
    public void testEquals() throws Exception {
        Fraction one = new Fraction(3,10);
        Fraction two = new Fraction(6,20);
        assertEquals(true, one.simplify().equals(two.simplify()));
    }

    @Test
    public void testtoString() throws Exception {
        Fraction fraction = new Fraction(5,10);
        assertEquals("5/10",fraction.toString());
    }
}
