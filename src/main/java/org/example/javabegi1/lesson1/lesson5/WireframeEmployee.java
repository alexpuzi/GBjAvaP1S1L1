package org.example.javabegi1.lesson1.lesson5;


public class WireframeEmployee {
    private static String name;
    private static String surname;
    private static String patronymic;
    private static String email;
    private static String position;
    private static int age;
    private static String phone;
    private static int theSalary;

    WireframeEmployee(String name, String patronymic,
                      String surname, String position,
                      String email, int age,
                      String phone, int theSalary) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.theSalary = theSalary;
    }

    public static String getName() {
        return name;
    }

    public static String getPatronymic() {
        return patronymic;
    }

    public static String getSurname() {
        return surname;
    }

    public static String getPosition() {
        return position;
    }

    public static String getEmail() {
        return email;
    }

    public static int getAge() {
        return age;
    }

    public static String getPhone() {
        return phone;
    }

    public static int getTheSalary() {
        return theSalary;
    }

    public void showInfoAboutEmployee(String name, String patronymic,
                                      String surname, String position,
                                      String email, int age,
                                      String phone, int theSalary) {
        System.out.println(String.format(" Mr(Ms) -  %s, %s, %s", name, patronymic, surname));
        System.out.println(String.format(" position & salary -  %s, %s $", position, theSalary));
        System.out.println(String.format("age: " + age + "email: " + email + "phone: " + phone));
    }

    public void showInfoAboutEmployee() {
        String a = " \n";
        System.out.println("name: " + getName() + a + "patronymic: " + getPatronymic() + a +
                "surname: " + getSurname() + a + "position: " + getPosition() + a +
                "email : " + getEmail() + a + "age: " + getAge() + a +
                "phone: " + getPhone() + a + "salary: " + getTheSalary());
    }

}
