package Strings;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="srinu";
		String output=StringReverse(s);
		System.out.println(output);

	}
	static String StringReverse(String s) {
		String s1="";
		for (int i = s.length()-1; i >=0; i--) {
			s1=s1+s.charAt(i);
		}
		return s1;
	}

}
