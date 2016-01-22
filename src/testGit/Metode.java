package testGit;

public class Metode {
	
	public static void printSyso(String text) {
		
			System.out.println(text);
			
		}
	
	public static void printNumbers(int[] numbers) {
		
		for(int i = 0; i < numbers.length; i++) {
			
			System.out.print(numbers[i] + " ");
			
		}
	}
	
	/**
	 * @nov0
	 */
	public static void newMethod() {
		System.out.println("Novo car!!! :)");
	}
	
	/**
	 * @author Beyon
	 */
	public static void format() {
		System.out.println("Invoke this method to format your C: drive.");
	}
	
}
