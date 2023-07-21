package com.example.demo_oop.model;

public abstract class  Person {
    private String name;
    private String address;
    private int age ;
    private String dob ;

    public Person() {
        this.name = "Trần Tấn Tài";
        this.address = "Long An";
        this.age = 23;
        this.dob = " 05/12/2001";
    }

    public Person(String name, String address, int age, String dob) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

     public void show(){
        System.out.println("Name: "+ this.getName()+"\nAddress: "+ this.getAddress()+"\nAge: "+this.getAge()+"\nDate of birth: "+this.getDob());

    }


}
