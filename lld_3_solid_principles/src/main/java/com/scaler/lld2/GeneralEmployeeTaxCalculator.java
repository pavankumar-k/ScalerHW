package com.scaler.lld2;

public class GeneralEmployeeTaxCalculator implements TaxCalculator{
    private final double PT_TAX_PER = 20;
    private final double EC_TAX_PER = 3;

    public double calculateTotalTaxAmount(final double salary){
        return ((salary * PT_TAX_PER) + (salary * EC_TAX_PER))/100;
    }
}
