package ExamPractices;

public class PointOfEquilibrium {

    public static void main(String[] args) {
        PointOfEquilibrium m = new PointOfEquilibrium();
        int x = m.getEquilibrium(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1});
        System.out.println(x);
    }

    public int getEquilibrium(int[] A) {
        long[] sums = generateSums(A);
        long lowSum = 0L;
        int res = -1;
        for (int i = 0; i < A.length; i++) {
            if (lowSum == sums[i+1]) {
                res = i;
                break;
            }
            lowSum += A[i];
        }
        return res;
    }

    public long[] generateSums(int[] A) {
        long[] res = new long[A.length+1];
        for (int i = A.length-1; i >= 0; i--) {
            res[i] = i+1 == A.length ? A[i] : res[i+1]+A[i];
        }
        return res;
    }
}
