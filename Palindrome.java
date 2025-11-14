package dsa1;

public class Palindrome {

	public static void main(String[] args) {
		/**
		 * input = madam
		 * output = yes
		 */
		
		String input = "dad";
		boolean output = isPalindrome(input);
		
		System.out.println(output);
	}

	private static boolean isPalindrome(String input) {
		
		String reversedStr = reverse(input);
		if(input.equals("") || input.length()==1)
			return false;
		
		if(input.equalsIgnoreCase(reversedStr))
			return true;
		
		return false;
	}
	
	private static String reverse(String input) {
		char[] chars = input.toCharArray();
		int len = chars.length;
		StringBuilder reversedStr = new StringBuilder();
		
		if(input.equals("") || len==1)
			return input;
		
		for(int i=len-1;i>=0;i--) 
			reversedStr= reversedStr.append(chars[i]);
		
		return reversedStr.toString();
	}

}
