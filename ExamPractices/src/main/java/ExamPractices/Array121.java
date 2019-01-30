package ExamPractices;

class Array121 {
	public static void main(String[] args) {
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

	public static int is121Array(int[] a) {
		if (a.length <= 3 || a[0] != 1 || a[a.length-1] != 1) {
			return 0;
		}

		int i, j=0;
		boolean flag = false;
		for (i=0, j=a.length; i<a.length && j>=0 && i<=j; i++, j--) {
			if(a[i] != 1 && a[j] != 1) {
				flag = true;
				break;
			}
		}

		for (int index=i; index<=j; index++) {
			if (a[index] != 2) {
				return 0;
			}
		}

		if (flag) return 1;
		return 0;
	}
}