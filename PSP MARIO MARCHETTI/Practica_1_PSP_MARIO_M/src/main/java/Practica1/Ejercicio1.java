package Practica1;

public class Ejercicio1 extends Thread {

	public void run() {
		int NumAleatorio = (int) Math.floor(Math.random() * 5 + 1);
		System.out.println("Hola soy el hilo" + getName() + " y me pongo a dormir " + NumAleatorio + " segundos");

		try {
			sleep(NumAleatorio * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Soy el hilo " + getName() + " y he terminado de dormir");
	}

}
