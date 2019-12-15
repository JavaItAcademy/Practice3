package com.company.practice1;

import java.util.ArrayList;
import java.util.List;

public class AbstractLivingPlace {
    private String address;
    private double price;
    private List<Person> family = new ArrayList<>();

    public AbstractLivingPlace(String address, double price) {
        this.address = address;
        this.price = price;
    }
    public void addPerson(Person p) {
        family.add(p);
    }
    public int getFamilyPersonCount() {
        return family.size();
    }
    public void removePerson(Person p) {
        family.remove(p);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void live() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AbstractLivingPlace{" +
                "address='" + address + '\'' +
                ", price=" + price +
                ", family=" + family +
                '}';
    }
}
