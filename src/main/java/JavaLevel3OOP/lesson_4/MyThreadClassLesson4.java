package JavaLevel3OOP.lesson_4;

public class MyThreadClassLesson4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        try{
            t1.join();
            t2.run();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        System.out.println("Stop");
    }
}
class MyThread1 extends Thread{
//    @Override
    public void run(){
        for(int i =0; i<10;i++)
        System.out.println("MyThread1 "+i);
    }
}
class  MyThread2 implements Runnable{

    @Override
    public void run() {
        for(int i =0; i<10;i++)
            System.out.println("MyThread2 "+i);
    }
}