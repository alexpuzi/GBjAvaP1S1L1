package org.example.lesson3;

import java.util.Scanner;

public class MainForLesson3RandomNumberGame {
    public static void main(String[] args) {
        String[] wordsAlpha = doArray();
        int numberForRandom = wordsAlpha.length;

//        theMethodTakesIntRandomAndPrintsTheWord(wordsAlpha, generateRandomNumberInt(numberForRandom));
        String o = theMethodTakesIntRandomAndPrintsTheWord(doArray(), generateRandomNumberInt(numberForRandom));
//
        doPlay(playerInput(doArray()), o);
    }

    //рандамайзер для индекса массива
    public static int generateRandomNumberInt(int i) {
        return (int) (Math.random() * (i));
    }

    // в i = будет рандомное число из метода int generateRandomNumberInt(int i), чтобы осуществлять "рамдомность"
    public static String theMethodTakesIntRandomAndPrintsTheWord(String[] str, int i) {
        String word = str[i];
        return word;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // предлагаем выбрать клиенту слово из списка и возвращаем его слово
    public static String playerInput(String[] words) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Guess the word from the list: ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println("Guess the word: ");
        String wordOfPlayers = scann.nextLine();
        return wordOfPlayers;
    }
    // Сравнение слов и вывод сообщения о проигроше или победе , а так же продолжение или не продолжение работы.

    private static void doPlay(String wordFormPlayer, String wordFromArrayRandom) {
        playerInput(doArray());
        String randWord = wordFromArrayRandom;
        boolean a = wordFormPlayer.equals(randWord);
        if (a == true) {
            System.out.println("You win!!!!!!!!!!!!\nGood buy!!!!!!\n");
            System.exit(0);
        } else {
            System.out.println("You loose! :(" +
                    "!\n!\n");
            //проебразую строку в массив символов и выберу первые 2 символа
            char[] chArrayOfWords = randWord.toCharArray();
            System.out.println("Word was :" + chArrayOfWords[0] + chArrayOfWords[1] + "************");
            doPlay(wordFormPlayer, wordFromArrayRandom);
        }
    }

    public static String[] doArray() {
        String[] wordsAlpha = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin",
                "potato"};
        return wordsAlpha;
    }
}

