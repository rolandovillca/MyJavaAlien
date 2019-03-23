/*
An array is defined to be a 235 array:
if the number of elements divisible by 2 
plus the number of elements divisible by 3 
plus the number of elements divisible by 5 
plus the number of elements not divisible by 2, 3, or 5 
is equal to the number of elements of the array. 

Write a method named is235Array that returns 1 
if its array argument is a 235 array, otherwise it returns 0.

NOTE: The function signature is int is235Array(int[] a)
*/

package DataStructureAlgorithms;

class Array235 {
	public static void main(String[] args) {
		System.out.println(is235Array(new int[]{2}));
		System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32}));
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(is235Array(new int[]{7, 11, 77, 49}));
        System.out.println(is235Array(new int[]{2}));
        System.out.println(is235Array(new int[]{}));
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
	}

	static int is235Array(int[] a) {
		int[] arr = a;
		int lenght_array = a.length;
		int total_no_div = 0;
		int total_div_by_2 = 0;
		int total_div_by_3 = 0;
		int total_div_by_5 = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] % 2 == 0 || arr[i] % 3 == 0 || arr[i] % 5 == 0) {
				if (arr[i] % 2 == 0) {
					total_div_by_2++;
				}
				if (arr[i] % 3 == 0) {
					total_div_by_3++;
				}
				if (arr[i] % 5 == 0) {
					total_div_by_5++;
				}
			} else {
				total_no_div++;
			}
		}
		int total = total_div_by_2 + total_div_by_3 + total_div_by_5 + total_no_div;
		if (total == lenght_array) return  1;
		return 0;
	}
}