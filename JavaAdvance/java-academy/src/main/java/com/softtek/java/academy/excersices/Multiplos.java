package com.softtek.java.academy.excersices;

public class Multiplos {
	/*
	 * Si enumeramos todos los números naturales por debajo de 10 que son múltiplos
	 * de 3 o 5, obtenemos 3, 5, 6 y 9. La suma de estos múltiplos es 23. Encuentre
	 * la suma de todos los múltiplos de 3 o 5 por debajo de 100.
	 */

	public static void main(String[] args) {
		int sumaTotal = 0;
		int MultiplodeTres = 0;
		int MultiplodeCinco = 0;
		for (int i = 0; i <= 100; i++) {

			int debajo = i;
			int moduloTres = debajo % 3;
			int moduloCinco = debajo % 5;

			if (moduloTres == 0) {
				System.out.println(debajo);
				MultiplodeTres += debajo;
			}
			if (moduloCinco == 0) {
				System.out.println(debajo);
				MultiplodeCinco += debajo;
			}
		}
		sumaTotal = MultiplodeTres + MultiplodeCinco;

		System.out.println("La suma de todos los multiplos es " + sumaTotal);
	}
}
