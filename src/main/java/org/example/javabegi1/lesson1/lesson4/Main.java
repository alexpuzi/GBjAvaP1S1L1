package org.example.javabegi1.lesson1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * Tic Tac Toe
     * <p>
     * 1. Инициализровать игровое поле
     * 2. Игрок - Х, Компьютер - О
     * 3. Игрок всегда ходит первый
     * 4. Реализовать ход игрока по координатам [X, Y]
     * 5. Реализовать ход компьютера по координатам [X, Y]
     * 6. Защита от неверных координат [X, Y] введенных игроком
     * 7. Защита от попытки ввести координаты [X, Y] в уже занятую ячейку
     * 8. Игра до победы
     * 9. Проверка победы
     * 10. Победа
     * 11. Проверка ничьи TODO
     */
    public static void main(String[] args) {
        playTicTacToe();
    }

    static void playTicTacToe() {
        char[][] field = getField();
        drawField(field);

        char playerSign = 'X';
        char computerSign = 'O';
        char currentPlayerSign = playerSign;
        String currentPlayerName = "Player";

        boolean isWin;
        do {
            move(field, currentPlayerSign);
            isWin = checkWin(field, currentPlayerSign);

            if (!isWin) {
                currentPlayerSign = currentPlayerSign ==
                        playerSign ? computerSign : playerSign;
                currentPlayerName = currentPlayerSign ==
                        playerSign ? "Player" : "Computer";
                drawField(field);
            }
            //TODO Проверка на ничью
        } while(!isWin);

        System.out.println(String.format("Congrats!!! You are winner Mr. %s", currentPlayerName));

        drawField(field);
    }

    static void move(char[][] field, char currentPlayerSign) {
        if (currentPlayerSign == 'X') {
            movePlayerSign(field, currentPlayerSign);
        } else {
            moveComputer(field, currentPlayerSign);
        }
    }

    static boolean checkWin(char[][] field, char currentPlayerSign) {
        if (checkHorizontalWin(field, currentPlayerSign)) {
            return true;
        }
        if (checkVerticalWin(field, currentPlayerSign)) {
            return true;
        }
        //TODO Diagonal
        return false;
    }

    static boolean checkHorizontalWin(char[][] field, char currentPlayerSing) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == currentPlayerSing && field[i][1] ==
                    currentPlayerSing && field[i][2] == currentPlayerSing) {
                return true;
            }
        }
        return false;
    }

    static boolean checkVerticalWin(char[][] field, char currentPlayerSing) {
        // TODO Улучшить до цикла
        if (field[0][0] == currentPlayerSing && field[1][0] ==
                currentPlayerSing && field[2][0] == currentPlayerSing) {
            return true;
        }
        if (field[0][1] == currentPlayerSing && field[1][1] ==
                currentPlayerSing && field[2][1] == currentPlayerSing) {
            return true;
        }
        if (field[0][2] == currentPlayerSing && field[1][2] ==
                currentPlayerSing && field[2][2] == currentPlayerSing) {
            return true;
        }
        return false;
    }

    static boolean checkDiagonalWin(char[][] field, char currentPlayerSing) {
        //TODO
        return false;
    }

    static void moveComputer(char[][] field, char computerSign) {
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellEmpty(field, x, y));

        System.out.println("Computer's move ...");
        System.out.println(String.format("Computer decided choose " +
                "coordinates [%s, %s]", x + 1, y + 1));
        field[x][y] = computerSign;
    }

    static void movePlayerSign(char[][] field, char playerSign) {
        int x;
        int y;
        boolean isEmptyCell;

        do {
            boolean isCorrectCoordinates;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input X-coordinates [1, 2, 3]");
                x = scanner.nextInt() - 1;
                System.out.println("Input Y-coordinates [1, 2, 3]");
                y = scanner.nextInt() - 1;

                isCorrectCoordinates = checkCoordinates(x, y);
                notifyIncorrectCoordinates(isCorrectCoordinates);
            } while (!isCorrectCoordinates);

            isEmptyCell = isCellEmpty(field, x, y);
            notifyOccupiedCell(isEmptyCell, x, y);
        } while (!isCellEmpty(field, x, y));

        field[x][y] = playerSign;
    }

    static boolean isCellEmpty(char[][] field, int x, int y) {

        return field[x][y] == '-';
    }

    static void notifyOccupiedCell(boolean isOccupied, int x, int y) {
        if (!isOccupied) {
            System.out.println(String.format("Input coordinates " +
                    "are incorrect. Cell of coordinates " +
                    "[%s, %s] is already occupied", x, y));
        }
    }

    static void notifyIncorrectCoordinates(boolean isCorrect) {
        if (!isCorrect) {
            System.out.println("Input coordinates are" +
                    " incorrect. Available coordinates in range [1, 2, 3]");
        }
    }

    static boolean checkCoordinates(int x, int y) {
        return (x >= 0 && x <= 2) && (y >= 0 && y <= 2);
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    static char[][] getField() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

}