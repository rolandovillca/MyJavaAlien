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