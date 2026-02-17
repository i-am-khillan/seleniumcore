package revision.qa;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class PrepQuestions {

//	public static void main(String[] args) {

//		String s="({}()[])";
//		System.out.println(balanceString(s));
//		
	
//		swapNumber(10,20);
		
		//System.out.println(reverseInt(8769));
		//System.out.println(sumOfInput());
	//	int a[]= {1,2,3,4,5,7};
	//	System.out.println(missingNumber(a));
//		printArray(a);
//		System.out.println("---------");
//		sortArray(a);
//		System.out.println("---------");
//		printArray(a);
		
	//	int a[]= {6,8,3,4,5,7};
		//System.out.println(smallElement(a));
		//System.out.println(largestElement(a));
	//	System.out.println(secondLargestElement(a));
	//	fib(5);
		
//		System.out.println(reverseStringFirstLetterCap("king"));
//		System.out.println(reverseString("king"));
//		System.out.println(reverseWord("singh is king"));
//		System.out.println(reverseCharacterKeeptheOrder("singh is king"));
//		System.out.println(reverseCharacterAndWord("singh is king"));
		
		//System.out.println("khillan");
		//System.out.println(removeDuplicateWithCollection("sandeep"));
	//	System.out.println(getDuplicateCharacterWithOutCollections("sandeep"));
		
	//	System.out.println(isAnagram("gins","king")); //silent ,listen
		//charOccurrenceWithOutCollectionAPProach1("sandeep");
	//}
	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int aa:a) {
			System.out.print(aa+" ,");
		}
	}
	public static int missingNumber(int arr[]) {
				int sum=0;
		for(int a:arr) {
			sum=sum+a;
		}
		int n=arr.length+1;
	int  sumOfN =n *(n+1)/2;
		
		return sumOfN-sum;
	}
	public static boolean balanceString(String s) {
		Stack<Character> stack=new Stack<>();
		
		for(char ch: s.toCharArray()) {
			
			if(stack.empty()) {
				stack.push(ch);
			}
			else if(ch=='(' ||ch=='['||ch=='{') {
				stack.push(ch);
			}
			else if(ch==')'&& stack.peek()=='(' ||ch==']'&& stack.peek()=='['  ||ch=='}'&& stack.peek()=='{' ) { 
				//stack.peek()--- get the peek element :Looks at the object at the top of this stack without removing it from the stack.
				stack.pop();// out from the stack :Removes the object at the top of this stack and returns that object as the value of this function.
			}	
		}
		
		if(stack.empty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void swapNumber(int a ,int b) {
		
		System.out.println("Number before swap : "+"a="+a+", b="+b);
		a=a+b;
		b=a-b;
		a=a-b;	
		System.out.println("Number after swap : "+"a="+a+", b="+b);
	}

	public static String reverseInt(int n) {
		String rev="";int count=0;
		while(n >0) {
		rev=rev+n%10;
		n=n/10;
		//count++;
		}
		return rev;
	}
	
	public static int sumOfInput() {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number 1");
		int num1=scan.nextInt();
		
		System.out.println("Enter the number 2");
		int num2=scan.nextInt();
		int sum=0;
		if(num1 >0 && num2 >0) {
			sum=num1+num2;
		}
		else {
			System.out.println("Please enter whole number");
		}
		scan.close();
		return sum;
	}
	
	public static void sortArray(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	public static int smallElement(int arr[]) {
		int smallest=arr[0];
		for(int a:arr) {
			if(a<smallest) {
				smallest=a;
			}
		}
		return smallest;
	}
	public static int largestElement(int arr[]) {
		int largest=0;
		for(int a:arr) {
			if(a>largest) {
				largest=a;
			}
		}
		return largest;
	}
	public static int secondLargestElement(int arr[]) {
		int max=arr[0];
		int secMax=arr[1];
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
	public static void fib(int n) {
		int n1=0;
		int n2=1;
		int sum=0;
		
		System.out.print(n1 +","+n2+",");
		for(int i=2;i<=n;i++) {
		sum=n1+n2;
		System.out.print(sum+",");
		
		n1=n2;
		n2=sum;
		}
	}
	public static String reverseString(String a) {
		String rev="";
		char as[]=a.toCharArray();
		for(int i=as.length-1;i>=0;i--) {
			rev=rev+as[i];
		}
		return rev;
	}
	public static String reverseStringFirstLetterCap(String s) {
		//String rev="";
		s=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
		return	reverseString(s);
	}
	public static String reverseWord(String s) {
		String ss[]=s.split(" ");
		String revWord="";
		for(int a=ss.length-1;a>=0;a--) {
			revWord=revWord+ss[a]+" ";
		}
		return revWord;
	}
	public static String reverseCharacterAndWord(String s) {
	return reverseString(reverseWord(s));
	}
	public static String reverseCharacterKeeptheOrder(String s) {
		String ss[]=s.split(" ");
		String revWord="";
		for(String word :ss) {
			revWord=revWord+reverseString(word)+" ";
		}
		return revWord;
	}
	public static String removeDuplicate(String a) {
		Map<Character ,Integer> map=new LinkedHashMap<>();
		for(char ch:a.toCharArray()) {
			if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		String removeDuplicate="";
		//char ch=' ';
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				removeDuplicate=removeDuplicate+String.valueOf(entry.getKey());
			}
		}
			return removeDuplicate;
	}
	public static String removeDuplicateWithSet(String a) {
			Set<Character> set=new LinkedHashSet<>();
			
			String removeDuplicate="";
			for(char ch:a.toCharArray()) {
				
				if(set.add(ch)) {
					removeDuplicate=removeDuplicate+String.valueOf(ch);
				}
			}
				return removeDuplicate;
		}
	public static String removeDuplicateWithCollection(String s) {
		String removeDuplicate="";
		boolean[] seen=new boolean[256];
		
		for(char ch:s.toCharArray()) {
			
			if(!seen[ch]) {
				seen[ch]=true;
				removeDuplicate=removeDuplicate+String.valueOf(ch);
			}
		}
		return removeDuplicate;
	}
	public static String getDuplicateCharacterWithOutCollections(String s) {
		String removeDuplicate="";
		boolean[] seen=new boolean[256];
		
		for(char ch:s.toCharArray()) {
			
			if(!seen[ch]) {
				seen[ch]=true;
				//removeDuplicate=removeDuplicate+String.valueOf(ch);
			}
			else {
				removeDuplicate=removeDuplicate+String.valueOf(ch);
			}
		}
		return removeDuplicate;
	}
	public static boolean isAnagram(String s1,String s2) {
		char []ch1=s1.toCharArray();
		char []ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
		
	}
	public static void charOccurrenceWithOutCollection(String s) {
				
		if(s==null)return;
		
		boolean seen[]=new boolean[256];
		int [] freq=new int[256];

		for(char ch: s.toCharArray()) {
			freq[ch]++;
			}
		for(char ch: s.toCharArray()) {
		
			if(!seen[ch]) {
			System.out.println(ch +"=="+freq[ch]);
			seen[ch]=true;
			}
		}
	}
	public static void charOccurrenceWithOutCollectionAPProach1(String s)
	{
		
		if(s==null)return;
		
	//	boolean seen[]=new boolean[256];
		int [] freq=new int[256];
		for(char ch: s.toCharArray()) {
			freq[ch]++;
			System.out.println(ch +"=="+freq[ch]);
			
			}
	}
	public static void getOrderId(String a) {
		
		//String s="your order code is 918123! this is ";
		//output : 918123
		System.out.println(a.substring(a.indexOf("is")+3,a.length()));
		
		System.out.println(a.substring(a.indexOf("is")+3, a.indexOf("!")));
		
		
		String str="this is khillan verma";
		getOccurrenceOf3I(str);
		
		System.out.println("----------------------");
		String ss="khillan1234verma!";
		regularExpression(ss);
	}
	public static void getOccurrenceOf3I(String s) {
		int firstOccurrence=s.indexOf("i");
		System.out.println("First Occurrence :"+firstOccurrence);
		int secondoccurrence=(s.indexOf("i",firstOccurrence+1));
		System.out.println("Second Occurrence :"+secondoccurrence);
		int thirdOccurrence=s.indexOf("i",secondoccurrence+1);
		System.out.println("Third Occurrence  :"+thirdOccurrence);		
	}
	public static void regularExpression(String s) {
	System.out.println(s.replaceAll("[^0-9]", ""));//only numerice;// 1234
	System.out.println(s.replaceAll("[^a-zA-Z]", ""));// only alphabet
	System.out.println(s.replaceAll("[a-zA-Z0-9]", ""));//special Char
	
	System.out.println(s.replaceAll("[a-zA-Z0-9]", ""));//special Char
	
	System.out.println("-------------------------------");
	int ar[]= {1,0,2,0,4,0,9,0,9};
	printArray(ar);
	int arrs[]=moveZeroAtEnd(ar);
	System.out.println("-------------------------------");
	printArray(arrs);
	
	System.out.println("-------------------------------");
	String ss="000012230";
	int num=removeZeroFromStart(ss);
	System.out.println(num);
	System.out.println("-------------------------------");
	
	String strs=removeZeroFromStartWithFunctions(ss);
	System.out.println(strs);
	}
	public static int removeZeroFromStart(String s) {
		return Integer.valueOf(s);
	}
	public static String removeZeroFromStartWithFunctions(String s) {
		int i=0;
		while(i<s.length() && s.charAt(i)=='0') {
			i++;
		}
		
		return s.substring(i);
	}
	public static int[] moveZeroAtEnd(int arr[]) {
		
		int newArr[]=new int[arr.length];
		int i=0;
		for(int a:arr) {
			if(a>0) {
				newArr[i++]=a;
			}
		}
		while(i<arr.length) {
			newArr[i++]=0;
		}
		return newArr;
	}
	
	public static void uniqueElementsInArray(int arr[]) {
		int ar[]= {1,3,9,0,1,3};
	//	boolean[] seen=new boolean[256];
		int i[]=new int[256];// assume number range 0-255
		
		for(int a:arr) {
			i[a]++;
		}
		for(int aa:arr) {
			if(i[aa]==1) {
				System.out.println(aa);
			}
		}
		
		
	}
	
	public static int duplicateElement(int arr[]) {

		
		// int arr[]={1,3,4,5,1,2,3,4,5};
		//output : 2 (unique element)
		int result=0;
		for(int a: arr) {
			result=result^a;
		}
		System.out.println("-----------");
		
		//printArray(arr);
		return result;
	}
	public static String longestSubstring(String[] s) {
		/**
		 * Input: strs = ["flower","flow","flight"] Output: "fl"
		 * 
		 * 
		 */
		Arrays.sort(s);
		String first = s[0];
		String last = s[s.length - 1];

		int i = 0;
		int len = Math.min(first.length(), last.length());
		while (i < len && first.charAt(i) == last.charAt(i))
			i++;
		return first.substring(0, i);
	}
	public static void main(String[] args) {
		String s="your order code is 918123! this is your success id";
		//getOrderId(s);
		int ar[]= {1,3,5,1,3,9,6};
		uniqueElementsInArray(ar);
		System.out.println(duplicateElement(ar));
		String []arrays= {"flower","flight","flow"};
		System.out.println(longestSubstring(arrays));
	}
	
}

//https://app.box.com/notes/1380968082445?s=z1jscs402bmqadljajx0fmidnij8s6cd

//https://app.box.com/folder/238444602043
//https://app.box.com/file/1516555809225  --currently working on it
//https://app.box.com/file/1484672523786

//https://www.udemy.com/home/my-courses/learning/
//https://www.udemy.com/course/rest-api-automation-testing-rest-assured/learn/lecture/41553154#overview

//https://www.youtube.com/watch?v=hlGoQC332VM  --data base 
/**
 *  1. reverse the String -- 
 *  2. reverse the word 
 *  3. reverse String with First Word is Capital 
 *  4. remove the duplicate in given string like input =khillan and output=khilan 
 *  5. give me the duplicate character in given String : input =khillan and output l 
 * 	6. give the length of String without using inbuilt functions 
 *  7. give me the length of array without using inbuilt functions 
 * 	8. give me the second largest element in the given array
 * 	9. give me the largest element in the array 
 * 10. anagram string input  listen , silent 
 * 11. give me the occurrence of character 
 * 12. String manipulation like String s=your order code is 918123 give me the static value
 * d 13. give me the index of 3rd i in given string ;i am khillan and working
 * fine 
 * d 14. given string is palindrom String 
 * d 15. write the program for fibnocchi series 
 * d 16 write the program for prime number , given number is prime or not 
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
 * 41.d Reverse an integer
 * 42.d check prime number and fib 
 * 43.d swap two numbers without any third 
 * 44.d Balance string ( [[])[]}
 * 45.
 * 
 * 
 */

