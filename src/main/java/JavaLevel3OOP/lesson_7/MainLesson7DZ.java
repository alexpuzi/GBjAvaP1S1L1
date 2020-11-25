package JavaLevel3OOP.lesson_7;

/*
1. Создать класс, который может выполнять «тесты»,
в качестве тестов выступают классы с наборами методов
с аннотациями @Test. Для этого у него должен быть
статический метод start(), которому в качестве параметра
передается или объект типа Class, или имя класса.
Из «класса-теста» вначале должен быть запущен метод с
аннотацией @BeforeSuite, если такой имеется,
далее запущены методы с аннотациями @Test, а по
завершению всех тестов – метод с аннотацией @AfterSuite.
К каждому тесту необходимо также добавить приоритеты
(int числа от 1 до 10), в соответствии с которыми
будет выбираться порядок их выполнения, если приоритет
одинаковый, то порядок не имеет значения. Методы с
аннотациями @BeforeSuite и @AfterSuite должны присутствовать
в единственном экземпляре, иначе необходимо бросить
RuntimeException при запуске «тестирования».
Это домашнее задание никак не связано с темой тестирования
через JUnit и использованием этой библиотеки, то
есть проект пишется с нуля.

2. Написать программу для проверки ДЗ
 */


import org.json.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainLesson7DZ {


    public static void main(String[] args) {

    }
    public static void processing(Class c) throws InvocationTargetException, IllegalAccessException{
        Method[] methods = c.getDeclaredMethods();
        List<Method> list = new ArrayList<Method>();
        //проходим по всем методам и добавляем методы с аннотацией
        for(Method o: methods){
            if(o.isAnnotationPresent((Class<? extends Annotation>) Test.class)){
                //если приоритет меньше одного или больше 10, то нет
//                int prio = o.getAnnotation(Test.class).priority();
//                if(prio<1||prio>10) throw new RuntimeException("Priority ex");
//                list.add(o);
            }
        }
        //сортировка методов по приоритету
        list.sort(new Comparator<Method>() {
            @Override
            public int compare(Method o1, Method o2) {
                return 0;
            }
        });
    }
}