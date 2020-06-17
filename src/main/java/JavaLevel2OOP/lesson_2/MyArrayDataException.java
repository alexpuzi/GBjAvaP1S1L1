package JavaLevel2OOP.lesson_2;

public class MyArrayDataException extends RuntimeException{
    int i,j;
    public MyArrayDataException(int i, int j){
        super("Wrong parametr in: row "+i+", colum "+j);
        this.i = i;
        this.j = j;
    }
}
