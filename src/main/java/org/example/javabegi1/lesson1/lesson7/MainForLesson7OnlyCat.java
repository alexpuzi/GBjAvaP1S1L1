package org.example.javabegi1.lesson1.lesson7;

public class MainForLesson7OnlyCat {
    public static void main(String[] args) {
        createСatsAndPlats();

    }

    public static int doRandomForEat() {
        int i = (int) (Math.random() * 100);
        return i;
    }

    public static void createСatsAndPlats() {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Felix_0", doRandomForEat(), false);
        cat[1] = new Cat("Felix_1", doRandomForEat(), false);
        cat[2] = new Cat("Felix_2", doRandomForEat(), false);
        cat[3] = new Cat("Felix_3", doRandomForEat(), false);
        cat[4] = new Cat("Felix_4", doRandomForEat(), false);
        Plate plate = new Plate(doRandomForEat());
        for (int i = 0; i < cat.length; i++) {
            System.out.println("/************************\'");
            plate.info();
            cat[i].eat(plate);
            plate.addEatInPlate(cat[i].doAppetite());
            System.out.println(cat[i].setSatiety(cat[i].doSatiety(plate.returnFood())));
        }
    }
}
