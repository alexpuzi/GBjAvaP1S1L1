package JavaLevel2OOP.lesson_1.animal;

public class Men extends Animal implements Jump {
    private int jumpHeight;
    public Men(int hoWRunDistance) {
        super(hoWRunDistance);

    }

    public Men(String name, int hoWRunDistance, int hoWJumpDistance) {
        super(name, hoWRunDistance);
        this.jumpHeight = hoWJumpDistance;
    }
    @Override
    public void run(int dist) {
        super.run(dist);
        //dosomehting
    }
    @Override
    public void doJump(int height) {
        if(jumpHeight<height){
            setOnDistance(false);
        }
    }
}
