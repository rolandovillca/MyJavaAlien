package com.company;

public class Question1 {
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

    static int is121Array(int[] a) {
        int[] arr = a;

        if (arr.length <= 2) return 0;
        if (arr[0] != 1) return 0;
        if (arr[arr.length - 1] != 1) return 0;

        int i, j;
        boolean twoImparFlag = false;

        for (i = 0, j = arr.length - 1; i < arr.length && j >= 0 && i <= j; i++, j--) {
            if (arr[i] != 1 || arr[j] != 1) {
                if (arr[i] != 2 || arr[j] != 2) {
                    return 0;}
                else {
                    twoImparFlag = true;
                    break;
                }
            }
        }

        for (int index = i; index <= j; index++) {
            if (arr[index] != 2)
                return 0;
        }

        if (twoImparFlag) return 1;
        return 0;
    }
}
