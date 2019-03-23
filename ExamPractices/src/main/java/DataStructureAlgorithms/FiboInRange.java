package DataStructureAlgorithms;

class FiboInRange {
	public static void main(String[] args) {
		runFibo(3, 8);
	}

	static void runFibo(int startNum, int endNum) {
		if (startNum - endNum == 0) {
			System.out.println("Wrong!!!");
			return;
		}

		int aux = 0;
		int prevNum = startNum;
		int nextNum = startNum + 1;

		System.out.println(prevNum);
		System.out.println(nextNum);

		for (int i=startNum+1; i<=endNum; i++) {
			aux = prevNum + nextNum;
			System.out.println(aux);
			prevNum = nextNum;
			nextNum = aux;
		}
	}
}