package lesson_1.homeWork;


import lesson_1.homeWork.Fruit;

public class Apple extends Fruit {
    public Apple(float weight) {
        super(weight);
    }

    @Override
    public Fruit newInstance() {
        return null;
    }

    @Override
    public float getWeight() {
            return 1.0f;
        }
    }


