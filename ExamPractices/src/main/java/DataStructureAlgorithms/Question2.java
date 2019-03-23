package DataStructureAlgorithms;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32}));
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(is235Array(new int[]{7, 11, 77, 49}));
        System.out.println(is235Array(new int[]{2}));
        System.out.println(is235Array(new int[]{}));
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
    }

    static int is235Array(int[] a) {
        int[] arr = a;
        int countDivisibleBy2 = 0;
        int countDivisibleBy3 = 0;
        int countDivisibleBy5 = 0;

        int countNotDivisible = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 || arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                if (arr[i] % 2 == 0)
                    countDivisibleBy2++;
                if (arr[i] % 3 == 0)
                    countDivisibleBy3++;
                if (arr[i] % 5 == 0)
                    countDivisibleBy5++;
            } else {
                countNotDivisible++;
            }
        }

        int totalCountDivisible = countDivisibleBy2 + countDivisibleBy3 + countDivisibleBy5 + countNotDivisible;
        if (totalCountDivisible == arr.length)
            return 1;
        return 0;
    }
}
