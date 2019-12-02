public class MisTiposDeDatos2 {
	int edad;
	short peso;
	String nombre;
	float precio;
	boolean esVIP;
	boolean tieneCredencial;
	long valorLong;
	
	public static void main (String [] args) {
		MisTiposDeDatos2 ejemplo = new MisTiposDeDatos2();
		
		ejemplo.edad = Integer.valueOf(args[0]);
		System.out.println(" EDAD: " + ejemplo.edad);
		System.out.println(" PESO: " + ejemplo.peso);
		System.out.println(" NOMBRE: " + ejemplo.nombre);
		System.out.println(" PRECIO: " + ejemplo.precio);
		System.out.println(" ESVIP: " + ejemplo.esVIP);
		System.out.println(" TIENE CREDENCIAL: " + ejemplo.tieneCredencial);
		System.out.println(" VALOR LONG: " + ejemplo.valorLong);
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
