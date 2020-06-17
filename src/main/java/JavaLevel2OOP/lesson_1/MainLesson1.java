package JavaLevel2OOP.lesson_1;
//dobmax90@gmail.com -  Maks D. - Jedi


import JavaLevel2OOP.lesson_1.animal.Animal;
import JavaLevel2OOP.lesson_1.animal.Cat;
import JavaLevel2OOP.lesson_1.animal.Men;
import JavaLevel2OOP.lesson_1.animal.Robot;
import JavaLevel2OOP.lesson_1.obstacle.Obstacle;
import JavaLevel2OOP.lesson_1.obstacle.Wall;
import JavaLevel2OOP.lesson_1.obstacle.Treadmill;

public class MainLesson1 {
    public static void main(String[] args){
        Animal[] animals = {
          new Cat(12,15,"Warhammer"),
          new Men("Emperor",14,10),
          new Robot("T1000",12,43)
        };
        Obstacle[] obstacles = {
        new Wall(14), new Treadmill(14)};

        for(Obstacle obstacle : obstacles)
            for(Animal ani:animals){
                obstacle.doEx(ani);
            }

        for(Animal ani : animals){
            System.out.println(ani.getName()+
                    " on parametr "+ ani.onDistance());
        }
    }
}
