package revision.qa;

import java.util.Stack;

public class March4 {

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
	public static void main(String[] args) {
		String s="{}{}{}{}[]()";
		StringBalance(s);
		System.out.println(balanceStringCorrect(s));
	}
	public static void StringBalance(String s) {
		
		Stack<Character> stack=new Stack<>();
		
		for(char st:s.toCharArray()) {
		if(stack.empty()) {
			stack.push(st);
		}
		else if(st=='('|| st=='{'||st=='[') {
			stack.push(st);
		}
//		else if(st==')' && stack.peek()=='(' ||st==']' && stack.pop()=='[' ||st=='}' && stack.pop()=='{') {
//			stack.pop();
//		}
		else if(st==')'&& stack.peek()=='(' ||st==']'&& stack.peek()=='['  ||st=='}'&& stack.peek()=='{' ) { 
			//stack.peek()--- get the peek element :Looks at the object at the top of this stack without removing it from the stack.
			stack.pop();// out from the stack :Removes the object at the top of this stack and returns that object as the value of this function.
		}	
	}
	if(stack.empty()) {
		System.out.println("String is balace string");
	}
	else {
		System.out.println("String is not balance");
	}
	
	}
	public static boolean balanceStringCorrect(String s) {
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

}
