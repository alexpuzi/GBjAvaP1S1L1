package JavaLevel2OOP.lesson_1.animal;

public class Animal implements Run{
    protected String name;
    private int hoWRunDistance;

    public boolean runDistance(){
        return runDistance;
    }

    public Animal setStatusOfDistance(boolean runDistance){
        this.runDistance = runDistance;
        return this;
    }

    @Override
    public void run(int run) {

    }
}
