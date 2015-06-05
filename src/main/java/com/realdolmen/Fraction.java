package com.realdolmen;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0){
            throw new ArithmeticException();
        }
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private void simplify() {
        int common = Utilities.greatestCommonFactor(numerator, denominator);
        this.numerator = numerator / common;
        this.denominator = denominator / common;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public double asDouble() {
        return ((double) numerator / (double) denominator);
    }

    @Override
    public boolean equals(Object o) {
        Fraction that = (Fraction)o;
        return this.numerator == that.numerator && this.denominator == that.denominator;
    }

    public Fraction reciprocal(){
        int newdenominator =  this.numerator;
        int newnumerator = this.denominator;
        return new Fraction(newnumerator,newdenominator);
    }

    public Fraction multiply(Fraction that){
        int newnumerator = this.numerator*that.numerator;
        int newdenominator = this.denominator*that.denominator;
        return new Fraction (newnumerator,newdenominator);
    }

    public Fraction divide(Fraction that){
        int newnumerator = this.numerator * that.denominator;
        int newdenominator = this.denominator * that.numerator;
        return new Fraction(newnumerator,newdenominator);
    }
}
