package Strings;

public class makeVaidPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "race";
		System.out.println(find(s));

	}

	static String find(String s) {
		String ValidPal = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			String Reverse = s.substring(i);
       String ReverseString = ReverseAString.StringReverse(Reverse);
       ValidPal=ReverseString+s;
      if(CheckPalindromeOrNot.CheckPalOrNot(ValidPal)) {
    	  return ValidPal;
      }

		}
		return ValidPal;
	}

}
