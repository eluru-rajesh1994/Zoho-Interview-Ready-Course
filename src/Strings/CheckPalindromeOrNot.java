package Strings;

public class CheckPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bbccbb";
		boolean output=CheckPalOrNot(s);
		System.out.println(output);

	}
	static boolean CheckPalOrNot(String s) {
		int start=0;
		int end=s.length()-1;
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
			
		}
		return true;
	}

}
