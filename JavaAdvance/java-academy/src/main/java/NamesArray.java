package com.softtek.java.academy.excersices;

import java.lang.reflect.Array;
import java.util.Scanner;

// Crear programa que acepte 10 nombres del usuario a un array, crear un método que capture y regrese este array
// Asignar los nombres a una lista, Presentarlos en pantalla con un iterator, Sortear los nombres
// Presentarlos en pantalla con un iterator, lanzar una excepcion custom si uno de os nombres es Tigras, "No".
public class NamesArray {

	private int i;

	public void main(String[] names) {
		String nombres[] = new String[10];
		
		if (nombres.length <= 10) {
			Scanner name = new Scanner(System.in);
			System.out.println("Escribe un nombre (Debes escribir 10 en total despues de cada enter).");
			String newName = name.next();
			nombres[i]= newName;
		}
		
			System.out.println ("Nombres guardados: " + nombres );
	}
}
