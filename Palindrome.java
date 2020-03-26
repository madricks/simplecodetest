package com.achmadricky.simplecodetest;

public class Palindrome {

	public static void main(String []args){
		
		String word = "mom";
		
        boolean isPalindrome = isItPalindrome(word);
        
        System.out.println("The word '" + word + "' is " + (isPalindrome ? "palindrome" : "not palindrome"));
    }
	
	public static boolean isItPalindrome(String word) {
		
		String reverseWord = "";
		int wordLength = word.length();

		for (int i = wordLength - 1; i >= 0; i--) {
			reverseWord = reverseWord + word.charAt(i);
		}
		
		return reverseWord.equalsIgnoreCase(word);
	}
}
