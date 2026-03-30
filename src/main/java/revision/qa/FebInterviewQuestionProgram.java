package revision.qa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FebInterviewQuestionProgram {
	
	
	
	/**
	 * d 1. reverse the String -- 
	 * d 2. reverse the word 
	 * d 3. reverse String with
	 * First Word is Capital 
	 * d 4. remove the duplicate in given string like input
	 * =khillan and output=khilan 
	 * d 5. give me the duplicate character in given
	 * String : input =khillan and output l 
	 * d 6. give the length of String without
	 * using inbuilt functions 
	 * d 7. give me the length of array without using
	 * inbuilt functions 
	 * d 8. give me the second largest element in the given array
	 * d 9. give me the largest element in the array 
	 * d 10. anagram string input
	 * listen , silent 
	 * d 11. give me the occurrence of character 
	 * d 12. String
	 * manipulation like String s=your order code is 918123 give me the static value
	 * d 13. give me the index of 3rd i in given string ;i am khillan and working
	 * fine 
	 * d 14. given string is palindrom String 
	 * d 15. write the program for fibnocchi series 
	 * d 16 write the program for prime number , given number is
	 * prime or not 
	 * d 17. give me the only string in given string s="khilan22dsin"
	 * d 18. write the program for given array where you need to find the unique element 
	 * 19. broken links 
	 * 20. google search 
	 * 21. get window handles 
	 * 22. get option using the select class. 
	 * 23. remove the zero from start 
	 * 24. push zero at the end 
	 * d 25. sort the array using the bubble sort 
	 * d 26. find the Unique element in given arrays
	 * 27 . common elements between two arrays 
	 * 28. Handle nullPointerEx safely
	 * 29. Custom Exception
	 * 30. Immutable class
	 * 31. frequence using the hashmap
	 * 32. Sort Hashmap by values
	 * 33. Comparable Example
	 * 34. Detect Cycle in Arrays
	 * 35. Find the duplicate element in arrayLIst
	 * 36. Remove Special Characters from String
	 * 37. Thread-safe Singleton
	 * 38. Find the missing number.
	 * 39. Sort Arrays without sort() function
	 * 40 find the smallest & largest elemnt in the arrays
	 * 41. Reverse an integer
	 * 42. check prime number and fib 
	 * 43. swap two numbers without any thirdayparty
	 * 44. Balance string ( [[])[]}
	 * 45.DAG & treasure Hunt
	 * 46.Longest Substring Without Repeating Characters
	 * 47.Longest common subsequence 
	 * 48.
	 */

public static String reverseString(String s) {
	StringBuilder sb=new StringBuilder(s);
	
	return new String(sb.reverse().append(" "));
	
}
public static String reverseWithBuiltFunction(String s) {
	
	char[] ch=s.toCharArray();
	int right=ch.length-1;
	
	
	String rev="";
	for(int i=right;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	
	return rev;
	}
//reverse the each character of the word without changing the sequence

public static String reverseStringWordCharacter(String s ) {
	
	String revWord="";
	for(String word: s.split(" ")) {
		
		revWord=revWord+reverseWithBuiltFunction(word)+" ";
	}
	return revWord;
	
}
//reverse the String word only
public static String reverseStringWord(String s) {
	
	String word[]= s.split(" ");
	
	String revWord="";
	for(int i=word.length-1;i>=0;i--) {
		revWord=revWord+word[i]+" ";
	}
	return revWord;
}
public static int wordCount(String s) {
	int count=0;
	for(String word: s.split(" ")) {
		if(word!=" ") {
		count++
		;}
	}
	return count;
}
public static String reverseStringwordCharacter(String s) {
	
	String words[]=s.split(" ");
	String rev="";
	
	for(int i=words.length-1;i>=0;i--) {
		
		if(words[i]!=" ") {
			
			rev=rev+reverseWithBuiltFunction(words[i])+" ";
		}
	}
	return rev;
}

public static boolean isPalindromString(String s) {
	
	String org=s;
	String rev="";
	
	rev=rev+reverseWithBuiltFunction(s);
	
	if(org.equals(rev)) {
		return true;
	}
	else return false;
	
}

public static String longestsubString(String []s) {
	
	// String s[]={"flower","flight","flow"}; //fl

	Arrays.sort(s);
	String first=s[0];
	String last=s[s.length-1];
	
	
	int i=0;
	int len=Math.min(first.length(), last.length());
	String str="";
	while(i<len && first.charAt(i)==last.charAt(i)) {
		i++;
		str=first.substring(0,i);
	}
	return str;
}
public static void longestSubstringWithoutRepeatingCharacters(String s) {
	String ss="abcabcbb";
	Map<Character,Integer> map=new HashMap<>();
	
	
	
	
}
	public static void main(String[] args) {
		
		//String sb="khillan is unique person in this world";
		//String sb="khillan"; //madam ,level
		String s[]={"flower","flight","flow"};
		System.out.println(longestsubString(s));
	}
}
