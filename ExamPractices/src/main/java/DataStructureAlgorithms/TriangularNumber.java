/*
Triangular Numbers:

A number is termed as triangular number if we can represent it in the form 
of triangular grid of points such that the points form an equilateral triangle
and each row contains as many points as the row number, e.i. the first row has 
one point, second row has two points, third row has three points and so on.

The starting triangular numbers are:
1, 3(1+2), 6(1+2+3), 10(1+2+3+4)
*/

package DataStructureAlgorithms;

class TriangularNumber {
	public static void main(String[] args) {
		for (int i=1; i<15; i++) {
			System.out.println(i + " > " + isTriangular(i));
		}
	}

	static boolean isTriangular(int n) {
		if (n < 0) return false;

		int sum = 0;
		for(int i=1; i<=n && sum < n; i++) {
			sum += i;
		}

		if (sum == n) return true;
		return false;
	}
}