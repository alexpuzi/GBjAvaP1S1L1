package JavaLevel2OOP.lesson_3;

/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив
(дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
2. Написать простой класс ТелефонныйСправочник, который хранит в себе
список фамилий и телефонных номеров. В этот телефонный справочник с
помощью метода add() можно добавлять записи. С помощью метода get()
искать номер телефона по фамилии. Следует учесть, что под одной фамилией
может быть несколько телефонов (в случае однофамильцев), тогда при запросе
такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо
 в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес),
 делать взаимодействие с пользователем через консоль и т.д.).
 Консоль желательно не использовать (в том числе Scanner),
 тестировать просто из метода main() прописывая add() и get().
 */

import java.util.*;

public class MainForLesson3OOP {
    public static void main(String[] args) {
        doExFirst();
        new Phonebook();
    }
    public static void doExFirst(){
        String[] words = new String[]{"Emperor",
                "Maksim", "Sasha", "Lyubasha", "Warhammer",
                "Maksim", "Sigizmund", "Terra", "Warhammer",
                "First", "Korax", "Guns", "Warhammer",
                "Second", "Goods", "Park", "Warhammer",
                "stackoverflow", "Java Core", "Guns", "Warhammer"};

        //варант с "asList"

//    List<String> repetitionWordList = new ArrayList<>(Arrays.asList(words));
//    public List<String> getRepetitionWordList(int index) {
//        return repetitionWordList;
//    }
        //традиционный вариант
// к первой задаче просто массив
        List<String> wordsList = new ArrayList<>(); //для первой задачи с помощью цикла
        for (String w : words) {
            wordsList.add(w);
//            System.out.println(wordsList); //список почему-то получился пирамидальным:
        }
//        к первой задаче только ункальные значения
//        Set<String> wordsAfteWordsList = new HashSet<>(wordsList);
        Set<String> unicWords = new HashSet<>();
//        unicWords.addAll(wordsList); это равносильно циклу в 51 строке
        for(String w: wordsList){
            unicWords.add(w);
//            System.out.println(unicWords);
        } //System.out.println(unicWords); вывело это: [Lyubasha, Sasha, Sigizmund, Goods, Maksim, Park, Emperor, Korax, Guns, Warhammer, Second, First, Terra, stackoverflow, Java Core]
// посчитать кол-во повторяющихся слов в массиве
        Map<String, Integer> countingWords = new HashMap<>();
        for(String w: wordsList){
            if(countingWords.containsKey(w)){
                Integer count = countingWords.get(w);
                count++;
                countingWords.put(w,count);
            }else{
                countingWords.put(w,1);
            }
        }
        System.out.println(countingWords);
    }
}
