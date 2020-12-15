package Practica1;

public class Cartera extends Thread {

	private float dinero = 0;

	public float getDinero() {
		return dinero;
	}

	public void setDinero(float dinero) {
		this.dinero = dinero;
	}

	// metodos synchronized, tiene que acabar uno para empezar el otro

	public synchronized void incrementar() {
		dinero = +(float) Math.floor(Math.random() * 10 + 0);
		try {

			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("El dinero se ha incrementado");
	}

	public synchronized void decrementar() {
		dinero = -(float) Math.floor(Math.random() * 10 + 0);
		try {

			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("El dinero se ha decrementado");
	}
}
