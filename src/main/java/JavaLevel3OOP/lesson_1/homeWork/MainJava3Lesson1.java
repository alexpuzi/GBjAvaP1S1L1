package lesson_1.homeWork;
import JavaLevel3OOP.lesson_1.homeWork.Apple;
import JavaLevel3OOP.lesson_1.homeWork.Box;
import JavaLevel3OOP.lesson_1.homeWork.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

/*
1. Написать метод, который меняет два элемента
массива местами.(массив может быть любого
ссылочного типа);
2. Написать метод, который преобразует
массив в ArrayList;
3. Большая задача:
a. Есть классы Fruit -> Apple, Orange;
(больше фруктов не надо)
b. Класс Box в который можно складывать
фрукты, коробки условно сортируются по
типу фрукта, поэтому в одну коробку
 нельзя сложить и яблоки, и апельсины;
c. Для хранения фруктов внутри коробки можете использовать ArrayList;
d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока
 - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут
 в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем
  сравнивать с коробками с апельсинами);
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку
 фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается,
  а в другую перекидываются объекты, которые были в этой коробке;
g. Не забываем про метод добавления фрукта в коробку.
 */
public class MainJava3Lesson1 {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c", "d"};
     //   int[] arr2 = {1,2,3,4,5,6,7,8};

        firsMethod(arr1);
        Box<Fruit> box = new Box<>();
        Box<Apple> boxa = new Box<>();
        boxa.addFruit(new Apple());
        boxa.transfer(box);
    }
    }
    public static void swap(Object[] arr, int n1, int n2){

    }
    public static <T> void firsMethod(T[]arr){
        for(int i = 0; i < arr.length; i++){
            int j = 0;

        }
    }
    public static <T> ArrayList<T> secondMethod(T[]arr){
        return new ArrayList<T>(Arrays.asList(arr));
    }
}
