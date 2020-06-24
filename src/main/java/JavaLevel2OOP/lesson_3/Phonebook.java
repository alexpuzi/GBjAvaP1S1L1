package JavaLevel2OOP.lesson_3;

public class Phonebook {
    private String person;
    private String phone;
    Phonebook(String person, String phone){
        this.person = person;
        this.phone = phone;
    }
    public String getPerson(){
        return person;
    }
    public String getPhone(){
        return phone;
    }




//    Phonebook() {
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("Ivanov", "+79861234567");
//        hashMap.put("Petrov", "+79821234567");
//        hashMap.put("Sidorov", "+79831234521");
//        hashMap.put("Petrov", "+79983456612");
//        hashMap.put("Padla", "+79151442123");
//        for (
//                Map.Entry<String, String> o : hashMap.entrySet()) {
//            System.out.println(o.getKey() + ": " +
//                    o.getValue());
//        }
//    }
}
