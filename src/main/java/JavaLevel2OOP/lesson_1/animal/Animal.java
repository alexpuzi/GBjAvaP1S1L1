package JavaLevel2OOP.lesson_1.animal;

public class Animal implements Run {
    protected String name;
    private int hoWRunDistance;
    private boolean onDistance = true;

    public boolean onDistance() {
        return onDistance;
    }

    public Animal(int hoWRunDistance) {
        this.hoWRunDistance = hoWRunDistance;
    }
    public  Animal setOnDistance(boolean onDistance){
        this.onDistance = onDistance;
        return this;
    }

    public Animal(String name, int hoWRunDistance) {
        this.name = name;
        this.hoWRunDistance = hoWRunDistance;
    }

    @Override
    public void run(int runDist) {
        if (this.hoWRunDistance < runDist) {
            this.onDistance = false;
        }
    }

    public String getName() {
        return name;
    }
}

