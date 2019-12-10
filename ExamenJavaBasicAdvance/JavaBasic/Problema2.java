package JavaBasic;

//Dados 2 valores enteros mayores a 0, regresar cualquiera que sea el valor 
//mas cercano a 21, sin pasar de este. Regresar 0 si ambos se pasan.
public class Problema2 {

	public static void main(String[] args) {

		int numOne = 22;
		int numTwo = 31;
		int none = 0;
		boolean MasCercano = false;
		if ((numOne > 0) && (numTwo > 0)) {

			if ((numOne <= 21) || (numTwo <= 21)) {

				int diferencia1 = 21 - numOne; // 2  4
				int diferencia2 = 21 - numTwo; // 0 -1

				MasCercano = (diferencia1 < diferencia2); // false si 21-17 = 3 es menor que 21-22
				// true si 3 > -1

				if (MasCercano == false) {

					if (numTwo <= 21) {
						System.out.println(numTwo);
					} else {
						System.out.println(numOne);
					}
					
				}
				if (MasCercano) {
					System.out.println(numOne);
				}

			} else {
				System.out.println(none);
			}

		}
	}
}
