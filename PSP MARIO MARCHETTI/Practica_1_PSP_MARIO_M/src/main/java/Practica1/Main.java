package Practica1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Cartera ct = new Cartera();
		
		 //*metodos syncronized;
		 
		 ct.incrementar(); ct.decrementar();
		 
		 System.out.println(ct.getDinero());
		 
		 Cliente cliente = new Cliente();
		 Worker worker = new Worker();
		 
		 // metodo para crear los 10 clientes y workers
		 for (int i = 0; i < 10; i++) {
			cliente = new Cliente();
			cliente.run(ct);
			cliente.sleep(1000);
			
			worker = new Worker();
			worker.run(ct);
			worker.sleep(1000);
		}
		 
		// el dinero que queda al final de incrementar y drcrementar
		 System.out.println("El dinero que ha quedado " + ct.getDinero());
		 
	}
}
