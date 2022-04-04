package com.company;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = new Cat[7];
        cats[0] = new Cat("Kissy",15);
        cats[1] = new Cat("Bulka",10);
        cats[2] = new Cat("Marsel",25);
        cats[3] = new Cat("Pushok", 11);
        cats[4] = new Cat("Persik", 5);
        cats[5] = new Cat("Robin", 21);
        cats[6] = new Cat("Boris", 31);

        for(Cat cat : cats){
            if (!plate.info(cat.appetit)){
                System.out.println(cat.name + " еще не ел");
                plate.addEat(plate.food, cat.appetit);
                plate.info(plate.food);
            }
            System.out.println(cat.name + " наелся!");
            cat.eat(plate);
        }
    }
}
