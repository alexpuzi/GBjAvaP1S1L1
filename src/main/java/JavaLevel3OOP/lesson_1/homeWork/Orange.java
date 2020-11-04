package lesson_1.homeWork;

public class Orange extends JavaLevel3OOP.lesson_1.homeWork.Fruit {
    public Orange() {
        super(1.5f);
    }

    @Override
    public JavaLevel3OOP.lesson_1.homeWork.Fruit newInstance() {
        return new Orange();
    }
}
