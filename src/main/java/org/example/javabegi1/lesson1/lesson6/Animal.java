package org.example.javabegi1.lesson1.lesson6;

public class Animal {
    protected String name;
    private int jump;
    private int run;
    private int swim;

    Animal(String name, int jump, int run, int swim) {
        this.name = name;
        this.jump = jump;
        this.run = run;
        this.swim = swim;
    }

    public String info() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }

    public int getSwim() {
        return swim;
    }
}


