package JavaLevel2OOP.lesson_5.versionFromTeacher;

public class ArrCalc {
    static final int SIZE = 10_000_000;
    float[] value;

    public ArrCalc() {
        value = new float[SIZE];
        for (int i = 0; i < value.length; i++) {
            value[i] = 1;
        }
    }

    public void calc() {
        System.out.println("Straight forward calculation START");
        long a = System.currentTimeMillis();

        for (int i = 0; i < value.length; i++) {
            value[i] = (float) (value[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(String.format("Straight forward calculation" +
                "executed within: %s", System.currentTimeMillis() - a));
        System.out.println("Straight forward calculator END");
    }
}
