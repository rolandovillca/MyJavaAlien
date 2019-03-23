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
