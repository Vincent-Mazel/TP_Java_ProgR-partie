import java.io.*;
import java.net.Socket;

public class ThreadServeurEcho extends Thread {

    private Socket client;

    public ThreadServeurEcho (Socket client) {
        this.client = client;
    }

    public void run () {
        String chaine;

        try {
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            while ((chaine = in.readLine()) != null) {
                out.write(chaine.toUpperCase());
                out.newLine();
                out.flush();
            }
            out.close();
            in.close();
            client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
