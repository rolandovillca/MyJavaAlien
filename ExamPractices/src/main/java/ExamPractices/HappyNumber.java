public class HappyNumber {

	//1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100

	public static void main(String[] args) {
		for (int i=1; i<100; i++) {
			boolean res = isHappyNumber(i);
			if (res) {
				System.out.println(i + " is = " + isHappyNumber(i));
			}
		}
	}

	static boolean isHappyNumber(int n){
		int myNum = n;
		int happyNumber = n;
		while (happyNumber != 1) {
			int tmp = happyNumber;
			int aux = 0;
			happyNumber = 0;
			while (tmp != 0) {
				aux = tmp % 10;
				happyNumber = happyNumber + aux*aux;
				tmp = tmp / 10;
			}
			if (happyNumber == 4) return false;
		}
		return true;
	}
}
