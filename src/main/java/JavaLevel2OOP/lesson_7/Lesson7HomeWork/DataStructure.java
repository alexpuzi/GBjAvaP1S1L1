package JavaLevel2OOP.lesson_7.Lesson7HomeWork;

public class DataStructure {
    public static void main(String[] args) {
        DirectionalList directionalList = new OneDirectionalList();
        directionalList.add("val1");
        directionalList.add("val2");
        directionalList.add("val3");
        directionalList.add("val4");

        OneDirectionalList.Node first = (OneDirectionalList.Node) directionalList.getFirst();

        System.out.println(first.getVal());
        System.out.println(first.getNext().getVal());
        System.out.println(first.getNext().getNext().getVal());
        System.out.println(first.getNext().getNext().getVal());
        System.out.println(first.getNext().getNext().getNext().getNext());

        System.out.println("Size: " + directionalList.size());

        System.out.println("Removed? - " + directionalList.remove("val6"));
        System.out.println("Removed? - " + directionalList.remove("val3"));

        System.out.println(first.getVal());
        System.out.println(first.getNext().getVal());
        System.out.println(first.getNext().getNext().getVal());
    }
}

