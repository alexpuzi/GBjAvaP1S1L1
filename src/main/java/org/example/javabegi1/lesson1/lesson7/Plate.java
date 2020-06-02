package org.example.javabegi1.lesson1.lesson7;

import static org.example.javabegi1.lesson1.lesson7.MainForLesson7OnlyCat.doRandomForEat;

public class Plate {
    private static int food;
    public Plate(int food){
        this.food = food;
    }
    public void info(){
        System.out.println("plate :"+ food);
    }
    public static int returnFood(){
        return food;
    }
    public void decreaseFood(int n, String name){
        if(n>food){
            System.out.println("more appetite than food...");
            System.out.println(String.format("%s don't eat ",name));
        }else{ food -=n;
        System.out.println(String.format("%s поел ", name));}
    }
    public static int addEatInPlate(int n){
        if(food<n)
            System.out.print(" Add eat in plate ...");
        food += doRandomForEat();
        return food;
    }
}
