package Practica1;

public class Cliente extends Thread{
	
	    public Cartera run(Cartera c1) {
	    	
	    	// metodo para el bucle infinito
			do {
				int NumAleatorio = (int) Math.floor(Math.random() * 100 + 0);
				c1.setDinero(c1.getDinero() - NumAleatorio);
				return c1;

			} while (c1 != null);

	    }
	}
