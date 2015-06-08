package com.realdolmen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testEmptyString() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(0,calculator.add(""));
    }

    @Test
    public void test1CharString() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(7,calculator.add("7"));
    }

    @Test
    public void testIntAddEquals9() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.add("4,5"));
    }

    @Test
    public void testIntAddEquals8() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add("3,5"));
    }

    @Test
    public void testIntPlusTen() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(27,calculator.add("15,12"));
    }

    @Test
    public void testAllSplitTokens() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add("1\n2,3 4"));
    }

    @Test
    public void testSlashTest() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(3,calculator.add("//;\n1;2"));
    }
}