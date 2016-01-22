package testGit;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite text: ");
		
		String text = input.nextLine();
		
		int[] brojevi = {1, 3, 5, 7, 9};
		
		Metode.printNumbers(brojevi);
		
		Metode.printSyso(text);
		
		
		System.out.println("DA SE MALO ZACINI!!!! BUAAHAHAHAHA\nRIJESI OVOOOVOVO");
		
		input.close();
		
	}

}
