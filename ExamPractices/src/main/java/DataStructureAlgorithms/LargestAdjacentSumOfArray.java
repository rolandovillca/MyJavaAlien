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

class LargetAdjacentSumOfArray {
	public static void main(String[] args) {
		System.out.println("7 = " + sum(new int[]{1, 2, 3, 4}));
		System.out.println("6 = " + sum(new int[]{18, -12, 9, -10}));
		System.out.println("2 = " + sum(new int[]{1,1,1,1,1,1,1,1,1}));
		System.out.println("3 = " + sum(new int[]{1,1,1,1,1,2,1,1,1}));
	}

	static int sum(int[] arr) {
		if (arr.length < 2) return 0;
		if (arr.length == 1) return arr[0];

		int adjacentSum = arr[0] + arr[1];
		int tmp;

		for (int i=1; i<arr.length-1; i++) {
			tmp = arr[i] + arr[i+1];
			if (tmp > adjacentSum) adjacentSum =+ tmp;
		}
		return adjacentSum;
	}
}