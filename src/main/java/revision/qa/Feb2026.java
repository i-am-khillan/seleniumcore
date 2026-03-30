package revision.qa;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Feb2026 {

	/**
	 * d 1. reverse the String -- 
	 * d 2. reverse the word 
	 * d 3. reverse String with First Word is Capital 
	 * d 4. remove the duplicate in given string like input =khillan and output=khilan 
	 * d 5. give me the duplicate character in given String : input =khillan and output l 
	 * d 6. give the length of String without using inbuilt functions 
	 * d 7. give me the length of array without using inbuilt functions 
	 * d 8. give me the second largest element in the given array
	 * d 9. give me the largest element in the array 
	 * d 10. anagram string input listen , silent 
	 * d 11. give me the occurrence of character 
	 * d 12. String  manipulation like String s=your order code is 918123 give me the static value
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
	 *d 41. Reverse an integer  -
	 * 42. check prime number and fib 
	 * 43. swap two numbers without any thirdayparty
	 * 44. Balance string ( [[])[]}
	 * 45.DAG & treasure Hunt
	 * 46.Longest Substring Without Repeating Characters
	 * 47.Longest common subsequence 
	 * 48.
	 */
	
	public static int stringLength(String s) {
		int count=0;
		for(char c: s.toCharArray()) {
			count++;
		}
	
		return count;
	}
	 //1. reverse the String --
	public static String reverseString(String s) {

		char ch[]=s.toCharArray();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		return rev;
	}
	//	1. reverse the integer --
	public static String reverseInteger(int a) {
		String rev="";
		while(a>0) {
			rev=rev+a%10;
			a=a/10;
		}
		return rev;
	}
	 //1.reverse String Character Without Change Sequence of word
	public static String reverseStringCharacterWithChangeSequence(String word) {
		String []words=word.split(" ");
		String rev="";
		for(String w:words) {
			rev=rev+reverseString(w)+" ";
		}
		return rev;
	}
	//reverse String word only
	public static String reverseWord(String s) {
		String []words=s.split(" ");
		String rev="";
		for(int i=words.length-1;i>=0;i--) {
			rev=rev+words[i]+" ";
		}
		return rev;
	}
//1 reverse String with First Word is Capital 
	public static String reverseStringWithFirstWordIsCapital(String s) {
		String rev="";
		String word[]=s.split(" ");
	
		for(String ss:word) {
			ss=ss.substring(0,1).toUpperCase()+ss.substring(1).toLowerCase();
			rev=rev+reverseString(ss)+" ";
		}
		return rev;
	}
	//remove duplicate 
	public static String removeDuplicate(String s) {
		Set<Character> set=new LinkedHashSet<>();
		String remove="";
		
		for(char ch:s.toCharArray()) {
			if(set.add(ch)) {
				remove=remove+ch+"";
			}
		}
		return remove;
	}
	//give me duplicate 
	public static String getDuplicate(String s) {
		Set<Character> set=new LinkedHashSet<>();
		String getDuplicate="";
		for(char ch:s.toCharArray()) {
			if(!set.add(ch)) {
				getDuplicate=getDuplicate+ch+"";
			}
		}
	return getDuplicate;
	}
	
	// d 8. give me the second largest element in the given array

	public static int secondLargestElement(int arr[]) {
		int max=0;
		int secMax=max;
		for(int a:arr) {
			if(a>max) {
				secMax=max;
				max=a;
			}
			else if(a!=max && a>secMax) {
				secMax=a;
			}
		}
		return secMax;
	}
	// largest element in the array
	public static int largestElementArray(int arr[]) {
		int max=0;
		for(int a: arr) {
			if(a>max) {
				max=a;
			}
		}
		return max;
	}
	public static int smallestElement(int arr[]) {
		int small=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] <small) {
				small=arr[i];
			}
		}
		return small;
	}
	//occurrence of character and 
	public static void occurrenceOfCharacter(String s) {
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char ch: s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet() ) {
		
			if(entry.getValue()>=1) {
				System.out.println(entry.getKey()+"=="+entry.getValue());
			}
		}
	}
	
	//First duplicate occurrences
	public static void firstOccurrenceOfCharacter(String s) {
		Map<Character ,Integer> map=new LinkedHashMap<>();
	
		for(char ch : s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}	
		}
	
	for(Map.Entry<Character,Integer> entry:map.entrySet()) {
		if(entry.getValue() >1 && entry.getKey()!=' ') {
			System.out.println(entry.getKey());
			break;
		}
		
	}
		
	}
	// remove the zero from the start
	public static String removeZeroFromStart(String s) {
		
		int i=0;
		int feq[]=new int[256];
		
		while(i<s.length() && s.charAt(i)=='0') {
			i++;
		}
		return s.substring(i);
	}
	
	//push zero at the end or move zero at the end
	public static int [] pushZeroAtEnd(int arr[]) {
		
		int arrOr[]=new int[arr.length];
		int i=0;
		for(int a:arr) {
			if(a>0) {
				arrOr[i++]=a;
			}
		}
		
		while(i<arr.length) {
			arrOr[i++]=0;
		}
		
	//	printElement(arr);

		return arrOr;
	}
	//print all element in array
	private static void printElement(int[] arr) {
		// TODO Auto-generated method stub
		for(int i:arr) {
			System.out.print(i+",");
		}
	}
	 // d 12. String  manipulation like String s=your order code is 918123 give me the static value
			// * d 13. give me the index of 3rd i in given string ;i am khillan and working
	
	public static String staticCodeInGivenString(String s) {
		
		return s.substring(s.indexOf("is")+2,s.indexOf("!"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="your order code is 9181230! this is khillan";
		System.out.println(staticCodeInGivenString(st));
		int ar[]= {1,2,0,9,0,4,0};
		printElement(ar);
		System.out.println("---------");
		int arrNew[]=pushZeroAtEnd(ar);
		printElement(arrNew);
		
		String str="00012321230";
	System.out.println(removeZeroFromStart(str));
		
		String s="khillannak";
		//System.out.println(getDuplicate(s));
		int arr[]= {1,203,90,8};
	//	System.out.println(smallestElement(arr));
		int i=1234;
		//System.out.println(reverseInteger(i));
	}

}
