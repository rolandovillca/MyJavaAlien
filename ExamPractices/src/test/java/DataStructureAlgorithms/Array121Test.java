package DataStructureAlgorithms;

import org.junit.Test;
import static org.junit.Assert.*;

public class Array121Test {
	@Test
	public void testIs121Array_1() {
		int[] arr = new int[]{1, 2, 1};
		assertEquals(0, Array121.is121Array(arr));
	}

	@Test
	public void testIs121Array_2() {
		int[] arr = new int[]{1, 1, 2, 2, 2, 1, 1};
		assertEquals(1, Array121.is121Array(arr));
	}

	@Test
	public void testIs121Array_3() {
		int[] arr = new int[]{1, 1, 2, 2, 2, 1, 1, 1};
		assertEquals(1, Array121.is121Array(arr));
	}

	@Test
	public void testIs121Array_4() {
		int[] arr = new int[]{1, 1, 2, 1, 2, 1, 1};
		assertEquals(0, Array121.is121Array(arr));
	}

	@Test
	public void testIs121Array_5() {
		int[] arr = new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3};
		assertEquals(0, Array121.is121Array(arr));
	}

	@Test
	public void testIs121Array_6() {
		int[] arr = new int[]{1, 1, 1, 1, 1, 1};
		assertEquals(0, Array121.is121Array(arr));
	}

	@Test
	public void testIs121Array_7() {
		int[] arr = new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1};
		assertEquals(0, Array121.is121Array(arr));
	}

	@Test
	public void testIs121Array_8() {
		int[] arr = new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2};
		assertEquals(0, Array121.is121Array(arr));
	}

	@Test
	public void testIs121Array_9() {
		int[] arr = new int[]{2, 2, 2};
		assertEquals(0, Array121.is121Array(arr));
	}
}