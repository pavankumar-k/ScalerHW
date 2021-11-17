package com.scaler.lld2;

import java.util.ArrayList;
import java.util.List;

public class driver {
    public static void main(String[] orgs){
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new FullTimeEmployee(1, "emp1", 30000));
        employees.add(new FullTimeEmployee(2, "emp2", 20000));
        employees.add(new FullTimeEmployee(3, "emp3", 10000));
        employees.add(new FullTimeEmployee(4, "emp4", 50000));
        employees.add(new FullTimeEmployee(5, "emp5", 40000));

        for (Employee employee: employees){
            System.out.println(employee.toString());
            TaxCalculatorClient taxCalculatorClient = new TaxCalculatorClient(employee);
            System.out.println("Tax:" + taxCalculatorClient.caluculateTax());
        }
    }
}
