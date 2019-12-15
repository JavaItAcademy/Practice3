package com.company.practice2;

import java.util.List;

public class Me implements Eating, Going {
    private int age;
    private List<Education> educationList;

    @Override
    public void eat(AbstractFood food) throws Exception {
        System.out.println("I am eating " + food);
        if (food instanceof Honey)
            throw new AllergyException("I don't eat honey");
        //Write to file
    }
    @Override
    public void goTo(Direction direction) throws Exception {
        System.out.println("I am going to " + direction);
        if (direction == null)
            throw new Exception("Nowhere to go");
    }
}
class Me2 {
    private int age;
    private Eating eating;
    private Going going;
    public void growUp() {
        age -= -1;
        System.out.println("I am growing up");
    }
    public void study(){
        System.out.println("I am studying");
    }
}

interface Eating {
    void eat(AbstractFood food) throws Exception;
}
interface Going {
    void goTo(Direction direction) throws Exception;
}