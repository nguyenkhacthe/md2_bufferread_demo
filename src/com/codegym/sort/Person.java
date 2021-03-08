package com.codegym.sort;

public class Person {
    private String idNo;
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String idNo, String name, int age, String address) {
        this.idNo = idNo;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return (this.idNo + ","
                + this.name + ","
                + this.age + ","
                + this.address);
    }
}
