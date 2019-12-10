package Problema5;

public class Numeros implements Operaciones {

	
	@Override
	public void sumar(int num1, int num2) {
		// TODO Auto-generated method stub
		int sum = num1 + num2;
		
		System.out.println("La suma es: " + sum);
	}

	@Override
	public void resta(int num1, int num2) {
		// TODO Auto-generated method stub
		
		int resta = num1 - num2;
		System.out.println("La resta es: " + resta);
	}

	@Override
	public void multi(int num1, int num2) {
		// TODO Auto-generated method stub
		int multi = num1 + num2;
		System.out.println("La multiplicacion es: " + multi);
	}

	@Override
	public void div(int num1, int num2) {
		// TODO Auto-generated method stub
		
		int div = num1 / num2;
		System.out.println("La division es: " + div);
	}



}
