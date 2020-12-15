package Practica1;

public class Worker extends Thread {

	public Cartera run(Cartera c1) {
		while (true) {
			try {
				sleep(1000);
				int NumAleatorio = (int) Math.floor(Math.random() * 100 + 0);
				c1.setDinero(c1.getDinero() - NumAleatorio);
				return c1;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
