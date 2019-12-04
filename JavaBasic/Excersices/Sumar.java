//Excercise
//Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. 
//The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; 
//otherwise it should terminate. 

import java.util.Scanner;

public class Sumar {
    public static void main (String[] args){
         int respuesta = 0;
        do {
   
            Scanner lector = new Scanner(System.in);
            System.out.println("Ingrese el primer numero: ");
            int numOne = lector.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            int numTwo = lector.nextInt();
            int Sum_ar = numOne + numTwo;
            System.out.println("La suma de " + numOne + " + " + numTwo + " = " + Sum_ar );
            System.out.println("Desea hacer otra suma? ( si = 1 /no = 0 ) ");
             respuesta = lector.nextInt();
        }
        while( respuesta == 1);
        System.out.println("Termine de sumar.");
}
}