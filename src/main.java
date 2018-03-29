import java.io.IOException;

public class main {
	public static void main (String[] args) throws IOException{
		ClientTcpEcho client = new ClientTcpEcho("10.203.9.99",50007);
		client.lancerBW();
	}
}
