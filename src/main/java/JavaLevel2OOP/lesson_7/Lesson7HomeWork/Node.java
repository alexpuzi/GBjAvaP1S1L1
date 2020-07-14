package JavaLevel2OOP.lesson_7.Lesson7HomeWork;

public class Node {
    private String val;
    private Node next;

    public Node(String val, Node next){
        this.val = val;
        this.next = next;
    }
    public String getVal(){
        return val;
    }
    public Node getNext(Node node){
        return next;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
}
