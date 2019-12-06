package hilos;

public class TestHilo {
	public static void main (String [] args) {
		new HiloEjemplo("Jamaica").start();
		new HiloEjemplo("Fiji").start();
	}
}
