package ExamPractices;

class MyDailyExample {
	public static void main(String[] args) {
		System.out.println(is121Array(new int[]{1, 1, 2, 2, 1, 1}));
		System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
	}

	static int is121Array(int[] a) {
		if (a.length < 2) return 0;
		int i, j;
		for (i=0, j=a.length; i<a.length && j>0 && i<j; i++, j--) {
			if (a[i] != 1 || a[j] != 1) {
                if (a[i] != 2 || a[j] != 2) {
					break;
				}
            }
		}
		return 0;
	}
} 
