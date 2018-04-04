import java.io.IOException;

public class main {
	public static void main (String[] args) throws IOException{
		ClientSmtp clientSmtp = new ClientSmtp("136.124.187.23", 25, "mazel@jupiter.fr");
		for (int i = 0; i < 100000; ++i) {
			clientSmtp.send("NOTRE PERE QUI EST AUX CIEUX", "kirscher", "REDEMPTION", "Je ne crois pas en Dieux, mais j'en vois deux sur le ring");
			clientSmtp.send("NOTRE PERE QUI EST AUX CIEUX", "kirscher", "REDEMPTION", "Je ne crois pas en Dieux, mais j'en vois deux sur le ring");
			clientSmtp.send("NOTRE PERE QUI EST AUX CIEUX", "kirscher", "REDEMPTION", "Je ne crois pas en Dieux, mais j'en vois deux sur le ring");
			clientSmtp.send("NOTRE PERE QUI EST AUX CIEUX", "kirscher", "REDEMPTION", "Je ne crois pas en Dieux, mais j'en vois deux sur le ring");
			clientSmtp.send("NOTRE PERE QUI EST AUX CIEUX", "kirscher", "REDEMPTION", "Je ne crois pas en Dieux, mais j'en vois deux sur le ring");
			clientSmtp.send("NOTRE PERE QUI EST AUX CIEUX", "kirscher", "REDEMPTION", "Je ne crois pas en Dieux, mais j'en vois deux sur le ring");
			clientSmtp.send("NOTRE PERE QUI EST AUX CIEUX", "kirscher", "REDEMPTION", "Je ne crois pas en Dieux, mais j'en vois deux sur le ring");
			clientSmtp.send("NOTRE PERE QUI EST AUX CIEUX", "kirscher", "REDEMPTION", "Je ne crois pas en Dieux, mais j'en vois deux sur le ring");
			clientSmtp.send("NOTRE PERE QUI EST AUX CIEUX", "kirscher", "REDEMPTION", "Je ne crois pas en Dieux, mais j'en vois deux sur le ring");
			clientSmtp.send("NOTRE PERE QUI EST AUX CIEUX", "kirscher", "REDEMPTION", "Je ne crois pas en Dieux, mais j'en vois deux sur le ring");

			System.out.println(i);
		}


		/*ClientTcpEcho client = new ClientTcpEcho("10.203.9.159",50007);
		client.lancerBW();*/
	}
}
