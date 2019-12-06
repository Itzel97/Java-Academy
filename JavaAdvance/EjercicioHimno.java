package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioHimno implements HimnoAnalisis {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\curso\\Documents\\New folder\\threads\\ThreadsTest1\\src\\test\\himno.txt");
		EjercicioHimno ej = new EjercicioHimno();

		// Caracteres
		Integer numeroCh = ej.countCharacters(file);
		System.out.println("1.Numero de caracteres = " + numeroCh);
		// letras
		Integer letras = ej.countWords(file);
		System.out.println("2.Numero de letras = " + letras);
	}

	@Override
	public Integer countCharacters(File file) throws IOException {
		// TODO Auto-generated method 
		Integer characterCount = 0;
		file.getName();
		System.out.println(file.getName());

		try {

			FileInputStream fileSteam = new FileInputStream(file);
			InputStreamReader inputStreamReader = new InputStreamReader(fileSteam);
			BufferedReader reader = new BufferedReader(inputStreamReader);
			
			String line =  null;
			
			while ((line = reader.readLine()) !=  null ) {
				characterCount += line.length();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return characterCount;

	}

	@Override
	public Integer countWords(File file) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer cuntLines(File file) {
		// TODO Auto-generated method stub
		return null;
	}

}
