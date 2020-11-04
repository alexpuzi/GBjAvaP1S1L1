package JavaLevel2OOP.lesson_3.test;

import java.util.*;

import static org.apache.tapestry5.ioc.internal.util.InternalUtils.size;

public class CollectionTest {
    public static void main(String[] args){
//        doArrayList();
//// Классы HashМap,
//        doHashMap();
//        doHashSet();
        doArrayList();

    }
    public void doListArrays(){
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);

    }

    private static void doHashSet() {
        Set<String> set = new HashSet<>();
        set.add("Alpha");
        set.add("Alpha");
        set.add("Betta");
        set.add("Gamma");
        System.out.println(set);
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Alpha");
        set2.add("Teta");
        set2.add("Betta");
        set2.add("Gamma");
        System.out.println(set2);
    }

    private static void doHashMap() {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Ivanov","+79861234567");
        hashMap.put("Petrov","+79821234567");
        hashMap.put("Sidorov","+79831234521");
        hashMap.put("Petrov", "+79983456612");
        hashMap.put("Padla","+79151442123");
        for(Map.Entry<String,String> o : hashMap.entrySet()){
            System.out.println(o.getKey() +": "+
                    o.getValue());
        }

    }

    public static void doArrayList(){
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
        System.out.println("sizeArrList ="+size(arrayList));
        arrayList.trimToSize();// урезать capasity до size
        arrayList.set(1, "Duck");
        System.out.println(arrayList);
        //в массив преобразуем Аррей лист
        String[] arr = new String[arrayList.size()];
        System.out.println(arrayList.toArray(arr));
        System.out.println(arrayList.get(1));//
        //////////////////////////////
//        LinkedList<E>
        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        linkedList.add("QWerty");
        linkedList.add(1,"www");
        linkedList.add("root");
        linkedList.add("Sdk");
        linkedList.add("Storage");
        linkedList.add("Server");
        linkedList.add("Z");
        System.out.println("linkedList 1: "+linkedList);
        linkedList.addFirst("addFirst");
        linkedList.remove(3);
        linkedList.remove(12);
        linkedList.remove(3);
        System.out.println("linkedList 2: "+linkedList);
        System.out.println(linkedList.get(6)+
                " " +linkedList.peekLast());
    }


}
