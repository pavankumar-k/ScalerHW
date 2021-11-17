package com.scaler.lld2;

public class FullTimeTaxCalculator implements TaxCalculator{
    private final double PT_TAX_PER = 30.0;
    private final double EC_TAX_PER = 3.0;
    private final double ST_TAX_PER = 2.0;

    public double calculateTotalTaxAmount(final double salary){
        return  ((salary * PT_TAX_PER) + (salary * EC_TAX_PER) + (salary * ST_TAX_PER))/100;
    }
}
