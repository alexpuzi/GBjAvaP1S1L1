package org.example.javabegi1.lesson1.lesson6;

public class Cat extends Animal {
   public Cat(String name, int run, int jump, int swim){
       super(name, run, jump, swim);
   }

    @Override
    public int getJump() {
        int jump = super.getJump();
        return jump;
    }

    @Override
    public int getRun() {
        return super.getRun();
    }

    @Override
    public String info() {
        return super.info();
    }

    @Override
    public int getSwim() {
        return super.getSwim();
    }
}
