package lesson_1.homeWork;

public abstract class Fruit {
    protected float weight;

    public abstract Fruit newInstance();

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}
