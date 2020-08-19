package JavaLevel3OOP.lesson_1.test;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        doDemo2();
        doDemo2_1();
        ///////////////////

    }
    static void doDemo1(){
        List val = new ArrayList();
        val.add("1");
        val.add("123");
        val.add(1234);
        val.add("-");
        val.add(new Object());
        for(Object v : val){
            try {
                int num = Integer.parseInt(String.valueOf(v));
                System.out.println(num);
            } catch(NumberFormatException e){
                System.out.println("Non-parceble value "+v);
            }
        }
    }
    static void doDemo2(){
        List cars = new ArrayList();
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Integer(1));
        for(Object car : cars) {
            if (car instanceof Car) {
                ((Car) car).drive();
            }else{
                System.out.println("Cannot cast to Car  "+car);
            }
        }
    }
    static void doDemo2_1() {
        List<Car> cars = new ArrayList();
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
//        cars.add(new Object());
       for (Car car : cars) {
           if (car instanceof Car) {
               car.drive();
           }
       }
    }
    static void doDemo3(){
        List<Machine> machines = new ArrayList<>();
        machines.add(new Bus());
        machines.add(new Truck());
        machines.add(new Car());
        for (Machine m: machines){
            m.start();
            m.stopt();
        }
    }
}
