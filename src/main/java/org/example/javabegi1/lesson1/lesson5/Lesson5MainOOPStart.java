package org.example.javabegi1.lesson1.lesson5;

//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
//  Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
// ...
//persArray[4] = new Person(...);
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
public class Lesson5MainOOPStart {
    public static void main(String[] args) {
        watchByAge();




    }
    public static void objectInitialization(){

    }
    public static void watchByAge(){
        WireframeEmployee[] wireframeEmployee = new WireframeEmployee[5];
        wireframeEmployee[0] = new WireframeEmployee("Vasilii", "Alibabbaevich",
                "Omarov", "tester", "ivivan@mailbox.com",
                26, "898772343", 90000);
        wireframeEmployee[1] = new WireframeEmployee("Aleksei", "Alekseevich",
                "Smirnov", "programmer", "ialekse@box.com",
                43, "898321343", 98000);
        wireframeEmployee[2] = new WireframeEmployee("Pavel", "Vasilevich",
                "Ivanov", "manager", "se@boxer.com",
                46, "898329943", 68000);
        wireframeEmployee[3] = new WireframeEmployee("Danila", "Semenovich",
                "Komarov", "Engineer", "asdf@mailbox.com",
                36, "898672343", 190000);
        wireframeEmployee[4] = new WireframeEmployee("Andrey", "Alekseevich",
                "Panfelov", "Team Lead", "dsfggf@box.com",
                41, "896789543", 398000);
        for (int i = 0; i < wireframeEmployee.length; i++) {
            System.out.println("*******************");
            if (wireframeEmployee[i].getAge() >= 40) {
                System.out.println("Employee have more 40 year old");
                wireframeEmployee[i].showInfoAboutEmployee();
            }
        }
    }
}

