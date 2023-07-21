package com.example.demo_oop.model;

import com.example.demo_oop.interfaces.IPay;
import com.example.demo_oop.model.work.CEOWork;

import java.util.List;

public class CEO extends Person implements IPay {

    protected List<Staff> list ;
    protected CEOWork ceoWork;

    public List<Staff> getList() {
        return list;
    }

    public void setList(List<Staff> list) {
        this.list = list;
    }

    public CEO(String name, String address, int age, String dob, List<Staff> list ) {
        super(name, address, age, dob);
        this.list = list;
    }

    public CEO(String name, String address, int age, String dob, List<Staff> list, CEOWork ceoWork) {
        super(name, address, age, dob);
        this.list = list;
        this.ceoWork = ceoWork;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Danh sách nhân viên");
        list.forEach(t->t.show());
    }

    @Override
    public int payMent() {
        int tong = 0 ;
        for (int i = 0; i < list.size(); i++) {
           tong+= list.get(i).payMent();

        }
        return (int)(tong*0.4 + 20000000);
    }
}
