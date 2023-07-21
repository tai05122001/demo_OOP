package com.example.demo_oop.model.work;

import com.example.demo_oop.interfaces.IWork;

public class HRWork implements IWork {
    @Override
    public void work() {
        System.out.println("Recruitment for company ");
    }
}
