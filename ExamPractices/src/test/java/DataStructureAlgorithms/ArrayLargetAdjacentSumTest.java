/**
 * A function named largestAdjacentSum that iterates through an array 
 * computing the sum of adjacent elements and returning the largest such sum.
 *
 * Examples:
 *
 * {1, 2, 3, 4} returns 7 because 3+4 is larger than either 1+2 or 2+3
 * {18, -12, 9, -10} returns 6 because 18-12 is larger than -12+9 or 9-10
 * {1,1,1,1,1,1,1,1,1} returns 2 because all adjacent pairs sum to 2
 * {1,1,1,1,1,2,1,1,1} returns 3 because 1+2 or 2+1 is the max sum of adjacent pairs
 */

package DataStructureAlgorithms;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class ArrayLargetAdjacentSumTest {

	@Before // setup()
	public void before() throws Exception {
		System.out.println("Setting Before - ArrayLargetAdjacentSumTest");
	}

	@After // tearDown()
	public void after() throws Exception {
		System.out.println("Setting After - ArrayLargetAdjacentSumTest");
	}

	@Test
	public void sum1() {
		int[] arr = new int[]{1, 2, 3, 4};
		assertEquals(7, ArrayLargetAdjacentSum.sum(arr));
	}

	@Test
	public void sum2() {
		int[] arr = new int[]{18, -12, 9, -10};
		assertEquals(6, ArrayLargetAdjacentSum.sum(arr));
	}

	@Test
	public void sum3() {
		int[] arr = new int[]{1,1,1,1,1,1,1,1,1};
		assertEquals(2, ArrayLargetAdjacentSum.sum(arr));
	}

	@Test
	public void sum4() {
		int[] arr = new int[]{1,1,1,1,1,2,1,1,1};
		assertEquals(3, ArrayLargetAdjacentSum.sum(arr));
	}
}