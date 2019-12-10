package JavaBasic;

import java.util.Scanner;

public class Problema3 {
	String cadena;

	public static void main(String[] args) {
		int inc = 0;
		boolean Error = false;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba una palabra polindroma(sin mayusculas,acentos o ñ): ");
		String cadena = lector.next();
		int des = cadena.length()-1;
	
		while( (inc < des ) && (!Error)){
			
			if ( cadena.charAt(inc) == cadena.charAt(des)) {
				inc++;
				des--;
			} else {
				Error = true;
			}
		} 
		if(!Error) {
			System.out.println(cadena + " es un PALINDROMO");
		}else {
			System.out.println(cadena + " NO un PALINDROMO");
			}
		}
		
	}
	
	
	

