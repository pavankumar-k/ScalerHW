package com.scaler.lld2;

public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(int id, String name, double salary){
        super(id, name, salary);
        this.setNumWorkingHoursPerWeek(20);
    }
}
