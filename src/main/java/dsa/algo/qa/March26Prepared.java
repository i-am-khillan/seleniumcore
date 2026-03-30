package dsa.algo.qa;

import java.rmi.server.UID;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class March26Prepared {
	public static void main(String[] args) {
		
//		int arr[]= {7, 8, 9, 9, 2, 1};
//		//removeDuplicateSET(arr);
//		removeDulicate(arr);
//		
//		
//		int arr[]={1,2,3,4,5,6,7,8}; int k=3;
//		System.out.println(Arrays.toString(arr));
		
//		reverseByGroup(arr,k);
//		System.out.println(Arrays.toString(arr));
		
//		int arrs[]={1,2,3,4,5,6,7}; int k1=3;
//		System.out.println(Arrays.toString(arrs));
//		rotateArrayByK(arrs,k1);
//		System.out.println(Arrays.toString(arrs));
		
		
//	int arr[]={10,5,2,7,1,-10};int k=15;// and output : 6
//			//	explains : subArray with sum =15 are [5,2,7,1] ,[10,5],[10,5,2,7,1,-10]
//	longestSubArraySumKlength(arr,k);
//	
//	shortestSubArraySumKlength(arr,k);
//	
		
//	int arrs[]={7, 8, 9, 9, 2, 1};
//	secondMinimumElement(arrs);
//	secondMaxiumElement(arrs);
//	
//	//5.write a program for input string "Automation Programming" Output String "xxtxmxtxxn Prxgrxmmxng".
//	String input="Automation Programming";
//	stringManipulation(input);
//	
//String	inputs = "khillan";
//	//output umbmia
//	swapPairs(inputs);
//	
//	String a="00000123450"; 
//	removePrefix(a);
//	
//	String remove="khillan";
//	removeDuplicate(remove);
//	
//	String s="khillan verma";
//	System.out.println(reverseCapital(s));
//	occurrenceCharacter(s);
//	
	String strs[] = {"flower","flow","flight"};
	String longs=longestCommonPrefix(strs);
	System.out.println(longs);
	

		String s = "ace";
        String t = "abcde";

        System.out.println(stringSubSequences(s,t)); // Output: true

        String ss="abcaedb";
        System.out.println(lastRepeatingCharacter(ss)); //b
        
      String specidal="khillan&verma:a";//"ab#cd$ef";
       String spec= reverseStringPrevervingSpecialCharOrder(specidal);
       System.out.println(spec);
       
       String words= "I Love Programming";
       reverseStringWord(words);
       
       
     String  input= "java python java python .net python";
     duplicateRemove(input);
     
    String inputs = "selenium is automation tool";
    reverseWord(inputs);
    
    
    String inpu="khillan";//7
	String inpu1="verma"; //5--12
	swapTwoString(inpu,inpu1);
	}
	//5.write a program for input string "Automation Programming" Output String "xxtxmxtxxn Prxgrxmmxng".
	
	//remove Duplicate and giving unique element 
	//Give me only duplicate character;
	
	public static void swapTwoString(String s1,String s2) {
		String inpu="khillan";//7
		String inpu1="verma"; //5--12
		System.out.println(s1 +"==="+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1 +"==="+s2);
		
	}
	public static void reverseWord(String s) {
		//input = selenium is automation tool
		String rev="";
		String words []=s.split(" ");
		for(String word: words) {
			rev=rev+reverseString(word)+" ";
		}
		System.out.println(rev);
	}
	
	public static void duplicateRemove(String s) {
		
		String word[]=s.split(" ");
		Set<String> set=new HashSet<>();
		Set<String> unique=new LinkedHashSet<>();
		String rev="";
		for(String str: word) {
			if(set.add(str)) {
				set.add(str);
				rev=rev+str+" ";
			}
			unique.add(str);
		}
		System.out.println(unique);
		System.out.println(rev);
	}
	public static void reverseStringWord(String s) {
		//String input=I love Programming
		String []words=s.split(" ");
		String word="";
		for(int i=words.length-1;i>=0;i--) {
			word=word+words[i]+" ";
		}
		System.out.println(word);
	}
	public static String reverseStringPrevervingSpecialCharOrder(String s) {
		//ab#cd$ef
		//khillan&verma:a
		char arr[]=s.toCharArray();
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			
			if(!Character.isLetterOrDigit(arr[left])) {
				left++;
			}
			else if(!Character.isLetterOrDigit(arr[right])) {
				right--;
			}
			else {
				char tem=arr[left];
				arr[left]=arr[right];
				arr[right]=tem;
				left++;
				right--;
			}
		}
		return new String(arr);

	}
	//reverse the string of words by spliting it where we find special character and ensure special character possition s intact
	public static Character lastRepeatingCharacter(String s) {
	//input	String ss="abcaedb";
	//output : b
		Set<Character> set=new LinkedHashSet<>();
		for(int i=s.length()-1;i>=0;i--) {
			char cs=s.charAt(i);
			if(set.contains(cs)) {
				return cs;
			}
			set.add(cs);
		}
		return null;
				
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
	public static String longestCommonPrefix(String arr[]) {
		//Input: strs = ["flower","flow","flight"]
			//	Output: "fl"
		Arrays.sort(arr);
		
		String first=arr[0];
		String last=arr[arr.length-1];
		int min=Math.min(first.length(), last.length());
		int i=0;
		while(i<min && first.charAt(i)==last.charAt(i)) {
			i++;
		}
		return first.substring(0,i);
	}
	
	public static void occurrenceCharacter(String s) {
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		String arr[]=s.split(" ");
		for(String a:arr) {
			
			for(char c: a.toCharArray()) {
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}
				else {
					map.put(c, 1);
				}
			}
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()){
			
			if(entry.getKey()!=' ' && entry.getValue()==1) {
				System.out.println(entry.getKey()+"=="+entry.getValue());
				
			}
		}
	}
	public static String reverseCapital(String s) {
	String	arr[]=s.split(" ");
	String res="";
	for(String ss:arr) {
		ss=ss.substring(0,1).toUpperCase()+ss.substring(1).toLowerCase();
		res=res+reverseString(ss)+" ";
	}
		return res;
		
	}
	public static String reverseString(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res=res+s.charAt(i)+"";
		}
	
	return res;
	}
	public static void removeDuplicate(String s) {
		Set<Character> set=new LinkedHashSet<>();
		String res="";
		for(int i=0;i<s.length();i++) {
			if(!set.add(s.charAt(i))) {
				res=res+s.charAt(i)+"";
			}
		}
		System.out.println(res);
	}
	public static void removePrefix(String s) {
		//a=0000012345 out : 12345
		String res="";
		int i=0;
		
		while(i<s.length() && s.toCharArray()[i]=='0') {
			i++;
		}
		System.out.println(s.substring(i));
	}
	public static void swapPairs(String s) {
		/**
		 * 2. write the program to swap the character in paris
input mumbai
output umbmia
input khillan
output hklialn
		 */
		String res="";
		char arr[]=s.toCharArray();
		for(int i=0;i+1<arr.length;i+=2) {
			char c=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=c;
		}
		
		System.out.println(new String(arr));
	}
	public static void stringManipulation(String s) {
		String arr[]=s.split(" ");
		String rev="";
		for(String c: arr) {
			
			rev=rev+c.replaceAll("[aeiouAEIOU]", "x")+" ";
			
		}
		System.out.println(rev);
//		s=s.replaceAll("[^aeiouAEIOU]", "x");
//		System.out.println(s);
	}
	public static void secondMaxiumElement(int arr[]) {
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i >max) {
				secMax=max;
				max=i;
			}
			else if(i!=max && i>secMax) {
				secMax=i;
			}
		}
		System.out.println(secMax);
	}
	public static void secondMinimumElement(int arr[]) {
		int min=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		for(int i:arr) {
			if(i<min) {
				secMin=min;
				min=i;
			}
			else if(i!=min && i<secMin) {
				secMin=i;
			}
		}
		System.out.println(secMin);
	}
	public static void shortestSubArraySumKlength(int arr[],int k) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0, -1);
		int minLen=Integer.MAX_VALUE;
		int currentSum=0;
		int start=-1,end=-1;
		
		for(int i=0;i<arr.length;i++) {
			currentSum +=arr[i];
			if(map.containsKey(currentSum-k)) {
			
				int startindex=map.get(currentSum-k);
				int len=i-startindex;
				
				if(len<minLen) {
					minLen=len;
					start=startindex+1;
					end=i;
				}
			
			}
			map.put(currentSum, i);
		}
		if(start==-1) {
			System.out.println("No SubArray found for sum k="+minLen);
		}
		else {
			System.out.println("shortest SubArray found for sum k="+minLen);
			System.out.println("SubArray =[");
			for(int i=start;i<=end;i++) {
				System.out.println(arr[i]+(i<end ?",":""));
			}
			System.out.print("]");
		}
		
	}
	public static void longestSubArraySumKlength(int arr[],int k) {
		Map<Integer,Integer> map=new HashMap<>();
		int currentSum=0;
		map.put(0,-1);
		int maxLen=Integer.MIN_VALUE;
		
		int start =-1 ,end=-1;
		for(int i=0;i<arr.length;i++) {
			currentSum +=arr[i];
			if(map.containsKey(currentSum-k)) {
				int startIndex=map.get(currentSum-k);
				int len=i-startIndex;
				if(len>maxLen) {
					maxLen=len;
					start=startIndex+1;
					end=i;
				}
			}
			map.put(currentSum, i);
		}
		
		if(start==-1) {
			System.out.println("No subArray found sum of K="+maxLen);
		}
		else {
			System.out.println("longest subArray length K="+maxLen);
			System.out.println("SubArray =[");
			for(int i=start;i<=end;i++) {
				System.out.print(arr[i]+(i<end?", ":""));
				
			}
			System.out.print("]");
		}
	}
	public static void reverseByGroup(int arr[],int k) {
		int n=arr.length;
		for(int i=0;i<n;i+=k) {
			int left=i;
			int right=Math.min(i+k-1, n-1);
			reverserArray(arr,left,right);
		}
		
	}
	public static void rotateArrayByK(int arr[],int k) {
		int n=arr.length;
		k=k%n;
		reverserArray(arr, 0, n-1);
		reverserArray(arr,0,k-1);
		reverserArray(arr,k,n-k);
	}
	
private static void reverserArray(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		while(left<right) {
			int tem=arr[left];
			arr[left]=arr[right];
			arr[right]=tem;
			
			left++;
			right--;
		}
	}
//	How would you remove duplicate values from an array and return only unique values (for example, [7, 8, 9, 9, 2, 1])?
	public static void removeDulicate(int arr[]) {
		boolean b[]=new boolean[256];
		String res="";
		for(int i=0;i<arr.length;i++) {
			if(!b[arr[i]]) {
				
				System.out.println(arr[i]);
				b[i]=true;
			}
			else {
				//System.out.println(arr[i]);
			}
			//System.out.println(res);
		}
		//System.out.println();
	}
	public static void removeDuplicateSET(int arr[]) {
		int result=0;
		Set<Integer> set=new LinkedHashSet<>();
		Set<Integer> unique=new LinkedHashSet<>();
		
		
		for(int a: arr) {
			if(set.add(a)) {
				result=a;
			}
			else {
				System.out.println(a);
			}
			unique.add(a);
		}
		System.out.println(unique);
	}
}
