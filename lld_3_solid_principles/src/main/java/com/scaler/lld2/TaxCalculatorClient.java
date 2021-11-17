package com.scaler.lld2;

public class TaxCalculatorClient {
    private Employee employee;

    TaxCalculatorClient(Employee employee){
        this.employee = employee;
    }

    public double caluculateTax(){
        TaxCalculator taxCalculator;
        if ( employee.getClass() == FullTimeEmployee.class){
            taxCalculator = new FullTimeTaxCalculator();
        }else if (employee.getClass() == PartTimeEmployee.class){
            taxCalculator = new PartTimeTaxCalculator();
        }else if(employee.getClass() == Intern.class){
            taxCalculator = new InternTaxCalculator();
        }else{
            taxCalculator = new GeneralEmployeeTaxCalculator();
        }
        return taxCalculator.calculateTotalTaxAmount(employee.getSalary());
    }


}
