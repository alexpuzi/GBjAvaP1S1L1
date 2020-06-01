package org.example.javabegi1.lesson1.lesson6;

public class Dog extends DogKindOfAnimals{
    private String name;
    private float jump;
    private float run;
    private float swim;

    public Dog(String name, float jump, float run, float swim) {
        this.name = name;
        this.jump = jump;
        this.run = run;
        this.swim = swim;
    }


    @Override
    public void swim(float distance) {
        if (distance < swim) {
            System.out.println(String.format("%s coped with an obstacle. result - %s", info(), swim));
        } else {
            System.out.println(String.format("%s coped with an obstacle. result - %s", info(), swim));
        }
    }

    @Override
    public String info() {
        return name;
    }

    @Override
    public void run(float distance) {
        if(distance<run){
            System.out.println(String.format("%s coped with an obstacle. result - %s",info(),run));
        }else {
            System.out.println(String.format("%s didn't cop with an obstacle. result - %s",info(),run));
        }
    }

    @Override
    public void jump(float height) {
        if (height < jump) {
            System.out.println(String.format("%s coped with an obstacle. result - %s", info(), jump));
        } else {
            System.out.println(String.format("%s didn't cop with an obstacle. result - %s", info(), jump));
        }
    }
}
