package hilos;

public class ThreadExample implements Runnable{

		Thread t; 
		String nombre = null;
		//los constructores deben ir igual al nombre de la clase.
		
		public ThreadExample () {
			t = new Thread(this, "Hilo 2");
			t.start();
		}
		
		public ThreadExample (String nombre)
		{
			this.nombre = nombre;
			t.start();
		}	  @Override
	  
	  public void run()
	  {
		  for (int i = 0; i < 200 ; i++) {
			  
			  System.out.println(nombre + "int i = " +i);
			  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	  }	
}
