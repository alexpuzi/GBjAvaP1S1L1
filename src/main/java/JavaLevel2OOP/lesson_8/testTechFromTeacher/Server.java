package JavaLevel2OOP.lesson_8.testTechFromTeacher;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private final int port;
    private AuthService authService;
    private List<ClientHandler> clients;

    public Server(int port){
        this.port = port;
        this.clients = new ArrayList<>();
        start();
    }
    public AuthService getAuthService(){
        return authService;
    }

    private void start() {
        try(ServerSocket server = new ServerSocket(this.port)){
            authService = new BaseAuthService();
            authService.start();

            while(true){
                System.out.println();
            }
        }catch (IOException e) {
            System.out.println("Something went wrong during server startup");
        } finally {
            if (authService != null) {
                authService.stop();
            }

        }
    }
}
