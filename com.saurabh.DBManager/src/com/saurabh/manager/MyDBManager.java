package com.saurabh.manager;

import com.saurabh.helper.Employee;
import com.saurabh.helper.MyDBHelper;

import java.util.List;

public class MyDBManager {
    private MyDBManager() {
    }
    public static MyDBManager getDBManager()
    {
        return new MyDBManager();
    }
    public List<Employee> getEmployee(){
        return MyDBHelper.getListEmployee();
    }

}
