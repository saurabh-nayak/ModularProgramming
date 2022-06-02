package com.saurabh.helper;

public class Employee {
    private int eid;
    private String eName;
    private double salary;

    public Employee(int eid, String eName, double salary) {
        this.eid = eid;
        this.eName = eName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
