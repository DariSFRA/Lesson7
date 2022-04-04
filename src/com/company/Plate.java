package com.company;

public class Plate {
    public int food;
    boolean full = false;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetit) {
        if (food >= appetit) {
            food -= appetit;
        }
    }

    public boolean info(int appetit) {
        if (food >= appetit) {
            full = true;
            System.out.println("plate: " + food + " ");
        } else {
            full = false;
            System.out.println("Еды мало  ");
        }
        return full;
    }
    public void addEat (int food, int appetit){
        if(food < appetit) {
            this.food = 100;
            System.out.println("Добавили корм");
        }
    }
}
