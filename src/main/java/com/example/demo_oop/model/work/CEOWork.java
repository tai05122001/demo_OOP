package com.example.demo_oop.model.work;

import com.example.demo_oop.interfaces.IWork;

public class CEOWork implements IWork {
    @Override
    public void work() {
        System.out.println("Operate and coordinator all staff");
    }
}
