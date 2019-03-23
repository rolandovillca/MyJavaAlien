/*
Write a function to reverse an integer using numeric operators
and without using any arrays or other data structures.

The signature of the function is:
int fun(int n)

Example:
========
1234    -> 4321
12005   -> 50021
1       -> 1
1000    -> 1
0       -> 0
-12345  -> -54321
*/

package DataStructureAlgorithms;

public class ReverseNumberNumericOperator {
	public static void main(String[] args) {
		System.out.println("1234 = " + fun(1234));
		System.out.println("12005 = " + fun(12005));
		System.out.println("1 = " + fun(1));
		System.out.println("1000 = " + fun(1000));
		System.out.println("0 = " + fun(0));
		System.out.println("-12345 = " + fun(-12345));
	}

	static int fun(int n) {
		if (n/10 == 0) return n;
		int reversedNumber = 0;

		while (n != 0) {
			reversedNumber = reversedNumber*10 + n%10;
			n = n/10;
		}
		return reversedNumber;
	}
}