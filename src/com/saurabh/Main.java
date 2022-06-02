package com.saurabh;

import com.saurabh.manager.MyDBManager;

public class Main {

    public static void main(String[] args) {
        System.out.println(MyDBManager.getDBManager().getEmployee());
    }
}
