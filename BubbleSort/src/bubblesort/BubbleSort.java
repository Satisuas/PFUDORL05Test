/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesort;

/**
 *
 * @author Hann17-FIA-Stud02
 */
public class BubbleSort {
	public static int[] abc(int[] feld) {
		int temp;
		do {
			temp = feld[0];
			for (int j = 1; j < feld.length; j++) {
				if (feld[j] < feld[j - 1]) {
					temp = feld[j - 1];
					feld[j - 1] = feld[j];
					feld[j] = temp;
				}
			}
		} while (temp != feld[0]);
		return feld;
	}

}
