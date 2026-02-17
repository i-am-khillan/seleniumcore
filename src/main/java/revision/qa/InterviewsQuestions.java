package revision.qa;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InterviewsQuestions {
	
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
	 * 45.
	 * 
	 * 
	 */

	public static void bubbleSort(int arr[] ) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]){
						
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
	}
	public static int removeZeroFromStart(String s) {
		
		return Integer.parseInt(s);
	}
	public static List<String> brokenLinks(WebDriver driver) throws MalformedURLException, IOException {
		driver.get("ingenico.com");
		List<String> brokenLinks=new ArrayList<>();
		List<WebElement>links=driver.findElements(By.xpath("//a"));
		for(WebElement e: links) {
			String url=e.getAttribute("href");
			
			HttpURLConnection con=(HttpURLConnection) new URL(url).openConnection();
			con.connect();
			if(con.getResponseCode()!=200) {
				brokenLinks.add(url);
			}
		}
		return brokenLinks;
	}
	
	public static void main(String[] args) {
		String in="0001234040";
		System.out.println(removeZeroFromStart(in));
		int arr_sort[]= {1,9,3,2,5,8};
		for(int a:arr_sort) {
			System.out.print(a+" ,");
		}
		System.out.println("----");
		bubbleSort(arr_sort);
		
		for(int a:arr_sort) {
			System.out.print(a+" ,");
			}
		String input = "khillan1234verma";
		// give only alphabetic or number only

		String alpha = input.replaceAll("[^a-zA-Z]", "");

		System.out.println(alpha);

		// only number
		String onlyNumber = input.replaceAll("[^0-9]", "");
		System.out.println(onlyNumber);

		String strs = "khilaanXxvermaXxingenicoXx";// remove Xx
		String ass[] = strs.split("Xx");
		String word = "";
		for (String a : ass) {
			word = word + a + " ";
		}
		System.out.println(word);

		String sstab = "asjkdfa2@$#@#^AFSDa#%@sf";
		String onlyStringNum = sstab.replaceAll("[a-zA-Z0-9]", "");

		System.out.println(onlyStringNum);

		System.out.println("-------------------------");

//		String s="khillan";
//		System.out.println(reverseString(s));
//		
		// String str="i am khillan verma";

//		String s="khillan";
//		System.out.println(stringLength(s));
		int arr[] = { 10, 2, 4, 39, 4, 2, 190, 8 };
		System.out.println(secondLargest(arr));
		// System.out.println(reverseCharacterOfEachWordWithOutChangeOriginalOrder(str));
		System.out.println(lagestElement(arr));

		// occurrenceOfCharacter("khillan");
		System.out.println(anaGram("listen", "silent"));

		String s = "this is your order id 10233";
		stringManipulation(s);

		positionOf3I(s);

		System.out.println(palindromeString("madam"));

		fibnoccSeriesRecusive(10);
		for (int i = 0; i < 10; i++) {
			System.out.print(fibnoccSeriesRecusive(i) + " ");
		}

		System.out.println(isNumPrime(8));
		
		System.out.println("-----------------");
		int arrsa[] = { 1, 1, 3, 3, 9, 9, 4, 3, };
		System.out.println(UniqueElement(arrsa));
	}

	public static int UniqueElement(int arr[]) {
		int unique = 0;
		for (int a : arr) {
			unique = unique^ a;
		}
		return unique;
	}

	public static void getWindowHandles(WebDriver driver) {

		String parentWindow = driver.getWindowHandle();
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> itrs = windowIds.iterator();
		while (itrs.hasNext()) {
			String childWindows = itrs.next();

			if (!parentWindow.equalsIgnoreCase(childWindows)) {

				driver.switchTo().window(childWindows);
				driver.findElement(By.xpath("user")).sendKeys("usernmae");
				driver.findElement(By.xpath("password")).sendKeys("pass");
				driver.findElement(By.xpath("pass")).click();
				driver.close();
			}

			driver.switchTo().window(parentWindow);
			driver.findElement(By.xpath("user")).sendKeys("usernmae");
			driver.findElement(By.xpath("password")).sendKeys("pass");
			driver.findElement(By.xpath("pass")).click();
			System.out.println(driver.getCurrentUrl() + "--- " + driver.getTitle());

			driver.close();
		}

	}

	public static void stringManipulation(String s) {

		System.out.println(s.substring(s.indexOf("id") + 2, s.length()));
	}

	public static void positionOf3I(String s) {

		int firstOccurrence = s.indexOf("i");
		System.out.println(firstOccurrence);
		int secondOccurrence = s.indexOf("i", firstOccurrence + 1);

		System.out.println(s.indexOf("i", secondOccurrence + 1));

	}

	public static boolean anaGram(String s1, String s2) {

		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);
	}

	public static int secondLargest(int[] arr) {

		int max = 0;
		int secondMax = max;
		for (int ar : arr) {
			if (ar > max) {
				secondMax = max;
				max = ar;
			} else if (max != ar && ar > secondMax) {
				secondMax = ar;
			}
		}
		return secondMax;
	}

	public static int stringLength(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			count++;
		}
		return count;
	}

	private static String reverseString(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i) + "";
		}
		return rev;
	}

	private static String reverseWord(String s) {
		String word[] = s.split(" ");
		String revWord = "";
		for (int i = word.length - 1; i >= 0; i--) {
			revWord = revWord + word[i] + " ";
		}
		return revWord;
	}

	public static String reverseCharacterOfEachWordWithOutChangeOriginalOrder(String s) {
		String arr[] = s.split(" ");
		String revWord = "";
		for (String word : arr) {
			revWord = revWord + reverseString(word) + " ";
		}
		return revWord;
	}

	public static String reverseFirstCharacterCap(String str) {
		String rev = "";
//		String arr[]=s.split(" ");
//		for(String str:arr) {
		rev = str.substring(0, 1) + str.toUpperCase() + str.substring(1) + " ";

		return rev;
	}

	public static String getDuplicateCharacter(String s) {

		Set<Character> set = new LinkedHashSet<>();
		// Set<Character> duplicateChar=new LinkedHashSet<>();
		String duplicateChars = "";
		for (char ch : s.toCharArray()) {
			if (!set.add(ch)) {
				// duplicateChar.add(ch);
				duplicateChars = duplicateChars + ch;
			}
		}
		return duplicateChars;
	}

	public static String removeDuplicate(String s) {
		Set<Character> set = new LinkedHashSet<>();
		// Set<Character> duplicateChar=new LinkedHashSet<>();
		String removedDuplicate = "";
		for (char ch : s.toCharArray()) {
			if (set.add(ch)) {
//				duplicateChar.add(ch);
				removedDuplicate = removedDuplicate + ch;
			}
		}
		return removedDuplicate;

	}

	public static int lagestElement(int[] arr) {

		int max = 0;
		for (int a : arr) {
			if (a > max) {
				max = a;
			}
		}
		return max;
	}

	public static void occurrenceOfCharacter(String s) {

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char str : s.toCharArray()) {

			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "==" + entry.getValue());
		}

	}

	public static boolean palindromeString(String s) {
		String str = s.toLowerCase();
		int right = str.length() - 1;
		int left = 0;
		while (left < right) {

			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			right--;
			left++;
		}
		return true;

	}

	public static void fibnocciSeries(int num) {
		// number :10 ,
		/**
		 * num1=0; num2=1; sum=num1+num2
		 * 
		 */

		int num1 = 0;
		int num2 = 1;
		int sum = 0;

		for (int i = 2; i < num; i++) {
			sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
		}

	}

	public static int fibnoccSeriesRecusive(int num) {
		if (num <= 1) {
			return num;
		}
		return fibnoccSeriesRecusive(num - 1) + fibnoccSeriesRecusive(num - 2);
	}

	public static boolean isNumPrime(int num) {

		/*
		 * 2 === dividual itself 2* 1
		 * 
		 */

		boolean isPrime = true;
		if (num >= 1) {
			isPrime = false;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static int[] pushZeroAtEnd(int arr[]) {
		int len = arr.length;
		int a = 0;

		int org[] = new int[arr.length];
		for (int i : arr) {
			if (i > 0) {
				org[a++] = i;
			}
		}
		while (a < len) {
			org[a++] = 0;
		}
		return org;
	}
	/**
	 * d 1. reverse the String -- d 2. reverse the word d 3. reverse String with
	 * First Word is Capital d 4. remove the duplicate in given string like input
	 * =khillan and output=khilan d 5. give me the duplicate character in given
	 * String : input =khillan and output l d 6. give the length of String without
	 * using inbuilt functions d 7. give me the length of array without using
	 * inbuilt functions d 8. give me the second largest element in the given array
	 * d 9. give me the largest element in the array d 10. anagram string input
	 * listen , silent d 11. give me the occurrence of character d 12. String
	 * manipulation like String s=your order code is 918123 give me the static value
	 * d 13. give me the index of 3rd i in given string ;i am khillan and working
	 * fine d 14. given string is palindrom String d 15. write the program for
	 * fibnocchi series d 16 write the program for prime number , given number is
	 * prime or not d 17. give me the only string in given string s="khilan22dsin"
	 * 18. write the program for given array where you need to find the unique
	 * element 19. broken links 20. google search 21. get window handles 22. get
	 * option using the select class. 23. remove the zero from start 24. push zero
	 * at the end 25. sort the array using the bubble sort 26. find the Unique
	 * element in given arrays
	 * 
	 * 
	 * 
	 */

}
