package com.company.practice1;

public class Hotel extends AbstractLivingPlace implements LivingFee {
    private Type type;
    private boolean withBreakfast;

    public Hotel(String address, double price, Type type, boolean withBreakfast) {
        super(address, price);
        this.type = type;
        this.withBreakfast = withBreakfast;
    }

    public Type getType() {
        return type;
    }

    @Override
    public void payLivingFee(double amount) {
        setPrice(getPrice() + amount);
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isWithBreakfast() {
        return withBreakfast;
    }

    public void setWithBreakfast(boolean withBreakfast) {
        this.withBreakfast = withBreakfast;
    }
}
