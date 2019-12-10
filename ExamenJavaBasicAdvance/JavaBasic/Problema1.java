package JavaBasic;

public class Problema1 {

	public static void main(String[] args) {

		int Nnum = 4;
		int Inum = 0;
		int mult = 0;

		if ((Nnum <= 2 || Nnum <= 20) && (Inum <= 1 || Inum <= 10)) {
			for (int i = 1; i <= 10; i++) {
				Inum++;
				mult = Nnum * Inum;
				System.out.println(Nnum + " x " + Inum + " = " + mult);
			}

		} else {
			System.out.println("SOBREPASA EL VALOR LIMITE N (2-20) E I (1-10)");
		}

	}

}
