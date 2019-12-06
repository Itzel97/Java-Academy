


public class ArithmeticException1 {
	public static void main (String [] args) {
		
		
		try {
			int num1 = 30;
			int num2 = 0;
			int out= num1/num2;
			System.out.println("Result = " + out);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Division entre cero invalida. " + e );
		}
	}
}
