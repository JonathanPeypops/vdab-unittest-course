package com.realdolmen;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String simplify() {
        int common = Utilities.greatestCommonFactor(numerator, denominator);
        return (numerator / common) + "/" + (denominator / common);

    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public double asDouble() {
        return ((double) numerator / (double) denominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else {
            return false;
        }
    }
}
