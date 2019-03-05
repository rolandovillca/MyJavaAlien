/*
Consider an array A with n of positive integers.
An integer idx is called a POE (point of equilibrium) of A,
if A[0] + A[1] + … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1].

Write a function to return POE of an array, if it exists and -1 otherwise. 

The signature of the function is: int fun(int[] a)

Examples:
=========
if input arrays are:         return:
{1, 8, 3, 7, 10, 2}	         ->  3 Reason: a[0] + a[1] + a[2] is equal to a[4] + a[5]
{1, 5, 3, 1, 1, 1, 1, 1, 1}	 ->  2 Reason: a[0] + a[1] is equal to a[3] + a[4] + a[5] + a[6] + a[7] + a[8]
{2, 1, 1, 1, 2, 1, 7}        ->  5 Reason: a[0] + a[1] + a[2] + a[3] + a[4] is equal to a[6]
{1, 2, 3}                    -> -1 Reason: No POE.
{3, 4, 5, 10}                -> -1 Reason: No POE.
{1, 2, 10, 3, 4}             -> -1 Reason: No POE.
*/

package ExamPractices;

class PointOfEquilibriumPOE {
	public static void main(String[] args) {
		System.out.println(" 3 = " + fun(new int[]{1, 8, 3, 7, 10, 2}));
		System.out.println(" 2 = " + fun(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}));
		System.out.println(" 5 = " + fun(new int[]{2, 1, 1, 1, 2, 1, 7}));
		System.out.println("-1 = " + fun(new int[]{1, 2, 3}));
		System.out.println("-1 = " + fun(new int[]{3, 4, 5, 10}));
		System.out.println("-1 = " + fun(new int[]{1, 2, 10, 3, 4}));
	}

	static int fun(int[] a) {
		if (a.length < 3) return -1;

		int[] arr = a;
		int leftSum = arr[0];
		int rightSum = arr[arr.length-1];

		int i=0, j=arr.length-1;

		while(i < arr.length-1 && j>i) {
			if (leftSum == rightSum) {
				if (j-i == 2) {
					return i+1;
				}
				if (arr[i+1] > arr[j-1]) {
					j--;
					rightSum = rightSum + arr[j];
				} else {
					i++;
					leftSum = leftSum + arr[i];
				}
			}

			if (leftSum > rightSum) {
				j--;
				rightSum = rightSum + arr[j];
			}

			if (leftSum < rightSum) {
				i++;
				leftSum = leftSum + arr[i];
			}
		}
		return -1;
	}
}