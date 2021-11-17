package com.scaler.lld2;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int id, String name, double salary){
        super(id, name, salary);
        this.setNumWorkingHoursPerWeek(40);
    }
}
