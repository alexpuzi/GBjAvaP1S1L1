package JavaLevel2OOP.lesson_5;


public class MyTreadWorkWithArr implements Runnable {
    //    static final int size = 10_000_000;
    static final int size = 5_000;
    static final int h = size / 2;

    public static void main(String[] args) {
        MyTreadWorkWithArr e1 = new MyTreadWorkWithArr();

        soutCurrtentTimeMills();
        firstMethodOutNumberOneInArr(craeteArr());
        secondMethodOutNumberOneInArr(craeteArr());
    }

    @Override
    public void run() {
        firstMethodOutNumberOneInArr(craeteArr());
    }

    public static float[] craeteArr() {
        float[] arr = new float[size];
        return arr;
    }
    public static void firstMethodOutNumberOneInArr(float[] arr) {
        System.out.println("Старт метода 1");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            System.out.println(arr[i]);

        }
        soutCurrtentTimeMills();
    }
    public static void secondMethodOutNumberOneInArr(float[] arr) {
        System.out.println("Старт метода 2");
        arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
//        Arrays.fill(arr,1.0f);
        long a = System.currentTimeMillis();
        System.arraycopy(arr,0,arr1,0,h);
        System.arraycopy(arr2,0,arr,h,h);
        long split = System.currentTimeMillis();
        System.out.println(String.format("Время выполнения 2 метода " +
                "до этапа разделения массивов %s", String.valueOf(split - a)));
        Thread thread1 = new Thread(() -> forSecondMethodOutNumberOneInArr(arr1,1));
        Thread thread2 = new Thread(() -> forSecondMethodOutNumberOneInArr(arr2,1));
        thread1.start();
        thread2.start();

//        try{
//            thread1.join();
//            thread2.join();
//        }catch (InterruptedException e){
//            System.out.println(String.format("Исклбчение в потоках. %s", e.getMessage()));
//        }
        long halfEnd = System.currentTimeMillis();
        System.arraycopy(arr1,0,arr,0,h);
        System.arraycopy(arr2,0,arr,h,h);
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнния склейки массива %s", String.valueOf(end - halfEnd)));
        System.out.println(String.format("Завершение метода 2. Время выполнения %s", String.valueOf(end - a)));
    }

    public static void soutCurrtentTimeMills() {
        long a = System.currentTimeMillis();
        System.out.println("Time of work is " + a + "...");
    }
    public static void forSecondMethodOutNumberOneInArr(float[] arr, int numberOfThread) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            System.out.println(arr[i]);

        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнния потока %d равно %s", numberOfThread, String.valueOf(end - start)));
    }
}
