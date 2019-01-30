/*
This is a Java Program to Compute the Sum of Digits in a given Integer.

Enter any integer number as input.

After that we use modulus and division operation respectively to find the 
sum of digits of number as output.
*/

package ExamPractices;

class SumDigits {
	public static void main(String[] args) {
		System.out.println(sumDigits(-110));
	}

	static int sumDigits(int n) {
		if (n < 0) n = -n;
		int sum = 0;
		while(n != 0) {
			int d = n%10;
			sum += d;
			n = n/10;
		}
		return sum;
	}
}