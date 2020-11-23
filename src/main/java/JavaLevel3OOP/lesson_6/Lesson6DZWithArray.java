package JavaLevel3OOP.lesson_6;
//1. Написать метод, которому в качестве аргумента передается не
// пустой одномерный целочисленный массив. Метод должен
// вернуть новый массив, который получен путем вытаскивания
// из исходного массива элементов, идущих после последней четверки.
// Входной массив должен содержать хотя бы одну четверку,
// иначе в методе необходимо выбросить RuntimeException.
// Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
// 2. Написать метод, который проверяет состав массива
// из чисел 1 и 4. Если в нем нет хоть одной четверки или е
//  диницы, то метод вернет false; Написать набор тестов
// для этого метода (по 3-4 варианта входных данных).


import java.util.ArrayList;
import java.util.Collections;

public class Lesson6DZWithArray {
    public static void main(String[] args) {
        //int[] numbers = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        //int[] numbers = {2, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        int[] numbers = {3, 4, 1, 5, 9, 4, 4, 7, 4, 8, 6};

        Integer[] arrList = getNewArrayAfter4(numbers);

        for (int i = 0; i < arrList.length; i++) {
            System.out.print(arrList[i] + " ");
        }
    }

    private static Integer[] getNewArrayAfter4(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = numbers.length - 1; i >= 0 && numbers[i] != 4; i--) {
            arrayList.add(numbers[i]);
        }
        if (arrayList.size() == numbers.length) {
//            thorw new RuntimeException("в массиве нет 4");
        }
        Collections.reverse(arrayList);
        Integer[] arrayOut = arrayList.toArray(new Integer[arrayList.size()]);

        return arrayOut;
    }
}
