package JavaLevel2OOP.lesson_7.fromlesson_7;

import JavaLevel2OOP.lesson_7.ClassWithStatic;

public class Static {
    public static void main(String[] args) {
        ClassWithStatic c1 = new ClassWithStatic(123);
        ClassWithStatic c2 = new ClassWithStatic(1234);

        System.out.println(ClassWithStatic.size);
        System.out.println(c1.size);
        System.out.println(c2.size);
        ClassWithStatic.size = 1002;
        c1.size = 1030;

        System.out.println(ClassWithStatic.size);
        System.out.println(c1.size);
        System.out.println(c2.size);
        
        Static st = new Static();
        st.nonStaticMethod();
        TwoLinkedList twoLinkedList = new TwoLinkedList();
        twoLinkedList.Node node = new TwoLinkedList.Node("val");

    }

    private void nonStaticMethod() {
    }

}
