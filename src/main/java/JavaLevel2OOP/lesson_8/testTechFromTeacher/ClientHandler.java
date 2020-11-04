package JavaLevel2OOP.lesson_8.testTechFromTeacher;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
    private Socket socket;
    private Server server;
    private DataInputStream in;
    private DataOutputStream out;
    private String name;

    private ClientHandler(Server server, Socket socket){
        try{
            this.server = server;
            this.socket = socket;
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());
            this.name = "";

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        doAuth();
                        readMessage();
                    }catch (IOException e){
                        e.printStackTrace();
                    }finally {
                        closeConnection();
                    }
                }
            });
        }catch (IOException e){
            throw new RuntimeException("Error occurred during client handler initialization");
        }
    }
    public String getName(){
        return name;
    }

    private void closeConnection() {
    }

    public void readMessage() throws IOException {
    }

    public void doAuth() throws IOException{
        while (true){
            String strFromClient = in.readUTF();
            if(strFromClient.startsWith("/auth")){
                String[] parts = strFromClient.split("\\s");
                String nickname = server.getAuthService().getNickByLoginAndPass(parts[1], parts[2]);
                if(nickname !=null){

                }

            }

        }
    }
}
