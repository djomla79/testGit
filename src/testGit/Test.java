package testGit;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite text: ");
		
		String text = input.nextLine();
		
		Metode.printSyso(text);
		
		input.close();
		
	}

}
