package com.scaler.lld2;

public class Intern extends Employee{

    public Intern(int id, String name, double salary){
        super(id, name, salary);
        this.setNumWorkingHoursPerWeek(30);
    }
}
