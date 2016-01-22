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
		
<<<<<<< HEAD
		System.out.println("Sta je ono Novo? \n");
		Metode.newMethod();
=======
		
		System.out.println("DA SE MALO ZACINI!!!! BUAAHAHAHAHA\nRIJESI OVOOOVOVO");
>>>>>>> f12c4e035b93da931bae5e77454164663aae9f7f
		
		input.close();
		
	}

}
