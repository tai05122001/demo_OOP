package com.example.demo_oop.model;

import com.example.demo_oop.interfaces.IPay;

public  abstract class Staff extends Person implements IPay {
    protected String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Staff(String info) {
        this.info = info;
    }

    public Staff(String name, String address, int age, String dob, String info) {
        super(name, address, age, dob);
        this.info = info;
    }

    public Staff(){
        this.info = "NV ARB ";
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Info: " + info);

    }


}
