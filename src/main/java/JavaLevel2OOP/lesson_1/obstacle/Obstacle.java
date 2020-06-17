package JavaLevel2OOP.lesson_1.obstacle;

import JavaLevel2OOP.lesson_1.animal.Animal;

public abstract class Obstacle {
    protected final int size;

    protected Obstacle(int size) {
        this.size = size;
    }

    public abstract void doEx(Animal a);
}
