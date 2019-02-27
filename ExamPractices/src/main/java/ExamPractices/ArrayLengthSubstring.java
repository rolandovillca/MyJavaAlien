/*
Write a function that accepts a character array,
a zero-based start position and a length.

It should return a character array containing containing length characters
starting with the start character of the input array.

The function should do error checking on the start position and the length
and return null if the either value is not legal.

The function signature is: char[ ] f(char[ ] a, int start, int len)

Example:
{'a', 'b', 'c'}, 0, 4   -> null
{'a', 'b', 'c'}, 0, 3   -> {'a', 'b', 'c'}
{'a', 'b', 'c'}, 0, 2   -> {'a', 'b'}
{'a', 'b', 'c'}, 0, 1   -> {'a'}
{'a', 'b', 'c'}, 1, 3   -> null
{'a', 'b', 'c'}, 1, 2   -> {'b', 'c'}
{'a', 'b', 'c'}, 1, 1   -> {'b'}
{'a', 'b', 'c'}, 2, 2   -> null
{'a', 'b', 'c'}, 2, 1   -> {'c'}
{'a', 'b', 'c'}, 3, 1   -> null
{'a', 'b', 'c'}, 1, 0   -> {}
{'a', 'b', 'c'}, -1, 2  -> null
{'a', 'b', 'c'}, -1, -2 -> null
{}, 0, 1                -> null
*/
package ExamPractices;

import java.util.*;

class ArrayLengthSubstring {
	public static void main(String[] args) {
		System.out.println(fun(new char[] {'a', 'b', 'c'}, 0, 4));
		System.out.println(fun(new char[] {'a', 'b', 'c'}, 0, 3));
		System.out.println(fun(new char[] {'a', 'b', 'c'}, 0, 2));
		System.out.println(fun(new char[] {'a', 'b', 'c'}, 0, 1));
		System.out.println(fun(new char[] {'a', 'b', 'c'}, 1, 3));
		System.out.println(fun(new char[] {'a', 'b', 'c'}, 1, 2));
		System.out.println(fun(new char[] {'a', 'b', 'c'}, 1, 1));
		System.out.println(fun(new char[] {'a', 'b', 'c'}, 2, 2));
		System.out.println(fun(new char[] {'a', 'b', 'c'}, 2, 1));
		System.out.println(fun(new char[] {'a', 'b', 'c'}, 3, 1));
		System.out.println(fun(new char[] {'a', 'b', 'c'}, 1, 0));
		System.out.println(fun(new char[] {'a', 'b', 'c'}, -1, 2));
		System.out.println(fun(new char[] {'a', 'b', 'c'}, -1, -2));
		System.out.println(fun(new char[] {}, 0, 1));
	}

	static String fun(char[] a, int start, int len) {
		System.out.println("aaaaaaaaaaa a.length: " + a.length);
		System.out.println("bbbbbbbbbbbbbbbb len: " + len);

		if (len > a.length) return null;
		if (start < 0 || len < 0) return null;

		char[] arr = new char[len];

		for (int i=start; i<len; i++) {
			arr[i] = a[i];
		}

		return (arr.length > 0) ? Arrays.toString(arr) : "Null";
	}
}