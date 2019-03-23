/*
Define an array to be a 121 array if all elements are either 1 or 2
and it begins with one or more 1s followed by a one or more 2s
and then ends with the same number of 1s that it begins with.

Write a method named is121 Array that returns 1,
if its array argument is a 121 array, otherwise, it returns 0.

There is one additional requirement:
You should return 0 as soon as it is known that the array is not a 121 array;
continuing to analyze the array would be a waste of CPU cycles.

If you are programming in Java or C#, the function signature is,
int is121Array(int[ ] a)

If you are programming in C or C++, the function signature is,
int is121Array(int a[], int len)
where len is the number of elements in the array a
*/

package DataStructureAlgorithms;

class Array121 {
	public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
	}

	public static int is121Array(int[] a) {
		if (a.length <= 3 || a[0] != 1 || a[a.length-1] != 1) {
			return 0;
		}

		int i, j=0;
		boolean flag = false;
		for (i=0, j=a.length; i<a.length && j>=0 && i<=j; i++, j--) {
			if(a[i] != 1 && a[j] != 1) {
				flag = true;
				break;
			}
		}

		for (int index=i; index<=j; index++) {
			if (a[index] != 2) {
				return 0;
			}
		}

		if (flag) return 1;
		return 0;
	}
}