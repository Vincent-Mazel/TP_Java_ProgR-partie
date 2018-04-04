import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientTcpEcho {
	private String hostname;
	private int port;

	public ClientTcpEcho (String hostname, int port) {
		this.hostname = hostname;
		this.port = port;
	}
	
	public void lancerBW() throws IOException {
		Socket socket = new Socket(hostname, port);
		
		String bufSend;
		String bufReceived;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Fais-toi plaisir chef : ");
		
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		while(1 < 2) {
			bufSend = reader.readLine();
			
			if (bufSend.equals("quit"))
				break;
			else {
				out.write(bufSend);
				out.newLine();
				out.flush();
				bufReceived = in.readLine();
				System.out.println(bufReceived);
			}
		}
	}
}
