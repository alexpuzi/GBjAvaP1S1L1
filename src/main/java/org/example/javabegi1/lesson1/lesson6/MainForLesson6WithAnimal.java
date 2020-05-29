package org.example.javabegi1.lesson1.lesson6;

/*
 *Создать классы Собака и Кот с наследованием
 *от класса Животное.
 *Животные могут выполнять действия:
 *бежать, плыть, перепрыгивать препятствие.
 *В качестве параметра каждому методу передается величина,
 *означающая или длину препятствия (для бега и плавания),
 *или высоту (для прыжков).
 *У каждого животного есть ограничения на действия
 *(бег: кот 200 м., собака 500 м.; прыжок: кот 2 м.
 *, собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
 *При попытке животного выполнить одно из этих действий
 *оно должно сообщить результат в консоль. (Например, dog1.run(150);
 *-> результат: run: true).
 * Добавить животным разброс в ограничениях.
 *То есть у одной собаки ограничение на бег
 *может быть 400 м., у другой 600 м.
 */
public class MainForLesson6WithAnimal {
    public static void main(String[] args) {
        returnAnimalsAndCompetitions();
    }

    //Сравниванием физ. хар-ки животного с препятствием
    public static void сompareAnimalActions(String nameOfAnimals, String nameOfCompetition, int jumpOrSwimOrRunAnimal, float wallOrLakeOrRoad) {
        if (jumpOrSwimOrRunAnimal >= wallOrLakeOrRoad) {
            System.out.println(String.format("%s преодолел припятствие %.3f - %s, резудьтат - %.3f", nameOfAnimals, nameOfCompetition, wallOrLakeOrRoad, jumpOrSwimOrRunAnimal));
        } else System.out.println(String.format("%s - не преодолел препятствие: %.3f - %s, результат - %.3f", nameOfAnimals, nameOfCompetition, wallOrLakeOrRoad, jumpOrSwimOrRunAnimal));
    }

    public static float wallCompetition() {
        Competition wall = new Competition();
        return wall.WALL;
    }

    public static int riverCompetition() {
        Competition river = new Competition();
        return river.RIVER;
    }

    public static int roadCompetition() {
        Competition road = new Competition();
        return road.ROAD;
    }

    public static String giveNameOfWall() {
        Competition wall = new Competition();
        return wall.COMPETITION_WALL;
    }

    public static String giveNameOfRiver() {
        Competition river = new Competition();
        return river.COMPETITION_RIVER;
    }

    public static String giveNameOfRoad() {
        Competition wall = new Competition();
        return wall.COMPETITION_ROAD;

    }
    public  static void returnAnimalsAndCompetitions(){
        Cat cat0 = new Cat("Volt", 200, 3, 30);
        Cat cat1 = new Cat("Felix", 300, 2, 0);
        Cat cat2 = new Cat("Mr. Karapuz", 600, 4, 0);
        Cat cat3 = new Cat("Barsik", 450, 3, 0);
        Dog dog0 = new Dog("Polkan", 2, 121, 56);
        Animal dog1 = new Animal("Sharik", 4, 100, 1000);
        Dog dog2 = new Dog("Lessi", 3, 121, 56);
        Animal dog3 = new Dog("Polkan_2", 5, 100, 1000);
        Animal it = new Animal("IT", 6, 5000, 3000);
        сompareAnimalActions(cat0.info(), giveNameOfRoad(), cat0.getRun(), roadCompetition());
        сompareAnimalActions(cat1.info(), giveNameOfRoad(), cat1.getRun(), roadCompetition());
        сompareAnimalActions(cat2.info(), giveNameOfRoad(), cat2.getRun(), roadCompetition());
        сompareAnimalActions(cat3.info(), giveNameOfRoad(), cat3.getRun(), roadCompetition());
//
//        сompareAnimalActions(cat0.info(), giveNameOfRiver(), cat0.getSwim(), riverCompetition());
//        сompareAnimalActions(cat1.info(), giveNameOfRiver(), cat1.getSwim(), riverCompetition());
//        сompareAnimalActions(cat2.info(), giveNameOfRiver(), cat2.getSwim(), riverCompetition());
//        сompareAnimalActions(cat3.info(), giveNameOfRiver(), cat3.getSwim(), riverCompetition());

//        сompareAnimalActions(cat0.info(), giveNameOfWall(), cat0.getSwim(), wallCompetition());
//        сompareAnimalActions(cat1.info(), giveNameOfWall(), cat0.getSwim(), wallCompetition());
//        сompareAnimalActions(cat2.info(), giveNameOfWall(), cat0.getSwim(), (int) wallCompetition());
//        сompareAnimalActions(cat3.info(), giveNameOfWall(), cat0.getSwim(), (int) wallCompetition());
    }
}