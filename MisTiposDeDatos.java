public class MisTiposDeDatos {
	public static void main (String [] args) {
		//TipoDeDato nombreVaribale; <opcional inicializacion>
		int edad = 18;
		short peso = 70;
		String nombre = "Itzel";
		float precio = 135.5f;
		boolean esVIP = false;
		boolean tieneCredencial = false;
		
		boolean puedoVotar = (( edad >= 18 ) && tieneCredencial);
		
		System.out.println(" EDAD: " + edad );
		System.out.println(" PESO: " + peso);
		System.out.println(" NOMBRE: " + nombre);
		System.out.println(" PRECIO: " + precio);
		System.out.println(" ESVIP: " + esVIP);
		System.out.println(" TIENE CREDENCIAL: " + tieneCredencial);
		System.out.println(" PUEDE VOTAR: " + puedoVotar);
	}
}