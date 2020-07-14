package JavaLevel2OOP.lesson_7.fromlesson_7;


public class TwoLinkedList {
    private Node first;

    public void add(String val, int index){
        //TODO вставка по индексу
    }
    private void add(String val, Node prev, Node current){
        // 1. V: a, Prev: null, Next: 2
        // 2. V: ab, Prev: 1, Next: 3
        // 3. V: abx, Prev: 2, Next: null
        // ...
        // N ...
//        if (current.getNext() == null){
//            public void add(current.setNext(new Node(val, prev))) {
//                System.out.println();
//            }
//            }
//
//        }else{
//            add(val, prev, current.getNext());
//        }
    }
    public static class Node extends twoLinkedList.Node {
        private String val;
        private Node prev;
        private Node next;

        public Node(String val){
            this(val, null);
        }
        public Node(String val, Node prev){
            this(val,prev,null);
        }
        public Node(String val, Node prev, Node next){
            this.next = next;
            this.prev = prev;
            this.val = val;
        }
        public String getVal(){
            return val;
        }
        public Node getPrev(){
            return prev;
        }
        public Node getNext(){
            return next;
        }
        public void setNext(Node next){
            this.next = next;
        }
    }
}
