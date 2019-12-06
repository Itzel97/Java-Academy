
public class Desborde {
	public static void main(String[] args) {

		boolean flagError = false;
		try {
			int a[] = new int[10];
			// arrays has only 10 elements
			a[76] = 9;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			flagError = true;
		} finally {
			if (flagError) {
				System.out.println("se imprime siempre..");
			}
		}

		System.out.println("test");
	}
}
