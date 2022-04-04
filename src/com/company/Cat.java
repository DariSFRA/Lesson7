package com.company;

public class Cat {
    public String name;
    public int appetit;
    public Cat(String name, int appetit){
        this.name = name;
        this.appetit = appetit;
    }
    public void eat(Plate p){
        p.decreaseFood(appetit);
    }
}
