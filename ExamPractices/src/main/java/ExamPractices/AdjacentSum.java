/*
A function named largestAdjacentSum that iterates through an array 
computing the sum of adjacent elements and returning the largest such sum.

Examples:
if a is               return
{1, 2, 3, 4}          -> 7 because 3+4 is larger than either 1+2 or 2+3
{18, -12, 9, -10}     -> 6 because 18-12 is larger than -12+9 or 9-10
{1,1,1,1,1,1,1,1,1}   -> 2 because all adjacent pairs sum to 2
{1,1,1,1,1,2,1,1,1}   -> 3 because 1+2 or 2+1 is the max sum of adjacent pairs
*/

package ExamPractices;

public class AdjacentSum {
	public static void main(String[] args) {
		// System.out.println(largestAdjacentSum(new int[]{1}));
		System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
	}

	static int largestAdjacentSum(int[] a) {
		int[] arr = a;
		System.out.print(arr.length + " - ");
		if (arr.length >= 2) {
			int largestSum = arr[0] + arr[1];
			for (int i=1; i<arr.length-1; i++){
				int nextSum = arr[i] + arr[i+1];
				if (nextSum > largestSum) {
					largestSum = nextSum;
				}
			}
			return largestSum;
		}
		if (arr.length == 1) return arr[0];
		return 0;
	}
}