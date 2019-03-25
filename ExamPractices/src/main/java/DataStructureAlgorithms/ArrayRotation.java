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

import java.util.Arrays;

class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        System.out.println("Rotate Right Side...");
        rotateNShiftRightSide(arr, 3);
        
        System.out.println("Rotate Left Side...");
        rotateNShiftLeftSide(arr, 3);
    }

    static int[] rotateNShiftRightSide(int[] arr, int k) {
        if (arr.length < 2) return new int[]{};
        if (arr.length == 1) return arr;

        int[] result = new int[arr.length];
        int j = 0;

        for(int i=arr.length-k; i<arr.length; i++) {
            result[j] = arr[i];
            j++;
        }

        for(int i=0; i<=k; i++) {
            result[j] = arr[i];
            j++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));

        return result;
    }

    static int[] rotateNShiftLeftSide(int[] arr, int k) {
        if (arr.length < 2) return new int[]{};
        if (arr.length == 1) return arr;

        int[] result = new int[arr.length];
        int j = 0;

        for (int i=k; i<arr.length; i++) {
            result[j] = arr[i];
            j++;
        }

        for (int i=0; i<k; i++) {
            result[j] = arr[i];
            j++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));

        return result;
    }
}