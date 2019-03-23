package DataStructureAlgorithms;

class SplitAndReverseSubstrings {

	public static void main(String[] args) {
		System.out.println(reverse("My name is Rolando"));
		System.out.println(reverse("My  name    is    Rolando"));
		System.out.println(reverse("MyString"));
	}

	static String reverse(String str) {
		String tmp = "";
		String tmpRev = "";
		String rev = "";

		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i) == ' ' || i == str.length()-1) {
				for (int j=tmp.length()-1; j>=0; j--) {
					tmpRev = tmpRev + tmp.charAt(j);
				}
				rev = rev + tmpRev + " ";
				tmpRev = "";
				tmp = "";
			} else {
				tmp = tmp + str.charAt(i);
			}
		}
		return rev;
	}
}