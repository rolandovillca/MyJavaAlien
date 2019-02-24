/*
An array with an odd number of elements is said to be centered if all elements 
(except the middle one) are strictly greater than the value of the middle element. 

Note that only arrays with an odd number of elements have a middle element.
Write a function that accepts an integer array and returns 1
if it is a centered array, otherwise it returns 0.

Example:
{1, 2, 3, 4, 5}	-> 0 (the middle element 3 is not strictly less than all other elements)
{3, 2, 1, 4, 5}	-> 1 (the middle element 1 is strictly less than all other elements)
{3, 2, 1, 4, 1}	-> 0 (the middle element 1 is not strictly less than all other elements)
{1, 2, 3, 4}	-> 0 (no middle element)
{}	            -> 0 (no middle element)
{10}	        -> 1 (the middle element 10 is strictly less than all other elements)
*/

package ExamPractices;

class ArrayOddNumberCentered {
	public static void main(String[] args) {
		System.out.println(isCentral(new int[] {1, 2, 3, 4, 5}));
		System.out.println(isCentral(new int[] {3, 2, 1, 4, 5}));
		System.out.println(isCentral(new int[] {3, 2, 1, 4, 1}));
		System.out.println(isCentral(new int[] {1, 2, 3, 4}));
		System.out.println(isCentral(new int[] {}));
		System.out.println(isCentral(new int[] {10}));
	}

	static int isCentral(int[] arr) {
		if (arr.length < 3) return 0;
		if (arr.length % 2 == 0) return 0;

		int idx = arr.length/2;
		int value = arr[idx];

		boolean flagLeft = true;
		boolean flagRight = true;

		for(int i=0; i<arr.length; i++) {
			if (i < idx) {
				if (arr[i] <= value) flagLeft = false;
			}
			if (i > idx) {
				if (arr[i] <= value) flagRight = false;
			}
		}

		if (flagLeft==true && flagRight==true) return 1;
		return 0;
	}
}