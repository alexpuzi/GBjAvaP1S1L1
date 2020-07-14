package JavaLevel2OOP.lesson_8.testTechFromTeacher;

public interface AuthService {
    void stop();
    void start();
    String getNickByLoginAndPass(String login, String password);
}
