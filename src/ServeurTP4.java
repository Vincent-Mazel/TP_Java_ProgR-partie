import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurTP4 {

    private
    int port ;int nbClients;

    public ServeurTP4(int port, int nbClients) {
        this.port =  port ;
        this.nbClients = nbClients;
    }

    public void lancer() {
        try {
            ServerSocket serveur = new ServerSocket(port);

            for (int i = 1; i<=nbClients; i++) {

                Socket client = serveur.accept();
                ThreadServeurTP4 thread = new ThreadServeurTP4(client);
                thread.start();

            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new ServeurTP4(2000, 10).lancer();

    }

}