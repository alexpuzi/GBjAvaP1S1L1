package JavaLevel2OOP.lesson_3;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    Phonebook() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Ivanov", "+79861234567");
        hashMap.put("Petrov", "+79821234567");
        hashMap.put("Sidorov", "+79831234521");
        hashMap.put("Petrov", "+79983456612");
        hashMap.put("Padla", "+79151442123");
        for (
                Map.Entry<String, String> o : hashMap.entrySet()) {
            System.out.println(o.getKey() + ": " +
                    o.getValue());
        }
    }
}
