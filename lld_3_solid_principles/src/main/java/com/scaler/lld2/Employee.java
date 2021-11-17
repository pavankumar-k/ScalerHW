package com.scaler.lld2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private double salary;
    private double numWorkingHoursPerWeek;

    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString(){
        return "ID:" + id
                + ", NAME:" + name
                + ", Salary:" + salary;
    }
}
