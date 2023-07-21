package com.example.demo_oop.model.work;

import com.example.demo_oop.interfaces.IWork;

public class TesterWork implements IWork {
    @Override
    public void work() {
        System.out.println("Test all application and website for company before release ");
    }
}
