import java.util.ArrayList;
import java.util.List;

public class ThreadsTest {

	public static void main(String[] args) {

		List<String> letras = new ArrayList<>();
		letras.add("H");
		letras.add("H");
		//letras.add("L");
		//letras.add("A");

		
		try {
			for (String letra : letras) {
				System.out.println(letra);
				if (letra.equals("H")) {
					letras.remove(letra);
					
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			letras.clear();
		}
		
		System.out.println(letras);
	}
}
