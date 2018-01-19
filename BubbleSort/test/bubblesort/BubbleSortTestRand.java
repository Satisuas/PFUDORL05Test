package bubblesort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSortTestRand {

	@Test
	public void test() {

		for (int j = 0; j < 1000000000; j++) {
			int[] in = new int[6];
			for (int i = 0; i < 6; i++) {
				in[i] = (int) Math.random() * 100;
			}

			int[] res = BubbleSort.abc(in);

			Arrays.sort(in);

			assertArrayEquals(in, res);
		}
	}

}
