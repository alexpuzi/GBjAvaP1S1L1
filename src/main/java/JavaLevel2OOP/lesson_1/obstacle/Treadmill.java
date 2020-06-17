package JavaLevel2OOP.lesson_1.obstacle;

import JavaLevel2OOP.lesson_1.animal.Animal;

public class Treadmill extends Obstacle{

    public Treadmill(int size) {
        super(size);
    }

    @Override
    public void doEx(Animal a) {
        a.run(size);
    }
}
