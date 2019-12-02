 import java.util.Scanner;
 
 class Vocales {
	 public static void main (String [] args){
		 Scanner lector = new Scanner (System.in);
		System.out.println( " Ingresa la palabra a analizar en minusculas: ");
		 String data = lector.nextLine();
		 System.out.println( "Resultado por letra de la cadena: ");
		for ( int i = 0;i < data.length(); i ++){
			char vocal = data.charAt(i);
			
			if( vocal == 'a'){
				System.out.println(" Es una a ");
			} else if( vocal == 'e'){
				System.out.println( " Es una e ");
			}else if( vocal == 'i'){ 
				System.out.println( " Es una i ");
			}else if( vocal == 'o'){
				System.out.println( " Es una o ");
			}else if( vocal == 'u'){
				System.out.println( " Es una u ");
			} else {
				System.out.println( " No tiene vocal ");
			}
			
		}
	 }
 }