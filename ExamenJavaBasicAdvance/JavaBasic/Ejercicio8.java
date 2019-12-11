package com.softtek.academia.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Itzel
 */
public class Ejercicio8 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		List<String> paises = new ArrayList<>();
		paises.add("Sudafrica");
		paises.add("Egipto");
		paises.add("Turquia");
		paises.add("Rusia");
		paises.add("China");
		paises.add("India");
		
		List<String> paises2 = new ArrayList<>();
		paises2.add("Francia");
		paises2.add("México");
		paises2.add("Australia");
		paises2.add("Italia");
		paises2.add("Argentina");
		paises2.add("Brasil");
		
		List<String> paises3 = new ArrayList<>();
		paises3.addAll(paises);
		paises3.addAll(paises2);
		Collections.sort(paises3);
		
		 System.out.println("Lista ordenada:");
	    showList(paises3);
	    
	}
	
	public static void showList(List paises3) {
        int size = paises3.size();
        for(int i=0; i<size; i++){
            System.out.println(paises3.get(i));
        }
}
}