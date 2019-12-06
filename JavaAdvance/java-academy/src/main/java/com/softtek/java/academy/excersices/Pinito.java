package com.softtek.java.academy.excersices;

import java.util.Scanner;

//HACER ESTE EJERCICIO CON UN LOOP.
public class Pinito {

	String puntito;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("how many rows to print out (1-10)?");
		int number = scanner.nextInt();
		if (number < 10) {
			switch (number) {
			case 10:
				System.out.println("**********");
			case 9:
				System.out.println("*********");
			case 8:
				System.out.println("********");
			case 7:
				System.out.println("*******");
			case 6:
				System.out.println("******");
			case 5:
				System.out.println("*****");
			case 4:
				System.out.println("****");
			case 3:
				System.out.println("***");
			case 2:
				System.out.println("**");
			case 1:
				System.out.println("*");
			default:
				System.out.println("There's not more points.");
			}
		} else if (number < 0 || number > 10) {
			System.out.println("The number of rows is out of the rage (1-10).");
		}

	}
}



