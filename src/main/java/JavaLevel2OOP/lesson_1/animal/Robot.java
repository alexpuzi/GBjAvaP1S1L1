package JavaLevel2OOP.lesson_1.animal;

public class Robot extends Animal implements Jump{
    private int jumpHeight;
    public Robot(int hoWRunDistance) {
        super(hoWRunDistance);

    }

    public Robot(String name, int hoWRunDistance, int hoWJumpDistance) {
        super(name, hoWRunDistance);
        this.jumpHeight = hoWJumpDistance;
    }
    @Override
    public void run(int dist) {
        super.run(dist);
        //do somehting
    }
    @Override
    public void doJump(int height) {
        if(jumpHeight<height){
            setOnDistance(false);
        }
    }
}
