package com.example.demo_oop.model.work;

import com.example.demo_oop.interfaces.IWork;

public class DevWork implements IWork {
    @Override
    public void work() {
        System.out.println("Application and website programming");
    }
}
