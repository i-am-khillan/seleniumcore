package companyCode;

import java.util.Arrays;

public class LTIMindTree2Jan {
	
	public static void main(String[] args) {
		
		String s1="";
		String s2="";
		
		System.out.println(anagramCheck(s1,s2));
		
		
	}
	
	public static boolean anagramCheck(String s1,String s2) {
		
		char[] s1a=s1.toCharArray();
		char[] s2a=s2.toCharArray();
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
			
			//sort the both array
			Arrays.sort(s1a);
			Arrays.sort(s2a);	
			
			//compare both array
			
			Arrays.equals(s1a, s2a);
		}
		return Arrays.equals(s1a, s2a);
	}

}
