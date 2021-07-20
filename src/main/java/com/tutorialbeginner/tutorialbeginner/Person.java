package com.tutorialbeginner.tutorialbeginner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Person {

    @Autowired
    User user;

    private String name;
    private String surname;
    private String address;
    private int tel;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getTel() {
        return tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", tel=" + tel +
                '}';
    }
}
