/*
A number is called happy if it leads to 1 after a sequence of steps where in 
each step number is replaced by sum of squares of its digit that is if we start 
with Happy Number and keep replacing it with digits square sum, we reach 1.

The first few unhappy numbers are: 2, 3, 4, 5, 6, 8, 9, 11, 12, 14, 15, 16, 17, 18, 20.

Examples :

Input: n = 19
Output: True

19 is Happy Number because:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1

As we reached to 1, 19 is a Happy Number.

Input: n = 20
Output: False
*/

package DataStructureAlgorithms;

public class HappyNumber {

	//1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100

	public static void main(String[] args) {
		for (int i=1; i<100; i++) {
			boolean res = isHappyNumber(i);
			if (res) {
				System.out.println(i + " is = " + isHappyNumber(i));
			}
		}
	}

	static boolean isHappyNumber(int n){
		int myNum = n;
		int happyNumber = n;
		while (happyNumber != 1) {
			int tmp = happyNumber;
			int aux = 0;
			happyNumber = 0;
			while (tmp != 0) {
				aux = tmp % 10;
				happyNumber = happyNumber + aux*aux;
				tmp = tmp / 10;
			}
			if (happyNumber == 4) return false;
		}
		return true;
	}
}
