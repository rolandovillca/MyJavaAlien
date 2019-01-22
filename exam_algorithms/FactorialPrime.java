public class FactorialPrime {
	public static void main(String[] args) {
		System.out.println(isFactorialPrime(2));
        System.out.println(isFactorialPrime(3));
        System.out.println(isFactorialPrime(7));
        System.out.println(isFactorialPrime(8));
        System.out.println(isFactorialPrime(11));
        System.out.println(isFactorialPrime(721));
	}

	static int isFactorialPrime(int n) {
		int sum = 0;
		if (isPrime(n)) {
			for (int i=0; i<n && sum<n; i++) {
				sum = factorial(i) + 1;
			}

			if (sum == n) return 1;
			return 0;
		}
		return 0;
	}

	static boolean isPrime(int n) {
		for (int i=2; i<n; i++) {
			if (n%i == 0) return false;
		}
		return true;
	}

	static int factorial(int n) {
		// 0 or 1 are not factorials by definition.
		int total = 1;
		for (int i=n; i>1; i--) {
			total *= i;
		}
		return total;
	}
}