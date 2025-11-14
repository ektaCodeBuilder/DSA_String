package dsa1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		/**
		 * input - Missisipi
		 * output - ipisissiM
		 */
		
		String input = "ipisissiM";
		String output = reverse(input);
		String outputSB = reverseUsinSB(input);
		String outputSBuffer = reverseUsinSBuffer(input);
		String outputLambda = reverseUsingLambda(input);
		
		System.out.println(output);
		System.out.println(outputSB);
		System.out.println(outputSBuffer);
		System.out.println(outputLambda);
	}
	
	public static String reverse(String input) {
		char[] chars = input.toCharArray();
		int len = chars.length;
		StringBuilder reversedStr = new StringBuilder();
		
		if(input.equals("") || len==1)
			return input;
		
		for(int i=len-1;i>=0;i--) 
			reversedStr= reversedStr.append(chars[i]);
		
		return reversedStr.toString();
	}
	
	private static String reverseUsingLambda(String input) {
		return Stream.of(input).map(word->new StringBuilder(word).reverse().toString()).collect(Collectors.joining());
	}
	
	private static String reverseUsinSB(String input) {
		return new StringBuilder(input).reverse().toString();
	}
	
	private static String reverseUsinSBuffer(String input) {
		return new StringBuffer(input).reverse().toString();
	}
}
