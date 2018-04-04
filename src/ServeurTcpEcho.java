import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServeurTcpEcho {
	private int nbClients;
	private int port;
	private int nbThreads;
	
	public ServeurTcpEcho (int nbClients, int port, int nbThreads) {
		this.nbClients = nbClients;
		this.port = port;
		this.nbThreads = nbThreads;
	}
	
	public void lancer() throws IOException {
		Socket client;

		ServerSocket serveur = new ServerSocket(port);

		ExecutorService pool = Executors.newFixedThreadPool(nbThreads);

		for (int i = 1; i <= nbClients; i++) {
			client = serveur.accept();
			ThreadServeurEcho thread = new ThreadServeurEcho(client);
			pool.execute(thread);
		}
		serveur.close();
	}
}
