package org.example.javabegi1.lesson1.lesson6;

public class Cat extends FelineAnimals {
    private String name;
    private float jump;
    private float run;

    public Cat(String name, float jump, float run) {
        this.name = name;
        this.jump = jump;
        this.run = run;
    }

    @Override
    public String info() {
        return name;
    }

    @Override
    public void run(float distance) {
        if(distance<run){
            System.out.println(String.format("%s coped with an obstacle. result - %s",name,run));
        }else {
            System.out.println(String.format("%s didn't cop with an obstacle. result - %s",name,run));
        }
    }

    @Override
    public void jump(float height) {
        if (height < jump) {
            System.out.println(String.format("%s coped with an obstacle. result - %s", name, jump));
        } else {
            System.out.println(String.format("%s didn't cop with an obstacle. result - %s", name, jump));        }
    }
}
