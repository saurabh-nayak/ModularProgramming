package com.saurabh.helper;

import java.util.ArrayList;
import java.util.List;

public class MyDBHelper {

    public static List<Employee> getListEmployee(){
        List<Employee> listEmployee= new ArrayList<>();
        listEmployee.add(new Employee(101,"saurabh",1000000));
        listEmployee.add(new Employee(102,"nikunj",10000));
        listEmployee.add(new Employee(103,"kushal",10000));
        listEmployee.add(new Employee(104,"harsh",1000));
        listEmployee.add(new Employee(105,"ankur",10000));
        return listEmployee;
    }

}
