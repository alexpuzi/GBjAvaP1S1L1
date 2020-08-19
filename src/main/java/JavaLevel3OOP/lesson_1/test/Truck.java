package JavaLevel3OOP.lesson_1.test;

public class Truck implements Machine {
    @Override
    public void start() {
        System.out.println("DDDD");
    }

    @Override
    public void stopt() {
        System.out.println("Stop truck");
    }
}
