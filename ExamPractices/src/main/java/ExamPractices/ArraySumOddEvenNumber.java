/*
Write a function that takes an array of integers as an argument
and returns a value based on the sums of the even and odd numbers in the array.

Let X = the sum of the odd numbers in the array and
let Y = the sum of the even numbers. The function should return X – Y.

Example:
{1}	1
{1, 2}       -> -1
{1, 2, 3}    ->  2
{1, 2, 3, 4} -> -2
{3, 3, 4, 4} -> -2
{3, 2, 3, 4} ->  0
{4, 1, 2, 3} -> -2
{1, 1}       ->  2
{}           ->  0
*/


package ExamPractices;

class ArraySumOddEvenNumber {
	public static void main(String[] args) {
		System.out.println(f(new int[] {1}));
		System.out.println(f(new int[] {1, 2}));
		System.out.println(f(new int[] {1, 2, 3}));
		System.out.println(f(new int[] {1, 2, 3, 4}));
		System.out.println(f(new int[] {3, 3, 4, 4}));
		System.out.println(f(new int[] {3, 2, 3, 4}));
		System.out.println(f(new int[] {4, 1, 2, 3}));
		System.out.println(f(new int[] {1, 1}));
		System.out.println(f(new int[] {}));
	}

	static int f(int[] arr) {
		int evens = 0;
		int odds = 0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evens += arr[i];
			} else {
				odds += arr[i];
			}
		}

		return odds - evens;
	}
}