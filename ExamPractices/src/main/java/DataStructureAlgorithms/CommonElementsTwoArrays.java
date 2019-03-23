/*
Write a function to return an array containing all elements common
to two given arrays containing distinct positive integers.

You should not use any inbuilt methods.

You are allowed to use any number of arrays.

The signature of the function is: int[] fun(int[] first, int[] second)

Examples:
=========

if input parameters are:      return

{1, 8, 3, 2}, {4, 2, 6, 1} -> {1, 2}
{1, 8, 3, 2, 6}, {2, 6, 1} -> {2, 6, 1}
{1, 3, 7, 9}, {7, 1, 9, 3} -> {1, 3, 7, 9}
{1, 2}, {3, 4}             -> {}
{}, {1, 2, 3}              -> {}
{1, 2}, {}                 -> {}
{1, 2}, null               -> null
null, {}                   -> null
null, null                 -> null
*/

package DataStructureAlgorithms;
import java.util.*;

public class CommonElementsTwoArrays {
	public static void main(String[] args) {
		System.out.println(fun(new int[]{1, 8, 3, 2}, new int[] {4, 2, 6, 1}));
		System.out.println(fun(new int[] {1, 8, 3, 2, 6}, new int[] {2, 6, 1}));
		System.out.println(fun(new int[] {1, 3, 7, 9}, new int[] {7, 1, 9, 3}));
		System.out.println(fun(new int[] {1, 2}, new int[] {3, 4}));
		System.out.println(fun(new int[] {}, new int[] {1, 2, 3}));
		System.out.println(fun(new int[] {1, 2}, new int[] {}));
		System.out.println(fun(new int[] {1, 2}, null));
		System.out.println(fun(null, new int[] {}));
		System.out.println(fun(null, null));
	}

	static String fun(int[] first, int[] second) {
		if (first == null || second == null) return null;
		int[] tempArr = new int[first.length];
		int len = 0;
		int idx = 0;

		for (int i=0; i<first.length; i++) {
			for (int j=0; j<second.length; j++) {
				if (first[i] == second[j]) {
					len++;
					tempArr[idx] = first[i];
					idx += 1;
				}
			}
		}

		int[] result = new int[len];

		for (int i=0; i<len; i++) {
			result[i] = tempArr[i];
		}

		return Arrays.toString(result);
	}
}