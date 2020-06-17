package JavaLevel2OOP.lesson_1.animal;

public class Cat extends Animal implements Jump {
    private int jumpHeight;
    public Cat(int hoWRunDistance, int hoWJumpDistance, String name) {
        super(name, hoWRunDistance);
        this.jumpHeight = hoWJumpDistance;
    }

    @Override
    public void run(int dist) {
        super.run(dist);
        //do s omehting
    }

    public void doJump(int height){
            if (this.jumpHeight < height){
                setOnDistance(false);
            }
        }

    }


