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

class IOuse {
	private Scanner sc = new Scanner(System.in);

	int[] einlesen(int laenge) {
		int[] eingabe = new int[laenge];
		boolean flag;
		System.out.println("Gib 6 Integer ein");
		do {
			flag = true;
			for (int i = 0; i < laenge; i++) {
				if (!sc.hasNextInt()) {
					System.out.println("Ungültige Eingabe, Nur Integer sind Erlaubt, bitte versuche es erneut");
					flag = false;
					sc.next();
					break;
				} else {
					eingabe[i] = sc.nextInt();
				}
			}
		} while (!flag);
		return eingabe;
	}

	void ausgeben(int[] ausgabe) {
		for (int i = 0; i < ausgabe.length; i++) {
			System.out.print(ausgabe[i] + " ");
		}
	}
}
