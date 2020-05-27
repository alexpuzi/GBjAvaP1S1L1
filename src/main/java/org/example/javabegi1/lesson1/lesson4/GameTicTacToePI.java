package org.example.javabegi1.lesson1.lesson4;
///**
// * Tic Tac Toe
// * <p>
// * 1. Инициализровать игровое поле
// * 2. Игрок - Х, Компьютер - О
// * 3. Игрок всегда ходит первый
// * 4. Реализовать ход игрока по координатам [X, Y]
// * 5. Реализовать ход компьютера по координатам [X, Y]
// * 6. Защита от неверных координат [X, Y] введенных игроком
// * 7. Защита от попытки ввести координаты [X, Y] в уже занятую ячейку
// * 8. Игра до победы
// * 9. Проверка победы
// * 10. Победа TODO
// * 11. Проверка ничьи TODO
// * 12. ошибки (что делать если не то число)
// * 13. доделать ИИ
// */

import java.util.Random;
import java.util.Scanner;


public class GameTicTacToePI {
    public static void main(String[] args) {
        playTicTacToe();

    }

    static void playTicTacToe() {
        char[][] field = getZeroArr();
        drawField(field);
        char playerSign = 'X';
        char compSign = '0';
        char currentPlayerSign = playerSign;
        String currentPlayerName = "Player";
        boolean isWin;
        do {
            move(field, currentPlayerSign);
            isWin = chekWinP(field, currentPlayerSign);
            if (!isWin) {
                currentPlayerSign = currentPlayerSign == playerSign ?
                        compSign : playerSign;
                currentPlayerName = currentPlayerSign == playerSign ?
                        "Player" : "Computer";
                drawField(field);
            }
            if (!isWin) {//TODO Проверка на ничью
            checkDraw(field,currentPlayerSign);
            drawField(field);
            }
        } while (!isWin);
        System.out.println();
        System.out.println(String.format("Congrats!!! You are winner Mr. %s",
                currentPlayerName));
        drawField(field);
    }

    private static boolean chekWinP(char[][] field, char currentPlayerSign) {
        if (chekHoryzontalWin(field, currentPlayerSign)) {
            return true;
        }
        if (checkVerticalWin(field, currentPlayerSign)) {
            return true;
        }
        if (chekDiagonalWin(field, currentPlayerSign)) {
            return true;
        }
        if  (chekDiagonalWin(field, currentPlayerSign)){   //TODO Diagonal
            return true;
        }

        return false;
    }

    private static boolean checkVerticalWin(char[][] field,
                                            char currentPlayerSign) {
        if (field[0][0] == currentPlayerSign && field[1][0] ==
                currentPlayerSign && field[2][0] == currentPlayerSign) {
            return true;
        }
        if (field[0][1] == currentPlayerSign && field[1][1] ==
                currentPlayerSign && field[2][1] == currentPlayerSign) {
            return true;
        }
        if (field[0][2] == currentPlayerSign && field[1][2] ==
                currentPlayerSign && field[2][2] == currentPlayerSign) {
            return true;
        }
        return false;
    }

    private static boolean chekHoryzontalWin(char[][] field,
                                             char currentPlayerSign) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == currentPlayerSign && field[i][1] ==
                    currentPlayerSign && field[i][2] == currentPlayerSign) {
                return true;
            }
        }
        return false;
    }

    static boolean chekDiagonalWin(char[][] field, char currentPlayerSign) {
        //TODO
        if (field[0][0] == currentPlayerSign && field[1][1] == currentPlayerSign
                && field[2][2] == currentPlayerSign) {
            return true;
        }
        if (field[0][2] == currentPlayerSign && field[2][2] == currentPlayerSign
                && field[2][0] == currentPlayerSign) {
            return true;
        }
        return false;
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    static void moveYou(char[][] field, char playerSign) {
        int x;
        int y;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input X");
            x = scanner.nextInt();
            System.out.println("Input y");
            y = scanner.nextInt();
        } while (field[x - 1][y - 1] != '-');
        field[x - 1][y - 1] = playerSign;

    }

    static void moveComputer(char[][] field, char compSing) {
        int x;
        int y;
        Random random = new Random();
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellEmpty(field, x, y));
        System.out.println("Computer is move ... ");
        System.out.println(String.format("Computer decided choose " +
                "coordinates [%s, %s]", x + 1, y + 1));
        field[x][y] = compSing;

    }

    static void printFieldInGame(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void move(char[][] field, char currentPlayerSign) {
        if (currentPlayerSign == 'X') {
            movePlayer(field, currentPlayerSign);
        } else {
            moveComputer(field, currentPlayerSign);
        }
    }

    private static void movePlayer(char[][] field, char currentPlayerSign) {
        int x;
        int y;
        boolean isEmptyCell;

        do {
            boolean isCorrectCoordinates;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input X-coordinates [1, 2, 3");
                x = scanner.nextInt() - 1;
                System.out.println("Input Y-coordinates [1, 2, 3]");
                y = scanner.nextInt() - 1;
                isCorrectCoordinates = chekCoodinate(x, y);
                notifyIncorrectCoordinates(isCorrectCoordinates);
            } while (!isCorrectCoordinates);
            isEmptyCell = isCellEmpty(field, x, y);
            notifyOccupiedCell(isEmptyCell, x, y);
        } while (!isCellEmpty(field, x, y));
        field[x][y] = currentPlayerSign;
    }

    static void notifyOccupiedCell(boolean isOccupied, int x, int y) {
        if (!isOccupied) {
            System.out.println(String.format("Input coordinates " +
                    "are incorrect. Cell of coordinates [%s, %s] " +
                    "is already occupied", x, y));
        }
    }

    static boolean isCellEmpty(char[][] field, int x, int y) {
        return field[x][y] == '-';
    }

    private static boolean chekCoodinate(int x, int y) {
        return (x >= 0 && x <= 2) && (y >= 0 && y <= 2);
    }

    static void notifyIncorrectCoordinates(boolean isCorrect) {
        if (!isCorrect) {
            System.out.println("Input coordinates are incorrect. " +
                    "Available coordinates in range [1, 2, 3]");
        }
    }

    static char[][] getZeroArr() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

    static boolean checkDraw(char[][] field, char currentPlayerSign) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != '-'&& chekWinP(field, currentPlayerSign) != true) {
                    System.out.println("It's draw...:(");
                    return true;
                }
            }
        }
        return false;
    }
}
