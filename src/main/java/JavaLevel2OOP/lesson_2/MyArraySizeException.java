package JavaLevel2OOP.lesson_2;

public class MyArraySizeException extends RuntimeException {
    int i,j;
    public MyArraySizeException(int i,int j){
        super("Wrong data, row and column can be only 4. You have: row " + i + ", column " + j);
        this.i = i;
        this.j = j;
    }
}
