import java.util.Scanner;

// Write a Java program to allow the user to input two integer values 
// and then the program prints the results of adding
// substracting, multiplying , and dividing among the two values..

public class Ex4 {
	public static void main (String [] args) {
		Scanner lector = new Scanner (System.in);
		System.out.println( " Ingresa el primer valor A entero: ");
		int numOne = lector.nextInt();
		System.out.println( " Ingresa el segundo valor B entero: ");
		int numTwo = lector.nextInt();
		
		int Sum_ar = numOne + numTwo;
		int res_tar = numOne - numTwo;
		int mult = (numOne + numTwo);
		float numOnef = numOne + 0.0f;
		float div = (numOnef/numTwo);
		
		System.out.println( " Suma de A + B = " + Sum_ar);
		System.out.println( " Resta de A - B = " + res_tar);
		System.out.println( " Multiplicacion de A * B = " + mult);
		System.out.println( " Division de A / B = " + div);
		
	}
}