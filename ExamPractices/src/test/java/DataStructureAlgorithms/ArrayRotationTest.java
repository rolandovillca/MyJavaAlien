/**
 * Rotate the given Array to n-times to right and left side.
 * 
 * ROTATE RIGHT SIDE:
 * Given Array [1, 2, 3, 4, 5, 6, 7] and 3 times to rotate to right side.
 * Then, the result will be [5, 6, 7, 1, 2, 3, 4]
 * 
 * ROTATE LEFT SIDE:
 * Given Array [1, 2, 3, 4, 5, 6, 7] and 3 times to rotate to left side.
 * Then, the result will be [4, 5, 6, 7, 1, 2, 3]
 */

package DataStructureAlgorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayRotationTest {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

    @Before
    public void before() {
        System.out.println("Setting Before - ArrayRotationTest");
    }

    @After
    public void after() {
        System.out.println("Setting After - ArrayRotationTest");
    }

    @Test
    public void testRotateArrayToRightSide() {
        int[] expecteds = new int[]{5, 6, 7, 1, 2, 3, 4};
        int[] actuals = ArrayRotation.rotateNShiftRightSide(arr, 3);
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testRotateArrayToLeftSide() {
        int[] expecteds = new int[]{4, 5, 6, 7, 1, 2, 3};
        int[] actuals = ArrayRotation.rotateNShiftLeftSide(arr, 3);
        assertArrayEquals(expecteds, actuals);
    }
}