package bubblesort;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTestEq {

	@Test
	public void testAufsteigend1() {
		int[] in1 = {1,2,3,4,5,6};

		int[] res1 = BubbleSort.abc(in1);

		assertArrayEquals(in1, res1);
	}
	
	@Test
	public void testAufsteigend2() {
		int[] in2 = {1,1,2,3,4,5};
		int[] in3 = {1,2,3,5,5,5};
		int[] in4 = {1,3,3,3,3,4};
		int[] in5 = {3,3,3,3,3,3};
		
		int[] res2 = BubbleSort.abc(in2);
		int[] res3 = BubbleSort.abc(in3);
		int[] res4 = BubbleSort.abc(in4);
		int[] res5 = BubbleSort.abc(in5);
		
		assertArrayEquals(in2, res2);
		assertArrayEquals(in3, res3);
		assertArrayEquals(in4, res4);
		assertArrayEquals(in5, res5);
	}
	
	@Test
	public void testAufsteigend3() {
		int[] in6 = {1,1,2,3,4,4};
		int[] in7 = {1,1,2,2,2,4};
		int[] in8 = {2,2,2,4,4,4};
		int[] in9 = {1,1,2,2,3,4};
		
		int[] res6 = BubbleSort.abc(in6);
		int[] res7 = BubbleSort.abc(in7);
		int[] res8 = BubbleSort.abc(in8);
		int[] res9 = BubbleSort.abc(in9);
		
		assertArrayEquals(in6, res6);
		assertArrayEquals(in7, res7);
		assertArrayEquals(in8, res8);
		assertArrayEquals(in9, res9);
	}
	
	@Test
	public void testAufsteigend4() {
		int[] in10 = {1,1,2,2,3,3};
		
		int[] res10 = BubbleSort.abc(in10);
		
		assertArrayEquals(in10, res10);
	}
	
	@Test
	public void testAbsteigend1() {
		int[] in1 = {6,5,4,3,2,1};

		int[] exp1 = {1,2,3,4,5,6};

		int[] res1 = BubbleSort.abc(in1);

		assertArrayEquals(exp1, res1);
	}
	
	@Test
	public void testAbsteigend2() {
		int[] in2 = {6,6,5,4,3,2};
		int[] in3 = {6,5,4,3,3,3};
		int[] in4 = {6,5,5,5,5,4};
		
		int[] exp2 = {2,3,4,5,6,6};
		int[] exp3 = {3,3,3,4,5,6};
		int[] exp4 = {4,5,5,5,5,6};
		
		int[] res2 = BubbleSort.abc(in2);
		int[] res3 = BubbleSort.abc(in3);
		int[] res4 = BubbleSort.abc(in4);
		
		assertArrayEquals(exp2, res2);
		assertArrayEquals(exp3, res3);
		assertArrayEquals(exp4, res4);
	}
	
	@Test
	public void testAbsteigend3() {
		int[] in5 = {6,6,5,4,3,3};
		int[] in6 = {6,6,5,5,5,4};
		int[] in7 = {6,6,6,5,5,5};
		int[] in8 = {6,5,5,4,3,3};
		
		int[] exp5 = {3,3,4,5,6,6};
		int[] exp6 = {4,5,5,5,6,6};
		int[] exp7 = {5,5,5,6,6,6};
		int[] exp8 = {3,3,4,5,5,6};
		
		int[] res5 = BubbleSort.abc(in5);
		int[] res6 = BubbleSort.abc(in6);
		int[] res7 = BubbleSort.abc(in7);
		int[] res8 = BubbleSort.abc(in8);
		
		assertArrayEquals(exp5, res5);
		assertArrayEquals(exp6, res6);
		assertArrayEquals(exp7, res7);
		assertArrayEquals(exp8, res8);
	}
	
	@Test
	public void testAbsteigend4() {
		int[] in9 = {6,6,5,5,4,4};
		
		int[] exp9 = {4,4,5,5,6,6};
		
		int[] res9 = BubbleSort.abc(in9);
		
		assertArrayEquals(exp9, res9);
	}
	
	@Test
	public void testUnsortiert1() {
		int[] in1 = {3,6,4,1,5,2};

		int[] exp1 = {1,2,3,4,5,6};

		int[] res1 = BubbleSort.abc(in1);

		assertArrayEquals(exp1, res1);
	}
	
	@Test
	public void testUnsortiert2() {
		int[] in2 = {3,4,1,5,1,2};
		int[] in3 = {2,6,6,1,6,3};
		int[] in4 = {5,4,1,4,6,4};
		int[] in5 = {2,2,5,3,4,2};
		
		int[] exp2 = {1,1,2,3,4,5};
		int[] exp3 = {1,2,3,6,6,6};
		int[] exp4 = {1,4,4,4,5,6};
		int[] exp5 = {2,2,2,3,4,5};
		
		int[] res2 = BubbleSort.abc(in2);
		int[] res3 = BubbleSort.abc(in3);
		int[] res4 = BubbleSort.abc(in4);
		int[] res5 = BubbleSort.abc(in5);
		
		assertArrayEquals(exp2, res2);
		assertArrayEquals(exp3, res3);
		assertArrayEquals(exp4, res4);
		assertArrayEquals(exp5, res5);
	}
	
	@Test
	public void testUnsortiert3() {
		int[] in0 = {4,4,6,4,5,6};
		
		int[] in6 = {1,6,1,2,6,5};
		int[] in7 = {1,6,1,5,2,1};
		int[] in8 = {4,4,6,4,2,6};
		int[] in9 = {3,5,4,3,4,3};
		
		int[] exp0 = {4,4,4,5,6,6};
		
		int[] exp6 = {1,1,2,5,6,6};
		int[] exp7 = {1,1,1,2,5,6};
		int[] exp8 = {2,4,4,4,6,6};
		int[] exp9 = {3,3,3,4,4,5};
		
		int[] res0 = BubbleSort.abc(in0);
		
		int[] res6 = BubbleSort.abc(in6);
		int[] res7 = BubbleSort.abc(in7);
		int[] res8 = BubbleSort.abc(in8);
		int[] res9 = BubbleSort.abc(in9);
		
		assertArrayEquals(exp0, res0);
		
		assertArrayEquals(exp6, res6);
		assertArrayEquals(exp7, res7);
		assertArrayEquals(exp8, res8);
		assertArrayEquals(exp9, res9);
	}
	
	@Test
	public void testUnsortiert4() {
		int[] in10 = {6,3,1,6,3,1};
		int[] in11 = {2,2,6,6,1,1};
		int[] in12 = {5,4,5,3,3,4};
		
		int[] exp10 = {1,1,3,3,6,6};
		int[] exp11 = {1,1,2,2,6,6};
		int[] exp12 = {3,3,4,4,5,5};
		
		int[] res10 = BubbleSort.abc(in10);
		int[] res11 = BubbleSort.abc(in11);
		int[] res12 = BubbleSort.abc(in12);
		
		assertArrayEquals(exp10, res10);
		assertArrayEquals(exp11, res11);
		assertArrayEquals(exp12, res12);
	}

}
