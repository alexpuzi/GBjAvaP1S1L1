package JavaLevel2OOP.lesson_5.versionFromTeacher;

public class ArrMultiCalc {
    private static final int size = 10_000_000;
    private static final int h = size / 2;
    private float[] values;
    private float[] a1;
    private float[] a2;

    public ArrMultiCalc(){
        values = new float[size];
        for (int i = 0; i < values.length; i++) {
            values[i] = 1;
        }
        a1=new float[h];
        a2=new float[h];
    }
    public void calc(){
        System.out.println("Multi forward calculation Start");

        this.a1 = new float[h];
        this.a2 = new float[h];

        long earlyBirdStart = System.currentTimeMillis();

        Thread t1 = new Thread(() -> calc(values, 0, a1, 0 , h, "First half"));
        Thread t2 = new Thread(() -> calc(values, h,a2,0,h,"Second Half"));

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    public void calc(float[] src, int srcPos, float[] dest, int destPost, int lenhgt, String nameOfThread){
        System.out.println("Calculation started: " + nameOfThread);
        long start = System.currentTimeMillis();
        System.arraycopy(src,srcPos,dest,destPost,lenhgt);
        for (int i = 0; i <dest.length ; i++) {
            dest[i] = (float) (dest[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        //копирование в исходный иассив
        System.arraycopy(dest,0,src,srcPos,lenhgt);
        long end = System.currentTimeMillis() - start;
        System.out.println(String.format("Calculation %s executed within: %s", nameOfThread, end));
    }
}
