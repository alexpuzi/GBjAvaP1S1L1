package org.example.javabegi1.lesson1.lesson5;

public class Lesson5MainOOPStart {
    public static void main(String[] args) {
        watchByAge();
    }
//    static WireframeEmployee[] getObjectOfWireFrameEmployee(int i){
//        WireframeEmployee[] wireframeEmployee = new WireframeEmployee[i.];
//        if ()
//        wireframeEmployee[0] = new WireframeEmployee("Vasilii", "Alibabbaevich",
//                "Omarov", "tester", "ivivan@mailbox.com",
//                26, "898772343", 90000);
//        wireframeEmployee[1] = new WireframeEmployee("Aleksei", "Alekseevich",
//                "Smirnov", "programmer", "ialekse@box.com",
//                33, "898321343", 98000);
//        wireframeEmployee[2] = new WireframeEmployee("Pavel", "Vasilevich",
//                "Ivanov", "manager", "se@boxer.com",
//                46, "898329943", 68000);
//        wireframeEmployee[3] = new WireframeEmployee("Danila", "Semenovich",
//                "Komarov", "Engineer", "asdf@mailbox.com",
//                36, "898672343", 190000);
//        wireframeEmployee[4] = new WireframeEmployee("Andrey", "Alekseevich",
//                "Panfelov", "Team Lead", "dsfggf@box.com",
//                41, "896789543", 398000);
//    }


    public static void watchByAge() {

        WireframeEmployee[] wireframeEmployee = new WireframeEmployee[5];
        wireframeEmployee[0] = new WireframeEmployee("Vasilii", "Alibabbaevich",
                "Omarov", "tester", "ivivan@mailbox.com",
                26, "898772343", 90000);
        wireframeEmployee[1] = new WireframeEmployee("Aleksei", "Alekseevich",
                "Smirnov", "programmer", "ialekse@box.com",
                33, "898321343", 98000);
        wireframeEmployee[2] = new WireframeEmployee("Pavel", "Vasilevich",
                "Ivanov", "manager", "se@boxer.com",
                46, "898329943", 68000);
        wireframeEmployee[3] = new WireframeEmployee("Danila", "Semenovich",
                "Komarov", "Engineer", "asdf@mailbox.com",
                36, "898672343", 190000);
        wireframeEmployee[4] = new WireframeEmployee("Andrey", "Alekseevich",
                "Panfelov", "Team Lead", "dsfggf@box.com",
                41, "896789543", 398000);
        for (int i = 0; i < 5; i++) {
            System.out.println("*******************");
            wireframeEmployee[i].showInfoAboutEmployee(WireframeEmployee.getName(),wireframeEmployee[i].getPatronymic(),
                    wireframeEmployee[i].getSurname(),wireframeEmployee[i].getPosition(),wireframeEmployee[i].getEmail(),
                    wireframeEmployee[i].getAge(),wireframeEmployee[i].getPhone(),wireframeEmployee[i].getTheSalary());
            System.out.println("*******************");
            int age = wireframeEmployee[i].getAge();
            if (age > 40) {
                System.out.println("Employee have more 40 year old");
                wireframeEmployee[i].showInfoAboutEmployee();

            }
        }
    }
}

