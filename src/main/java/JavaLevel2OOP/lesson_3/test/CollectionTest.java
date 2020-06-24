package JavaLevel2OOP.lesson_3.test;

import java.util.ArrayList;

public class CollectionTest {
    public static void main(String[] args){
        System.out.println();
        //work with Array list
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.ensureCapacity(34);//Увеличить емкости списка до значения capacity, только если текущая емкость меньше указанной
        arrayList.add(0,"Earth");
        arrayList.add(0,"Moon");
        arrayList.add(2,"Q");
        arrayList.add(1,"W");
        arrayList.add(3,"E");
        arrayList.add("Moon");
        arrayList.add("Qq");
        arrayList.add("W5");
//        arrayList.add(25,"E"); а с этим будет ошибка

        System.out.println(arrayList);
        arrayList.remove(2);
        arrayList.remove("E");
        System.out.println(arrayList);
    }

}
