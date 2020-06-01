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
        doCompetition();
    }
    public static void doCompetition(){
        Animal cat1 = new Cat("Barsik", 3.33f,400f);
        Animal cat2 = new Cat("Voltik", 2.98f,350f);
        Animal cat3 = new Cat("Timoha", 3.67f,400f);
        Dog dog1 = new Dog("Tuzik", 1.33f,400f,123f);
        Dog dog2 = new Dog("Lessy", 1.13f,600f,144f);
        Animal dog3 = new Dog("Polcan", 2.13f,500f,134f);

        cat1.jump(3.1f);
        cat2.jump(2.99f);
        cat3.jump(3.66f);
        dog1.jump(3.1f);
        dog2.jump(2.99f);
        dog3.jump(3.66f);
        cat1.run(375f);
        cat2.run(575f);
        cat3.run(457f);
        dog1.run(365f);
        dog2.run(675f);
        dog3.run(875f);
        dog1.swim(365f);
        dog2.swim(675f);

    }

}