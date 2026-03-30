package March62026_Prep_infosys;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProgrammingInterview_Inforsys_ro2_PREP {
	
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
	 * 44. Swap two String using substring
	 * 44. Balance string ( [[])[]}
	 * 45.DAG & treasure Hunt
	 * 46.Longest Substring Without Repeating Characters
	 * 47.Longest common subsequence 
	 * 48.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	
	// String  manipulation like String s=your order code is 918123 give me the static value
	
	public static void StringManipulations(String s) {
		//String st="your order code is 918123 give me the static value";
		String srs=s.substring(s.indexOf("is")+3,s.indexOf("give")-1);
		System.out.println(srs);
	
		
		//give me the only string in given string s="khilan22dsin"
		String OnlyStrings=s.replaceAll("[^a-zA-Z]", " ");
		System.out.println(OnlyStrings);
		
		//give me the only string in given string s="khilan22dsin"
		String onlyNumeric=s.replaceAll("[^0-9]", "");
		System.out.println(onlyNumeric);
		
		//give me the only string in given string s="khilan22dsin"
				String specialCharacter=s.replaceAll("[a-zA-Z0-9]", "");
				System.out.println(specialCharacter);
	}
	
	public static void getWindowHandles(WebDriver driver) {
		driver.get("");
		driver.manage().window().maximize();
		String parentWindow=driver.getWindowHandle();
		
		//wait 
		Set<String> childs=driver.getWindowHandles();
		Iterator<String> its=childs.iterator();
		while(its.hasNext()) {
			String Childwindows=its.next();
			if(!parentWindow.equals(Childwindows)) {
				driver.findElement(By.xpath("//a")).getText();
				driver.close();
			}
			driver.switchTo().window(parentWindow);
			driver.findElement(By.xpath("//a")).getText();
			driver.close();
		}
		
	}
	//get window handles
	
	public static String reverseString(String s) {
		String rev="";
		int left=0;
		//int right=s.toCharArray().length;
		char arr[]=s.toCharArray();
		int right=arr.length-1;
		while(left<right) {
			
			char c=arr[left];
			arr[left]=arr[right];
			arr[right]=c;
			left++;
			right--;
		}
		return new String(arr);
	}
	 //given string is palindrom String 
	// find the Unique element in given arrays
	
	public static void UniqueElement(int arr[]) {
		int a=0;
		for(int i:arr) {
			a=a^i;
		}
		System.out.println(a);
	}
	public static void brokenLinks(WebDriver driver) throws MalformedURLException, IOException {
		driver.get("");
		driver.manage().window().maximize();
		
		List<String> list=new ArrayList<>();
		List<WebElement> element=driver.findElements(By.xpath("//a"));
		for(WebElement e:element) {
			String urls=e.getAttribute("href");
			
			HttpURLConnection connection=(HttpURLConnection)new URL(urls).openConnection();
			connection.connect();
			
			if(connection.getResponseCode()==200) {
				list.add(urls);
				}
			else {
				System.out.println(urls);
			}
		}
	}
	
	public static void duplicateWords(String s) {
		String ss="i am khillan verma and verma your last name and khillan is first name";
		String arr[]=ss.split(" ");
		Map<String,Integer> map=new LinkedHashMap<>();
		
		for(String word:arr) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getKey()!=" " && entry.getValue() >1){
				System.err.println(entry.getKey()+"===="+entry.getValue());
			}
		}
	}
	public static void main(String[] args) {
		
		String ss="i am khillan verma and verma your last name and khillan is first name";
		
		duplicateWords(ss);
		
		/*
		 * String s="khilan22dsin$%^&&"; //give me the only string in given string
		 * s="khilan22dsin" String OnlyStrings=s.replaceAll("[^a-zA-Z]", " ");
		 * System.out.println(OnlyStrings);
		 * 
		 * //give me the only string in given string s="khilan22dsin" String
		 * onlyNumeric=s.replaceAll("[^0-9]", ""); System.out.println(onlyNumeric);
		 * 
		 * //give me the only string in given string s="khilan22dsin" String
		 * specialCharacter=s.replaceAll("[a-zA-Z0-9]", "");
		 * System.out.println(specialCharacter);
		 */
		/*
		 * String s="khilan22dsin!@#$%^"; StringManipulations(s);
		 * 
		 * String st="your order code is 918123 give me the static value";
		 * StringManipulations(st);
		 */
		/*
		 * String s="khillan"; System.out.println(s); String sr= reverseString(s);
		 * System.out.println(sr);
		 */
//		int arr[]= {10,20,30,6,10,20,30};
//		UniqueElement(arr);
//		
//		 int[] arr1 = {1, 2, 3, 4, 5};
//	        int[] arr2 = {3, 4, 5, 6, 7};
//		commonElementsBetweenArrays(arr1,arr2);
		
//		int arr[]= {10,20,30,0,0,0,3,0,6};
//		System.out.println(Arrays.toString(arr));
//		
//		int arrs[]=pushZeroAtEnd(arr);
//		
//		System.out.println(Arrays.toString(arrs));
	}
	
	public static int[] pushZeroAtEnd(int arr[]) {
		int i=0;
		int arrs[]=new int[arr.length];
		for(int a:arr) {
			if(a>0) {
				arrs[i++]=a;
			}
		}
		while(i<arr.length) {
			arrs[i++]=0;
		}
		return arrs;
	}
	public static void commonElementsBetweenArrays(int arr1[],int arr2[]) {
		
		        Set<Integer> set = new HashSet<>();
		        Set<Integer> common = new HashSet<>();

		        for(int a:arr1) {
		        	set.add(a);
		        }
		        for(int b:arr2) {
		        	if(set.contains(b)) {
		        		common.add(b);
		        	}
		        }

		      System.out.println(common);
	}
	
	public static String removeDuplicate(String s) {
		Set<Character> set=new LinkedHashSet<>();
		String removeDuplicate="";
		for(char c:s.toCharArray()) {
			if(set.add(c)) {
				removeDuplicate=removeDuplicate+c+"";
				
			}
		}
		
		return removeDuplicate;
	}
	
	public static String removeZero(String s) {
		String str="000000124230";
		int i=0;
			while(s.charAt(i) =='0' && i<s.length() ) {
				i++;
			}
		return s.substring(i);
	}
	
	public static void ArrayDuplicate(List<Integer> list) {
		
		Set<Integer> set=new LinkedHashSet<>();
		int duplicate=0;
		for(Integer i:list) {
			if(!set.add(i)) {
				duplicate=i;
				//break;
				System.out.println(duplicate);
			}
		}
		
		
	}
	public static void reverseInteger(int n) {
		String rev="";
		while(n>0) {
			
			rev=rev+n %10+"";
			n=n/10;
			
		}
		System.out.println(rev);
	}
	public static boolean balanceString(String s) {
		
		Stack<Character> stack=new Stack<>();
		
		for(char c: s.toCharArray()) {
			if(stack.empty()) {
				stack.push(c);
			}
			else if(c=='(' ||c=='{'||c=='[') {
				stack.push(c);
			}
			else if(c==')'&& stack.peek()=='(' ||c=='}'&& stack.peek()=='{' ||c==']'&& stack.peek()=='[') {
				stack.pop();
			}	
		}
		if(stack.empty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void swapTwoNumber(int a,int b) {
		//a==10 ,b==20;
		System.out.println(a+"==="+b);
		a=a+b;	//10+20=30
		b=a-b;	//30-20=10;
		a=a-b;	//30-10;20
		System.out.println(a+"==="+b);
	}
	public static void swapTwoString(String s1,String s2) {
		
		System.out.println("Swap two String :"+s1+"==="+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("Swap two String :"+s1+"==="+s2);
	}
	public static void fibSeries(int n) {
		int n1=0;
		int n2=1;
		System.out.print(n1+","+n2+",");
		
		for(int i=2;i<=n;i++) {
			int sum=n1+n2;
			System.out.print(+sum+",");
			n1=n2;
			n2=sum;
		}
		
	}
	public static boolean primeNumber(int n) {
		boolean isPrime=true;
		if(n <=1) {
			isPrime=false;
		}
		else {
		for(int i=2;i<n;i++) {
			if(n % i==0) {
				isPrime=false;
				break;
				}
			}
		}
//		if(isPrime) {
//			System.out.println("Number is Prime  :"+n);
//		}
//		else {
//			System.out.println("Number is not Prime  :"+n);
//		}
		return isPrime;
	}
	
	public static void PrimeNumberRanges(int start,int end) {

		// int start = 1, end = 50;

		        for (int num = start; num <= end; num++) {
		            if (isPrime(num)) {
		                System.out.print(num + " ");
		            }
		            else {
		            	//System.out.print(num + " ");
		            }
		        }

	}

	public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
	public static int findMissingNumber(int []arr,int a) {
		int xor=0;
		for(int i=1;i<=a;i++) xor^=i;
		for(int v:arr)xor^=v;
		return xor;
	}
	public static void sortArray(int []arr) {
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
	
	//public static void main(String[] args) {
//		String s="khillan";
//		System.out.println(removeDuplicate(s));
//		
//		
//		int n[]= {1,5,3,4,5,3,7};
//		List<Integer> list=new ArrayList<Integer>();
//		for(int i:n) {
//		list.add(i);}
		
		
		//ArrayDuplicate(list);
//		int n[]= {1,5,3,4,5,7};
//		System.out.println(Arrays.toString(n));
//		sortArray(n);
//		System.out.println(Arrays.toString(n));
		
		
		//find the missing number
//		int n[]= {1,2,3,4,5,7}; //22
//		System.out.println(findMissingNumber(n ,6));
		
//		int a=1234;
//		reverseInteger(a);
//		String arr[]= {"flower","floght","flow"};
//		System.out.println(longestSubString(arr));
	
//		String s="()[]{}";
//	System.out.println(	balanceString(s));
//		int a=10;int b=20;	
//		swapTwoNumber(a,b);

	//	  String a="10";String b="20"; swapTwoString(a,b);
		
		//fibSeries(6);
		
		//primeNumber(5);
//		int start = 1, end = 50;
//		PrimeNumberRanges(start,end);
//	}
	
	public static String longestSubString(String s[]) {
		Arrays.sort(s);
		String first=s[0];
		String last=s[s.length-1];
		int i=0;
		int min=Math.min(first.length(), last.length());
		
		while(i<min && first.charAt(i)==last.charAt(i)) {
			i++;
		}
		return first.substring(0,i);
		
	}

}
