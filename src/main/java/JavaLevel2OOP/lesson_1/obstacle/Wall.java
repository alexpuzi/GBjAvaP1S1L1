package JavaLevel2OOP.lesson_1.obstacle;

import JavaLevel2OOP.lesson_1.animal.Animal;
import JavaLevel2OOP.lesson_1.animal.Jump;

public class Wall extends Obstacle{
    public Wall(int size) {
        super(size);
    }

    @Override
    public void doEx(Animal a) {
        if(a instanceof Jump){
            ((Jump) a).doJump(size);
        }
    }
}
