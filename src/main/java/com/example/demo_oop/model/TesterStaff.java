package com.example.demo_oop.model;

import com.example.demo_oop.model.work.TesterWork;

public class TesterStaff extends Staff{
    protected int id ;
    protected String detailsWork ;
    protected int dayWork ;

    protected int bonus ;
    protected TesterWork detailWork;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TesterWork getDetailWork() {
        return detailWork;
    }

    public void setDetailWork(TesterWork detailWork) {
        this.detailWork = detailWork;
    }

    public TesterStaff( int id, String name, String address, int age, String dob, String info, String detailsWork, int dayWork, TesterWork testerWork) {
        super(name, address, age, dob, info);
        this.id = id;
        this.detailsWork = detailsWork;
        this.dayWork = dayWork;
        this.bonus = this.bonus = dayWork>=20?1000000:(dayWork>=10?500000:200000);
        this.detailWork = testerWork;
    }

    public TesterStaff(int id , String name, String address, int age, String dob, String info, String detailsWork, int dayWork) {
        super(name, address, age, dob, info);
        this.id = id ;
        this.detailsWork = detailsWork;
        this.dayWork = dayWork;
        this.bonus = this.bonus = dayWork>=20?1000000:(dayWork>=10?500000:200000);
    }

    public String getDetailsWork() {
        return detailsWork;
    }

    public void setDetailsWork(String detailsWork) {
        this.detailsWork = detailsWork;
    }

    public int getDayWork() {
        return dayWork;
    }

    public void setDayWork(int dayWork) {
        this.dayWork = dayWork;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Details work: " + detailsWork);
        System.out.println("Salary: " + changeCurrency(payMent()));
        detailWork.work();
        System.out.println("--------------------------");

    }

    @Override
    public int payMent() {
        return (int)(dayWork * 450000 + bonus*1.5);
    }
}
