package org.example.javabegi1.lesson1.lesson2;

//1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//С помощью цикла и условия заменить 0 на 1, 1 на 0;
//2. Задать пустой целочисленный массив размером 8.
//С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//пройти по нему циклом, и числа меньшие 6 умножить на 2;
//4. Создать квадратный двумерный целочисленный массив
//(количество строк и столбцов одинаковое), и с помощью цикла
//(-ов) заполнить его диагональные элементы единицами;
//5. ** Задать одномерный массив и найти в нем минимальный
//и максимальный элементы (без помощи интернета);
//6. ** Написать метод, в который передается не пустой
//одномерный целочисленный массив, метод должен вернуть
//true, если в массиве есть место, в котором сумма левой
//и правой части массива равны. Примеры: checkBalance
//([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance
//([1, 1, 1, || 2, 1]) → true, граница показана
//символами ||, эти символы в массив не входят.
//7. **** Написать метод, которому на вход подается
//одномерный массив и число n (может быть положительным,
//или отрицательным), при этом метод должен сместить
//все элементымассива на n позиций. Для усложнения
//задачи нельзя пользоваться вспомогательными массивами.
public class Lesson2Main {
    public static void main(String[] args) {
        doBorderBetweenEx(1);
        doArrayForFirstEx();
        doBorderBetweenEx(2);
        doArrayForSecondEx();
        doBorderBetweenEx(3);
        doArrayForThirdEx();
        doBorderBetweenEx(4);
        doArrayForFourEx(6);
        doBorderBetweenEx(5);
        doArrayForFiveEx(7);
        doBorderBetweenEx(6);
        doArrayForSixEx();
        doBorderBetweenEx(7);
        doArrayForSevenEx(4);

    }

    public static void doBorderBetweenEx(int i) {
        System.out.println("++++++++++++++++++++++++");
        System.out.println("This is exercise - " + i);
    }

    public static double getRandomIntegerBetweenRange(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min; //copy past from here - https://yandex.ru/turbo?text=https%3A%2F%2Fwww.internet-technologies.ru%2Farticles%2Fgeneraciya-sluchaynyh-chisel-v-java.html
        return x;
    }

    public static void doArrayForFirstEx() {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Array before : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println();
        System.out.println("Array after : ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else arr1[i] = 0;
            System.out.print(arr1[i]);
        }
        System.out.println();
    }

    public static void doArrayForSecondEx() {
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
            arr2[i] = arr2[i] + 3;
        }
        System.out.println();
    }

    public static void doArrayForThirdEx() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
    }

    public static void doArrayForFourEx(int i) {
        int j = i;
        int[][] arr4 = new int[i][j];
        for (i = 0; i < arr4.length; i++) {
            for (j = 0; j < arr4.length; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                } else arr4[i][j] = 0;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    //(int) (Math.random() * 5 + 1); // copy past from teacher
    public static void doArrayForFiveEx(int i) {
        int arr5[] = new int[i];
        int min = 0, max = arr5[0];
        int indexOfMax = 0, indexOfMin = 0;
        if (i <= 1) {
            doArrayForFiveEx(i + 1);
        } else {
            System.out.println("the initial array in which we are looking for min max :");
            for (i = 0; i < arr5.length; i++) {
                int randVar = (int) getRandomIntegerBetweenRange(-34, 123);
                arr5[i] = randVar;
                System.out.print(arr5[i] + " ");
            }
            System.out.println();
            System.out.println("Looking min & max:");
            for (i = 0; i < arr5.length; i++) {
                if (arr5[i] > max) {
                    max = arr5[i];
                    indexOfMax = i;
                }
                if (arr5[i] < min) {
                    min = arr5[i];
                    indexOfMin = i;
                }
            }
            System.out.print("Max in = " + indexOfMax + " index");
            System.out.print("Min in = " + indexOfMin + " index");
        }
        System.out.println();
    }

    //    i didn't do 5th exercise.
    public static boolean doArrayForSixEx() {
//        int[] arr6 = new int[9];
//        int i, sum, halphOfSum;
//        System.out.println("Source array: ");
//        for (i = 0; i < arr6.length; i++) {
//            arr6[i] = (int) getRandomIntegerBetweenRange(0, 1233);
//            System.out.print(arr6[i] + " ");
//        }
//        System.out.println("");
////        mean
////        for(i=0; i < arr6.length;i++){
////            arr6[i]=arr6[i]+arr6[i+1];
////
////        } sum = arr6[i];
////        System.out.println("Sum of all elements in arr6 = " + sum);
////        halphOfSum = |arr6[i]/2|;
////        if(halphOfSum != 0){
        int[] arr6 = {123, 2134, 21, 12, 34, 56};
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < i; j++) {
                leftSum += arr6[j];
            }
            for (int j = i; j < arr6.length; j++) {
                rightSum += arr6[j];
            }
            if (leftSum == rightSum) {
                return true;
            }
            return false;
        }
        return false;
    }
        public static void doArrayForSevenEx(int n){
            int[] arr7 = {1, 2, 3, 4, 6667, 76, 34};
            for (int i : arr7) {
                System.out.print(i + " ");
            }
            System.out.println("\r\n");
            if (n > 0) {
                for (int x = 0; x < n; x++) {
                    int b = arr7[arr7.length - 1];
                    if ((arr7.length - 1) >= 0) {
                        System.arraycopy(arr7, 0, arr7, 1, arr7.length - 1);
                        arr7[0] = b;
                        for (int i : arr7) System.out.print(i + " ");
                        System.out.println();
                    }
                }
            }
            if (n < 0) {
                for (int x = 0; x > n; x--) {
                    int b = arr7[0];
                    System.arraycopy(arr7, 1, arr7, 0, arr7.length - 1);
                    arr7[arr7.length - 1] = b;
                    for (int i : arr7) System.out.print(i + " ");
                    System.out.print("\r\n");
                }
            }
        }
    }



