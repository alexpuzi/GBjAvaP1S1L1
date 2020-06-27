package JavaLevel2OOP.lesson_5.threadTest;

public class TestThread {
    public static void main(String[] args) {
        new Thread(new TestThread1()).start();
        new Thread(new TestThread1()).start();
        Thread thread = new Thread((new TestThread1()));
        Thread thread1 = new Thread(new TestThread1());

        thread.start();
        thread1.start();


    }
}


