package revision.qa;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb232026 {

	public static void SwapString(String s1, String s2) {
		//s1=khillan
		//s2=verma
		System.out.println(s1+"==="+s2);
		System.out.println("==============");
		s1=s1+s2;//khillanverma
		
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1+"==="+s2);
		
	}
	public static void printArray(int arr[]) {
		for(int i:arr) {
			System.out.print(i+" ,");
		}
		
	}
	public static int[] pushZeroAtEnd(int arr[]) {
		
		int org[]=new int[arr.length];
		int i=0;
		for(int a:arr) {
			if(a>0) {
			org[i++]=a;
			}
		}
		
		  while(i<arr.length) { 
			  org[i++]=0; 
		  }
		 	return org;
	}
	public static void primeNumber(int a) {
		
		
	}
	public static String reverseString(String s) {
		String rev="";
		
		for(int i =s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i)+"";
		}
		return rev;
	}
	public static String reverseStringWord(String s) {
		String str[]=s.split(" ");
		String rev="";
		for(String strs:str) {
			rev=rev+reverseString(strs)+" ";
		}
		return rev;
	}
	public static void fib(int n) {
		//int n=5;
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		int sum=0;
		for(int i=2;i<=n;i++) {
			sum=n1+n2;
			System.out.print(","+sum);
			n1=n2;
			n2=sum;
		}
	}
	public static void prime(int a) {
		//prime 5 --- 
		
	}
	public static String reverseStringCapital(String str) {
		String srt[]=str.split(" ");
		String rev="";
		for(String s:srt) {
		s=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
		rev=rev+reverseString(s)+" ";
		}
		return rev;
	}
	public static String swapStringTwoCharacter(String s) {
		//S="khillan",
		//out= khli
		String rev="";
		char str[]=s.toCharArray();
		for(int i=0;i+1<str.length;i+=2) {
			char t=str[i];
			str[i]=str[i+1];
			str[i+1]=t;
			
		}
		return new String(str);
	}
	
	//remove duplicate or give me duplicate character
	public static String removeDuplicatCharacterWithOut(String s) {
		
		String removeDuplicate="";
		boolean seen[]=new boolean[256];
		for(char cc: s.toCharArray()) {	
			if(!seen[cc]) {
				//seen[cc]=true;
				 removeDuplicate = removeDuplicate+String.valueOf(cc);	
				 seen[cc]=true;
			}
		}
		return removeDuplicate;
	}
	
public static String getDuplicatCharacterWithOut(String s) {
		
		String getDuplicate="";
		
		boolean seen[]=new boolean[256];
		for(char cc: s.toCharArray()) {	
			if(!seen[cc]) {		
			//	removeDuplicate = removeDuplicate+String.valueOf(cc);	
				seen[cc]=true;
			}
			else {
				getDuplicate = getDuplicate+String.valueOf(cc);	
			}
		}
		return getDuplicate;
	}
	
	public static String removeDuplicate(String s)
	{
		Set<Character> set=new LinkedHashSet<>();
		String remove="";
		for(char c: s.toCharArray()) {
			if(set.add(c)) { 
				// !set.add(c)  --- give me duplicate character from given String
				// set.add(c)  ---> remove duplicate character from given String
				remove=remove+c+"";// remove duplicate -- remove the duplicate character and print unique character
			}
			
			
		}
		
		return remove;
	}

	//Length of String and length of Array
public static int lengthOfString(String s) {
	int i=0;
	for(char c:s.toCharArray()) {
		i++;
	}
	return i;
}

//8. give me the second largest element in the given array
//9. give me the largest element in the array 

public static int largestElement(int arr[]) {

	int max=arr[0];
	
	for(int e:arr) {
		if(e>max) {
			max=e;
		}
	}
	return max;
}
public static int smallestElemnt(int arr[]) {
	int small=arr[0];
	for(int i: arr) {
		if(i<small) {
			small=i;
		}
	}
	return small;
}
public static int secondSmallestElement(int arr[]) {
	int small=Integer.MAX_VALUE;
	int secondSmall=Integer.MAX_VALUE;
	
	for(int i: arr) {
		if(i<small) {
			secondSmall=small;;
			small=i;
		}
		else if( i<=secondSmall) {
			secondSmall=i;
		}
	}
	return secondSmall;
}
public static int secondLargestElement(int arr[]) {
	
	int max=0;
	int secondMax=max;
	for(int e:arr) {
		if(e>max) {
			secondMax=max;
			max=e;
		}
		else if(e!=max && e>secondMax) {
			secondMax=e;
		}
	}
	return secondMax;
}
//d 10. anagram  input listen , silent 
public static boolean anagramString(String s1,String s2) {
	char []ch1=s1.toCharArray();
	char ch2[]=s2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	return Arrays.equals(ch1, ch2);
	
}
//11. give me the occurrence of character using Map
public static void occurrenceOfChar(String s) {
	Map<Character ,Integer> map=new LinkedHashMap<>();
	
	for(char c: s.toCharArray()) {
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}
		else {
			map.put(c, 1);
		}
	}
	for(Map.Entry<Character, Integer> entry:map.entrySet()) {
		if(entry.getKey()!=' ' ) {
			System.out.println(entry.getKey()+"=="+entry.getValue());
		}
	}
}
public static void occurreceOfCharWithOutMap(String s) {
	boolean b[]=new boolean[256];
	int feq[]=new int[256];
	StringBuilder sb=new StringBuilder();
	for(char c: s.toCharArray()) {
		 int idx=c;
		 if(idx >=256)continue;
		 feq[idx]++;
		 if(!b[c]) {
			b[c]=true;
			sb.append(c);
		}
	}
	for(int i=0;i<sb.length();i++) {
		char c=sb.charAt(i);
		System.out.println(c+"=="+feq[c]);
	}
	
	
}

// *  12. String  manipulation like String s=your order code is 918123 give me the static value
//*  13. give me the index of 3rd i in given string ;i am khillan and working fine 

public static void subStringStaticOrder(String st) {
	
	//String st="your order code is 918123 give me the";
	
	String strs=st.substring(st.indexOf("is")+3,st.indexOf("give")-1);
	System.out.println(strs);
	
	
}
public static void StringIndexOf3rdI(String st) {
	
	 int index=st.indexOf("i");
	 System.out.println(index);
	 int index2=st.indexOf("i",index+1);
	 System.out.println(index2);
	 int index3=st.indexOf("i",index2+1);
	 System.out.println(index3);
}

public static boolean palindromeString(String s) {
	
	int left=0;
	int right=s.length()-1;
	while(left<right) {
		if(s.charAt(left)!=s.charAt(right)) {
			return false;
		}
		left++;
		right--;
	}
	return true;
}
// 16 write the program for prime number , given number isprime or not 
// d 17. give me the only string in given string s="khilan22dsin"
//d 18. write the program for given array where you need to find the unique element 

public static void StringManipulations(String s) {
	
	System.out.println("automation"+System.currentTimeMillis());
	Date date=new Date();
	System.out.println(date.toString());
	String strs=date.toString();
	System.out.println(strs.substring(strs.indexOf("Feb")+4,strs.indexOf("IST")));
	System.out.println(LocalDate.now());
	
	DateTimeFormatter formate=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate todays=LocalDate.now();
	System.out.println(todays.format(formate));
	
	
}
public static void ReplaceString(String s) {
	
	String st="autpm123132@$#$!@24";
	
	System.out.println(st.replaceAll("[^a-zA-Z]", "")); //only string 
	System.out.println(st.replaceAll("[^0-9]", "")); //only number
	System.out.println(st.replaceAll("[a-zA-Z0-9]", "")); //only string 
	
	System.out.println(st.replaceAll("[a-zA-Z0-9]", "")); //only string 
	
	System.out.println(st.replaceAll("[a-zA-Z0-9]", "")); //only string 
}

public static boolean stringSubSequences(String s,String t) {
	int i=0;  //pointer for s
	int j=0; // pointer for t
	
	while(i<s.length() && j<t.length()) {
		if(s.charAt(i)==t.charAt(j)) {
			i++;//move pointer in s
		}
		j++;
	}
		return i==s.length();// true if all character present in s were matched
}
public static String logestSubString(String []s) {
	Arrays.sort(s);
	int i=0;
	String first=s[0];
	String last=s[s.length-1];
	
	int min=Math.min(first.length(), last.length());
	while(i<min &&first.charAt(i) ==last.charAt(i)) {
		i++;
	}
	return first.substring(0,i);
}
public static int uniqueElement(int []arr) {
	
	int result=0;
	for(int i:arr) {
		result^=i;
	}
	return result;
}
public static void bubbleSort(int arr[]) {
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int tem=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tem;
			}
			
		}
	}
}

//* 23. remove the zero from start 

public static String removeZeroFromStart(String s) {
	String remove="";
	int i=0;
	while(i<s.length() && s.charAt(i)=='0') {
		i++;
	}
	return s.substring(i);
	
}
//* 24. push zero at the end 
public static String pushZeroMoves(String s) {
	String ss="000013010231";
	int i=0;
	String string="";
	char ch[]=new char[s.length()];
	for(char c: s.toCharArray()) {
		if(c !='0') {
			ch[i++]=c;
		}
	}
	
	while(i<ch.length) {
		ch[i++]='0';
	}
	return new String(ch);
}

public static int[] movePushZeroElementAtEND(int []arr) {
	
	int i=0;
	int arrs[]=new int[arr.length];
	for(int num:arr) {
		if(num>0) {
			arrs[i++]=num;
		}
	}
	while(i<arrs.length) {
		arrs[i++]=0;
	}
	return arrs;
}
public static void brokenLinkSize() {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	List<WebElement> liks=driver.findElements(By.xpath("//a"));
	
	List<String> brokenLinks=new ArrayList<>();
	for(WebElement e: liks) {
		String url=e.getAttribute("href");
		
		try {
			HttpURLConnection con= (HttpURLConnection)new  URL(url).openConnection();
			con.connect();
			
			if(con.getResponseCode()==200) {
				//System.out.println("link are okay");
			}
			else {
				brokenLinks.add(url);
				//System.out.println("links are broken");
				
			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	System.out.println("brokenlinks size"+brokenLinks );
}

public static void DuplicateArrayList(ArrayList<String> a) {
	
	ArrayList<String> list = new ArrayList<>(Arrays.asList("khillan", "prem", "ram", "raman","prem"));
	String match="";
	boolean b[]=new boolean[256];
	for(String st:a) {
		if(!b[Integer.valueOf(st)]) {
			b[Integer.valueOf(st)]=true;
			match=match+st;
		}
		else {
			System.out.println(match);
		}
	}
	
}

public static void printAlphabate() {
	for(char c='a';c<='z';c++) {
		System.out.print(c+",");
	}
	
}
//Create custom exeception 
public class MyException extends RuntimeException{
	public MyException(String m){
		super(m);
	}
	
	//to call the MyException using like throw
	
}
//Find the missing number.
public static int missingNumber(int n[]) {
	int sum=0;
	int len=n.length;
	
	for(int a:n) {
		sum=sum+a;
	}
	int sumOfN=len*(len+1)/2;
	return sumOfN-sum;
	
}
public static void swapingNumber(int s1 ,int s2) {
	
	System.out.println(s1+"--"+s2);	
	System.out.println("-------");
		s1=s1+s2;
		s2=s1-s2;
		s1=s1-s2;
	System.out.println(s1+"--"+s2);		
}
String st="your order code is 918123 give me the";

public static void swapString(String s1,String s2) {
	
	System.out.println(s1+"----"+s2);
	System.out.println("-----");
	
	s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println(s1+"----"+s2);
	
}
	public static void main(String[] args) {
		
	System.out.println(removeDuplicate("khillan"));
//		String s1="khillan";
//		String s2="verma";
//		swapString(s1,s2);
//		
//		swapingNumber(10,19);
//		int[] a= {1,2,3,5};
//		System.out.println(missingNumber(a));
//		printAlphabate();
//	//	brokenLinkSize();
//		ArrayList<String> list = new ArrayList<>(Arrays.asList("khillan", "prem", "ram", "raman","prem"));
//	//	DuplicateArrayList(list);
//		int arrar[]= {1,3,0,2,0,1,0,9,2,0};
//		printArray(arrar);
//		System.out.println("-----------------");
//		int arrst[]=movePushZeroElementAtEND(arrar);
//		printArray(arrst);
//		String ss="000013010231";
//	System.out.println(pushZeroMoves(ss));
//		
//		String string="000000132130";
//		System.out.println(removeZeroFromStart(string));
//		int arr[]= {1,3,4,5,1,2,2,3,9,4,5};
//		
//		System.out.println(uniqueElement(arr));
//		
//		String []sArray = {"flo0wer","flo0w","flo0ight"};//Output: "fl"
//		System.out.println(logestSubString(sArray));
//		printArray(arr);
//	System.out.println("==============");
//		bubbleSort(arr);
//		printArray(arr);
//		String strs="121";
//		ReplaceString(strs);
//		if(palindromeString(strs)){
//			System.out.println("Palidrome String ");
//		}
//		else {
//			System.out.println("Palidrome string not");
//		}
//		
//		String st="your order code is 918123 give me the";//
//		
//		subStringStaticOrder(st);
//		String sts="this is khillan verma and working with ingenico";
//		StringIndexOf3rdI(sts);
//	
	String s="mumbai";
	//System.out.println(lengthOfString(s));
//	System.out.println(removeDuplicatCharacterWithOut(s));
	
	//System.out.println(getDuplicatCharacterWithOut(s));
		
//	String ss="khillan verma";
	
//	System.out.println(reverseStringCapital(ss));
		//	fib(8);
	//	System.out.println(reverseStringWord("khillan verma"));
		//String s1="khillan";
		//String s2="verma";
//		SwapString(s1,s2);
		
	
	//	System.out.println(secondSmallestElement(arr));
	//	System.out.println(smallestElemnt(arr));
	//	System.out.println(largestElement(arr));
	//	System.out.println(secondLargestElement(arr));
		
//		String s1="madam";
//		String s2="madam";
//		System.out.println(anagramString("listen","silent"));
//		occurrenceOfChar(s1);
//		System.out.println("======");
//		occurreceOfCharWithOutMap(s1);
		
		
		//printArray(arr);
		//System.out.println("=========");
		//int ogs[]=pushZeroAtEnd(arr);
		//printArray(ogs);
		/**
		 * 0. Swap two String  s1=khillan and s2=verma  output s1=verma,s2=khillan
		 * 1. swap in pairs  or reverse in pairs : khillan output: hklialn;
		 * 1. reverse the String -- 
		 * 2. reverse the word 
		 * 3. reverse String with First Word is Capital 
		 * 
		 *  4. remove the duplicate in given string like input =khillan and output=khilan 
		 *  5. give me the duplicate character in given String : input =khillan and output l 
		 *  6. give the length of String without using inbuilt functions 
		 *  7. give me the length of array without using inbuilt functions 
		 *  8. give me the second largest element in the given array
		 *  9. give me the largest element in the array 
		 * 10. anagram string input listen , silent 
		 *  11. give me the occurrence of character 
		 *  12. String  manipulation like String s=your order code is 918123 give me the static value
		 *  13. give me the index of 3rd i in given string ;i am khillan and working fine 
		 * 	14. given string is palindrom String 
		 *  15. write the program for fibnocchi series 
		 *  16 write the program for prime number , given number is prime or not 
		 *  17. give me the only string in given string s="khilan22dsin"
		 *  18. write the program for given array where you need to find the unique element 
		 * 19. broken links 
		 * 20. google search 
		 * 21. get window handles 
		 * 22. get option using the select class. 
		 * 23. remove the zero from start 
		 * 24. push zero at the end 
		 * 25. sort the array using the bubble sort 
		 * 26. find the Unique element in given arrays
		 * 27 common elements between two arrays 
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
		
		
	String string="Automation Programming";
	
	StringReplace(string);
	}

	//5.write a program for input string "Automation Programming" Output String "xxtxmxtxxn Prxgrxmmxng".
	
	public static void StringReplace(String s) {
	String out=	s.replaceAll("[aieouAIEOU]", "x");
	System.out.println(out);
	
	}
	
	
}
