package JavaLevel2OOP.lesson_2;

import java.util.Scanner;

public class MainForJavaLesson2OOP1 {
    public static void main(String[] args){
        int row;
        int column;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter values for a array. Choose size. Row and Column: ");
        row = sc.nextInt();
        column = sc.nextInt();


        String[][] newArray = new String[row][column];
        try {
            arrCreate(newArray, sc, row, column);
//            printArr(newArray);
//            calcArr(newArray, row, column);
            System.out.println("Sum is " + +calcArr(newArray, row, column));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }
    private static void arrCreate(String[][] arr, Scanner sc,
                                  int row, int colum){
        if(row != 4 || colum != 4) throw new MyArraySizeException(row,colum);
        System.out.println("Create array ");
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Row "+i+" Colum "+j);
                arr[i][j] = sc.next();
            }
        }
        printArr(arr);
        calcArr(arr, row, colum);
    }

    private static int calcArr(String[][] arr, int row, int colum) {
        int sum = 0;
        int[][] arrayInt = new int[row][colum];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    arrayInt[i][j] = Integer.parseInt(arr[i][j]);
                    sum += arrayInt[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        printArrInt(arrayInt);
        return sum;

    }

    private static void printArrInt(int[][] arrayInt) {
        System.out.println("This is arr Int ");
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.print(arrayInt[i][j]);
            }
            System.out.println();
        }

    }


    private static void printArr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
