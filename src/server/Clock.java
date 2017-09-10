package server;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
	long serverTime = 0;
	long clientTime = 0;

	public long enviarMensagem(long time, String mensagem) {

		serverTime = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");
		Date resultdate = new Date(System.currentTimeMillis());
		System.out.println(sdf.format(resultdate));
		clientTime = time;
		
		final long start = time;
		final long end = serverTime;
		final long i = end - start;

		System.out.println("Took: " + ((end - start) / 1000000) + "ms");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (true) {
			if (System.currentTimeMillis() >= serverTime + 5000 && System.currentTimeMillis() <= serverTime + 30000) {
				resultdate = new Date(System.currentTimeMillis());
				System.out.println(sdf.format(resultdate));
				long T1 = System.currentTimeMillis();
			/*	//Supondo que o time server consome um tempo
				de i entre o recebimento da mensagem vinda
				de M */
				return T1 - i;
			}

		}

	}
}
