package DataStructureAlgorithms;

class FibonacciNumber {
	public static void main(String[] args) {
		//getFibonacci(10);
		System.out.print(isFibonacci(1));
        System.out.print(isFibonacci(2));
        System.out.print(isFibonacci(3));
        System.out.print(isFibonacci(4));
        System.out.print(isFibonacci(5));
        System.out.print(isFibonacci(6));
        System.out.print(isFibonacci(7));
        System.out.print(isFibonacci(8));
        System.out.print(isFibonacci(9));
        System.out.print(isFibonacci(10));
        System.out.print(isFibonacci(11));
        System.out.print(isFibonacci(12));
        System.out.print(isFibonacci(13));
	}

	static int isFibonacci(int n) {
		if (n == 1) return 1;
		int fiboSum = getFibonacci1(n);
		System.out.println(" -> " + n + " ->" +fiboSum);
		if (fiboSum == n) return 1;
			return 0;
	}

	static int getFibonacci1(int n) {
		int prevSum = 0;
		int nextSum = 1;
		int fiboSum = 0;
		while (fiboSum < n) {
			fiboSum = prevSum + nextSum;
			prevSum = nextSum;
			nextSum = fiboSum;
		}
		return fiboSum;
	}

	static int getFibonacci2(int n) {
		if (n == 1) return 1;
		int prevSum = 0;
		int nextSum = 1;
		int fiboSum = 0;
		for (int i=1; i<=n; i++) {
			fiboSum = prevSum + nextSum;
			prevSum = nextSum;
			nextSum = fiboSum;
		}
		return fiboSum;
	}
}