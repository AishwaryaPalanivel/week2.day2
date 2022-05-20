package week2.day2.assignment1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 *Declare a String 
			String text1 = "stops";
//		 *Declare another String
			String text2 = "potss"; 
//			a) Check length of the strings are same then (Use A Condition)
			if (text1.length() == text2.length()) {
//				b) Convert both Strings in to characters
				char[] charArray1 = text1.toCharArray();
				char[] charArray2 = text2.toCharArray();
				Arrays.sort(charArray1);
				Arrays.sort(charArray2);
			    if(Arrays.equals(charArray1, charArray2)) {
					System.out.println("Given input is a anagram");
				} 
				else {
					System.out.println("Given input is not a anagram");
				}
		 }
	}
}
