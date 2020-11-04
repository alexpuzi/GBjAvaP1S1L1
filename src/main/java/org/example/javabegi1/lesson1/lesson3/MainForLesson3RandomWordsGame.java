package org.example.javabegi1.lesson1.lesson3;

import java.util.Scanner;

public class MainForLesson3RandomWordsGame {

    public static void main(String[] args) {
        int numberOfComputerra;
        int numberOfPlayer;



//        methodForEnterClientNumberAndBorder();
//        generateRandomNumberInt();
        doComparison(methodForEnterClientNumberAndBorder(), generateRandomNumberInt());
        showInfoAboutContinuationGames();
//doComparison(generateRandomNumberInt(), methodForEnterClientNumberAndBorder()); - как посчитать кол-во выполнений метода

    }

    //метод генерирует рандомное число
    public static int generateRandomNumberInt() {
        return (int) (Math.random() * (9));
    }

    //клиент генерит число
    public static int methodForEnterClientNumberAndBorder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************");
        System.out.print("Enter number from 0 to 9: ");
        int i = scanner.nextInt();
        return i;
    }

    //выводим информацию о повторе
    public static void showInfoAboutContinuationGames() {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 1) {
            doComparison(generateRandomNumberInt(), methodForEnterClientNumberAndBorder());
        } else if (i == 0) {
            System.out.println("Good bye");
            System.exit(0);
        } else showInfoAboutContinuationGames();
    }

    //метод сравнивающий значения generateRandomNumberInt и methodForEnterClientNumberAndBorder
    public static void doComparison(int i, int j) {
        if (i == j) {
            System.out.println("You winner!");
            showInfoAboutContinuationGames();
        } else System.out.println("You loose!");
        showInfoAboutContinuationGames();
    }

}
