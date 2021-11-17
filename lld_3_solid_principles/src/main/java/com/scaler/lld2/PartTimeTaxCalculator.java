package com.scaler.lld2;

public class PartTimeTaxCalculator implements TaxCalculator{
    private final double PT_TAX_PER = 20.0;
    private final double GST_TAX_PER = 5.0;
    private final double ST_TAX_PER = 2.0;

    public double calculateTotalTaxAmount(final double salary){
        return  ((salary * PT_TAX_PER) + (salary * GST_TAX_PER) + (salary * ST_TAX_PER))/100;
    }
}
