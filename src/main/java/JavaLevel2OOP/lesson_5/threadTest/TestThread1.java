package JavaLevel2OOP.lesson_5.threadTest;

public class TestThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
//            try{
//                Thread.sleep(200);
                System.out.println("new thread: "+i);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
        }
    }
}
