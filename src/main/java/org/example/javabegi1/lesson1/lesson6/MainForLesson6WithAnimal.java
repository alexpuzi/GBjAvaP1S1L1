package org.example.javabegi1.lesson1.lesson6;

/*
 Расширить задачу про котов и тарелки с едой.
Сделать так, чтобы в тарелке с едой не могло получиться
отрицательного количества еды (например, в миске 10 еды,
а кот пытается покушать 15-20).
Каждому коту нужно добавить поле сытость (когда создаем котов,
они голодны). Если коту удалось покушать (хватило еды), сытость = true.
Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
то есть не может быть наполовину сыт (это сделано для упрощения логики
программы).
Создать массив котов и тарелку с едой, попросить всех котов
покушать из этой тарелки и потом вывести информацию
о сытости котов в консоль.
Добавить в тарелку метод, с помощью которого можно
было бы добавлять еду в тарелку.

 */
public class MainForLesson6WithAnimal {
    public static void main(String[] args) {
        doCompetitionForLesson6();
    }
    public static void doCompetitionForLesson6(){
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