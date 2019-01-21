public class AdjacentSum {
	public static void main(String[] args) {
		// System.out.println(largestAdjacentSum(new int[]{1}));
		System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
	}

	static int largestAdjacentSum(int[] a) {
		int[] arr = a;
		System.out.print(arr.length + " - ");
		if (arr.length >= 2) {
			int largestSum = arr[0] + arr[1];
			for (int i=1; i<arr.length-1; i++){
				int nextSum = arr[i] + arr[i+1];
				if (nextSum > largestSum) {
					largestSum = nextSum;
				}
			}
			return largestSum;
		}
		if (arr.length == 1) return arr[0];
		return 0;
	}
}