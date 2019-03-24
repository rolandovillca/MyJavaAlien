/**
 * A number we n may call Happy Prime if "n is called prime happy
 * if there is at least one prime less than n and the sum of all
 * primes less than n is evenly divisible by n."
 * 
 * For example:
 * 
 * 25 is Happy Prime because 2, 3, 5, 7, 11, 13, 17, 19, 23
 * are the primes less than 25, their sum is 100 and 25 evenly divides 100
 */

package DataStructureAlgorithms;

public class Question3 {
    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(2));
    }

    static int isPrimeHappy(int n) {
        int myNum = n;
        int sum = 0;
        int baseNumber = 2;
        boolean switchPrime = false;

        while (baseNumber < myNum) {
            if (isPrime(baseNumber)) {
                switchPrime = true;
                sum += baseNumber;
            }
            baseNumber++;
        }
        if (switchPrime && sum % myNum == 0)
            return 1;
        else
            return 0;
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return num > 0;
    }
}
