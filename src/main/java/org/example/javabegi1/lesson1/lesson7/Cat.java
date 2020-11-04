package org.example.javabegi1.lesson1.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public boolean doSatiety(int n) {
        if (appetite <= n) {
            return true;
        }
        return false;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite, name);
    }

    public int doAppetite() {
        return appetite;
    }

    public boolean setSatiety(boolean n) {
        return satiety = n;
    }
}
