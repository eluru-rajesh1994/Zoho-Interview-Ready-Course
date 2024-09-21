package Strings;

public class MakeValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "race";
		System.out.println(makeValidPalindrom(s));
	}

	static String makeValidPalindrom(String s) {
		if (CheckPalindromeOrNot(s)) {
			return s;
		}
		String finalString = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			String sub = s.substring(i);
			String rev = StringReverse(sub);
			finalString = rev + s;
			if (CheckPalindromeOrNot(finalString)) {
				return finalString;
			}
		}

		return finalString;
	}

	static String StringReverse(String s) {
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		return s1;
	}

	static boolean CheckPalindromeOrNot(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
