class TripleArray {
	public static void main(String[] args) {
        System.out.println(isTriple(new int[]{3, 1, 2, 1, 3, 1, 3, 2, 2}));
        System.out.println(isTriple(new int[]{2, 5, 2, 5, 5, 2, 5}));
        System.out.println(isTriple(new int[]{3, 1, 1, 1}));
        System.out.println(isTriple(new int[]{3, 3, 1, 1}));
	}

	static boolean isTriple(int[] a) {
		if (a.length <= 1) return false;
		for (int i: a) {
			int triple = 0;
			for (int j: a) {
				if (i == j) {
					triple += 1;
				}
			}
			if (triple == 3) return true;
		}
		return false;
	}
}