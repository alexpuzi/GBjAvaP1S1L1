package org.example.lesson1;

import java.util.Scanner;

//        +1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
//        +2. Создать переменные всех пройденных типов данных,
//        и инициализировать их значения;
//        +3. Написать метод вычисляющий выражение a * (b + (c / d))
//        и возвращающий результат,где a, b, c, d – входные параметры
//        этого метода;
//        +4. Написать метод, принимающий на вход два числа, и
//        проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
//
//        если да – вернуть true, в противном случае – false;
//        5. Написать метод, которому в качестве параметра передается
//        целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
//        6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
//        7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
//        8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
public class Lesson1Main {
    public static void main(String[] args) {
        byte byteVar = -127;
        short shortVar = 32767;
        int intVar = 32312133;
        double doubleVar = 123123.34343;
        long longVar = 922337203685475800l;
        String stringVar = "String Class";
        char charVar = 6567;
        boolean booleanVar = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("пункт 2: ");

        System.out.println("переменная byte - " + byteVar);
        System.out.println("переменная short - " + shortVar);
        System.out.println("переменная int - " + intVar);
        System.out.println("переменная double - " + doubleVar);
        System.out.println("переменная long - " + longVar);
        System.out.println("переменная String - " + stringVar);
        System.out.println("переменная char - " + charVar);
        System.out.println("переменная boolean - " + booleanVar);
        ClassForMethods.borderL();
        System.out.println("пункт 3: ");
        int a, b, c, d, result;
        System.out.println("enter num a: ");
        a = scanner.nextInt();
        System.out.println("enter num b: ");
        b = scanner.nextInt();
        System.out.println("enter num c: ");
        c = scanner.nextInt();
        System.out.println("enter num d: ");
        d = scanner.nextInt();
        result = ClassForMethods.method1(a, b, c, d);
        System.out.println("результат работы метода вычисляющий " +
                "выражение a * (b + (c / d)) ="+ result);
        ClassForMethods.borderL();
        System.out.println("пункт 4: ");
        System.out.println("enter num 1: ");
        int num1 = scanner.nextInt();
        System.out.println("enter num 2: ");
        int num2 = scanner.nextInt();
        boolean resultEqual = ClassForMethods.egualceMethod(num1,num2);
        System.out.println("Logic result ="+resultEqual);



    }
}

class ClassForMethods {
    public static int method1(int a, int b, int c, int d) {
        int result;
        result = a * (b + (c / d));
        return result;
    }
    public static boolean egualceMethod(int a,int b){
        int result = a + b;
        if((result>20)&&(result<10))
            return true;
        return false;
    }
    public static void borderL(){
        char a = 11097;
        for(int i = 0; i<=10;i++)
            System.out.print(a);
    }
}