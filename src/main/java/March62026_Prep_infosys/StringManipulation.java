package March62026_Prep_infosys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.devtools.v142.debugger.Debugger.SetPauseOnExceptionsState;

public class StringManipulation {
	public static void reverseString(String e) {
		//String input=I love Programming
		//output Programming Love I
		
		String arr[]=e.split(" ");
		int left=0;
		int right=arr.length-1;
		System.out.println(e);
			while(left<right) {
				String s=arr[left];
				arr[left]=arr[right];
				arr[right]=s;
				left++;
				right--;
			}
		//	System.out.println(Arrays.toString(arr));
	String reverse="";
			for(String word:arr) {
			reverse=reverse+word+" ";
		}
			System.out.println(reverse);
	}
	
	public static void occurrenceString(String s) {
		//String String =”khillan verma is lived in noida”;
		//word count using hashmap
		//store in ArrayList
		//give me even count using iterator
		
		Map<String,Integer> map=new HashMap<String, Integer>();
		List<String> list=new ArrayList<>();
		String words[]=s.split(" ");
		for(String word: words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getKey() !=" ") {
				list.add(entry.getKey());
			}
		}
		
		Iterator<String> liIterator=list .iterator();
		
		while(liIterator.hasNext()) {
		String word=	liIterator.next();
			
			if(word.length()%2==0) {
				System.out.println(word);
			}
			
		}
		
	}
	public static String commonPrefix(String []arr) {
		
	//	Input: strs = ["flower","flow","flight"]
		//		Output: "fl"
		
		Arrays.sort(arr);
		
		String first=arr[0];
		String last=arr[arr.length-1];
		int i=0;
		int min=Math.min(first.length(), last.length());
		while(i<min && first.charAt(i)==last.charAt(i)) {
			i++;
		}
		return first.substring(0,i);
		
	}
	
	public static String firstReverseCapital(String s) {
		
	String reversefirst="";
		String word[]=s.split(" ");
		for(String w:word) {
		w=w.substring(0,1).toUpperCase()+w.substring(1).toLowerCase();
		reversefirst=reversefirst+reverseStringforFirst(w)+" ";
		
		
	}
		return reversefirst;
	}	
	public static String reverseStringforFirst(String s) {
		//input ="khillan verma" output=amreV, nallihK
		
		
		int left=0;
		int right=s.length()-1;
		char ch[]=s.toCharArray();
		while(left<right) {
			char c=ch[left];
			ch[left]=ch[right];
			ch[right]=c;
			
			left++;
			right--;
		}
		
		return new String(ch);
	}
	
	public static String swapTwoCharacter(String s) {
		String reverses="";
		//khillan;
		char [] arr=s.toCharArray();
		for(int i=0;i+1<s.length();i+=2) {
			char c=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=c;
		}
		return new String(arr);
	}
	public static Character lastRepeatingCharacters(String s) {
	//	char ch=' ';
		Set<Character> seen=new LinkedHashSet<>();
		
		if(s==null ||s.isEmpty())return null;
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			if(seen.contains(c)) {
				return c;
				
			}
			seen.add(c);
		}
		return null;
		
	}
	public static void SmallestElementSEcond(int arr[]) {
		
		int min=Integer.MAX_VALUE;
		int secondMin=min;
		for(int a: arr) {
			if(a<min) {
				secondMin=min;
				min=a;
			}
			else if(a!=min && a<secondMin) {
				secondMin=a;
			}
		}
		System.out.println(secondMin);
	}
	public static void subArraySum(int arr[],int k) {
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			if(arr[left]+arr[right]==k) {
				System.out.println("{"+arr[left]+","+arr[right]+"}");
				//break;
			}
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		
		

int arr[]= {5,3,1,3,5,2,3};		
		SmallestElementSEcond(arr);
		
		subArraySum(arr,8);
		
//		String s="khillaann";
//		System.out.println(lastRepeatingCharacters(s));
//	
		
//	System.out.println(	swapTwoCharacter(s));
		
//		String input="I love Programming";
//		reverseString(input);
		
//		
//		 String string ="khillan verma is lived in noida";
//		 occurrenceString(string);
//		 
		/*String[] strs = {"flower","flow","flight"};
				//Output: "fl"
		System.out.println(commonPrefix(strs));*/
		
//		String s="khillan verma";
//		System.out.println(firstReverseCapital(s));
		
//		String myName="this is khillan verma and working in company where role is engineer";
//		int firstI=myName.indexOf("i");
//		System.out.println(firstI);
//		
//		int scondI=myName.indexOf("i",firstI+1);
//		System.out.println(scondI);
//		
//		int thirdI=myName.indexOf("i",scondI+1);
//		System.out.println(thirdI);
//		
//		String input="khillan";
//		CharSequence arr=input.subSequence(2, input.length());
//		System.out.println(arr);
		
		
//		int arr[]= {10,20,50,40,30};
//		System.out.println(secondLargest(arr));
	}
public static int secondLargest(int []arr) {
	int max=0;
	int secondMax=max;
	for(int a:arr) {
		if(a>max) {
			secondMax=max;
			max=a;
		}
		else if(a!=max && a>secondMax) {
			secondMax=a;
		}
	}
	return secondMax;
}
}
