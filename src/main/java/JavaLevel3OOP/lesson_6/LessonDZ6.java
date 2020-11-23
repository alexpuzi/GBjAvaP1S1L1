package JavaLevel3OOP.lesson_6;

import java.io.IOException;
import java.util.logging.*;

//1. Написать метод, которому в качестве
// аргумента передается не пустой одномерный
// целочисленный массив. Метод должен вернуть
// новый массив, который получен путем
// вытаскивания из исходного массива элементов,
// идущих после последней четверки. Входной массив
// должен содержать хотя бы одну четверку, иначе
// в методе необходимо выбросить RuntimeException.
// Написать набор тестов для этого метода (по 3-4 в
// арианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
//        2. Написать метод, который проверяет
//        состав массива из чисел 1 и 4.
//        Если в нем нет хоть одной четверки
//        или единицы, то метод вернет false;
//        Написать набор тестов для этого метода
//        (по 3-4 варианта входных данных).
//        3. *Добавить на серверную сторону
//        сетевого чата логирование событий.
public class LessonDZ6 {
    public static final Logger logger = Logger.getLogger(" ");
    public static void main(String[] args) throws IOException {
        logger.setLevel(Level.ALL);
        logger.getHandlers()[0].setLevel(Level.ALL);

        //     LogManager.getLogManager().readConfiguration(new FileInputStream("logging.properties"));

//        logger.getHandlers()[0].setFormatter(new Formatter() {
//            @Override
//            public String format(LogRecord record) {
//                return record.getLevel() + "\t" + record.getMessage() + " \n";
//            }
//        });

        logger.getHandlers()[0].setFilter(new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                return record.getMessage().startsWith("Java");
            }
        });

        Handler handler = new FileHandler("mylog.log", true);
        handler.setLevel(Level.ALL);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);

        logger.log(Level.SEVERE, "Java");
        logger.log(Level.INFO, "C#");
        logger.log(Level.CONFIG, "C++");
        logger.log(Level.FINE, "Python");

        logger.info("Python");
    }
    public static int[] firstMethod(int[] arr){
        return new int[]{1,2,3,4,5,6,7,8,9};
    }
    public static boolean secondMethod(int[] arr){

        return false;
    }
}
