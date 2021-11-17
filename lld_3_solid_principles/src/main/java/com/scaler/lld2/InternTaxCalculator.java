package com.scaler.lld2;

public class InternTaxCalculator implements TaxCalculator{
    private final double PT_TAX_PER = 20.0;

    public double calculateTotalTaxAmount(final double salary){
        return (salary * PT_TAX_PER)/100;
    }
}
