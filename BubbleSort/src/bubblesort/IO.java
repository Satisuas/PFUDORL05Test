package bubblesort;

import java.util.Scanner;

public class IO {
	
	private static final int LAENGE = 6;
	private static IOuse ioUse = new IOuse();
	

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		int[] eingabe = ioUse.einlesen(LAENGE);
		int[] ausgabe = BubbleSort.abc(eingabe);
		ioUse.ausgeben(ausgabe);
	}

}

class IOuse{
	private Scanner sc = new Scanner(System.in);
	int[] einlesen(int laenge) {
		int[] eingabe = new int[6];
		for (int i = 0; i < laenge; i++) {
			eingabe[i] = sc.nextInt();
		}
		return eingabe;
	}

	void ausgeben(int[] ausgabe) {
		for (int i = 0; i < ausgabe.length; i++) {
			System.out.print(ausgabe[i] + " ");
		}
	}
}
