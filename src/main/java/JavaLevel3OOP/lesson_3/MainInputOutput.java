package JavaLevel3OOP.lesson_3;

//0. Прочитать файл (около 50 байт) в байтовый
// массив и вывести этот массив в консоль;
//        1. Последовательно сшить 5 файлов в один
//        (файлы примерно 100 байт). Может пригодиться следующая
//        конструкция: ArrayList<InputStream> al = new ArrayList<>();
//        ... Enumeration<InputStream> e = Collections.enumeration(al);
//        2. Написать консольное приложение, которое умеет постранично читать
//        текстовые файлы (размером > 10 mb). Вводим страницу (за
//        страницу можно принять 1800 символов), программа выводит ее в
//        консоль. Контролируем время выполнения: программа не должна
//        загружаться дольше 10 секунд, а чтение – занимать свыше 5 секунд.

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainInputOutput {
    public static void main(String[] args) {
        try{
            task();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void task() throws IOException{
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("src/main/java/JavaLevel3OOP/lesson_3/test.txt"));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        int x;
        while ((x = inputStream.read()) !=-1){
            outputStream.write(x);
        }
        byte[] b = outputStream.toByteArray();
        System.out.println(Arrays.toString(b));
        inputStream.close();
        outputStream.close();
    }
    public static void ex2() throws IOException{
        ArrayList<InputStream> arrayList = new ArrayList<>();
        arrayList.size();
        arrayList.add(new FileInputStream("1234/1.txt"));
        arrayList.add(new FileInputStream("1234/2.txt"));
        arrayList.add(new FileInputStream("1234/3.txt"));

        BufferedInputStream inputStream = new BufferedInputStream(new SequenceInputStream(Collections.enumeration(arrayList)));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(new FileOutputStream("out.txt"));
        int x;
        while ((x = inputStream.read()) != -1) {
            outputStream.write(x);
            System.out.println((char) x);
        }
        inputStream.close();
        outputStream.close();

        System.out.println(System.currentTimeMillis() - System.currentTimeMillis());
    }


    // 3 прочитать данные из книги (с определнной страницы)
    // RandomAccessFile позволяет прыгать по потоку назад, без переоткрытия файлы
    public static void task3() throws IOException {
        final int PAGE_SIZE = 1800;
        RandomAccessFile raf = new RandomAccessFile("123/1.txt", "r");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        System.out.println("Введите страницу: ");

        int p = Integer.parseInt(str) - 1;
        raf.seek(p * PAGE_SIZE);
        byte[] barr = new byte[1800];
        raf.read(barr);
        System.out.println(new String(barr));
        raf.close();
    }


    }
}
