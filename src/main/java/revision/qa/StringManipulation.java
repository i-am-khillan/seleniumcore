package revision.qa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.ArrayList;

public class StringManipulation {
	
	public static void StringValue(String s) {
		char ch[]=s.toCharArray();
		
		String rs=s.replaceAll("[AIOUEaieou]","x");//xxtxmxtxxn Prxgrxmmxng
		System.out.println(rs);
		
	}
	public static int StringParagraph(String paragraph) {
		//String paragraph = "This is the first statement. Here is another, which is slightly longer.Finally, this is the longest statement in terms of word count in this paragraph.";
		String words[]=paragraph.split(".");
		int max=words[0].length();
	
		for(int i=1;i<words.length;i++) {
			if(words[i].length()<max) {
				max=words[i].length();
			}
		}
		return max;
	}
	public static void highestElement(int arr[]) {
		int count=0;
		for(int a:arr) {
			if(a<count) {
				count=a;
			}
		}
		
	}
	
	private static int CountWords(String word) {
	
		int count=0;
		for(String words :word.split(" ")) {
			count++;
		}
		return count;
		
	}
	public static void main(String[] args) {
			String paragraph = "This is the first statement. Here is another, which is slightly longer.Finally, this is the longest statement in terms of word count in this paragraph.";
		//System.out.println(StringParagraph(paragraph));
		
		String ss="Automation Programming";
		StringValue(ss);
		
		String s = "abcabcbb";
		//String s="a";
		
		 String normalized = paragraph.replaceAll("([.!?])(\\S)", "$1 $2");
		 System.out.println(normalized);
		 String word[]=normalized.split("[.!?]");
		 
		 
		 
		 
		
System.out.println(lengthOfLongestSubstring(s));
			//	Output: 3
	}
	public static String longestSubStringWithOutRepeating(String s) {
		
		
		return "";
	}
	
	 public static int lengthOfLongestSubstring(String s) {
	        
	        int right=0,left=0 ,res=0;

	        Map<Character,Integer> map=new HashMap<>();
	        char arr[]=s.toCharArray();
	        
	        for(;right<arr.length;right++){
	        	int idx=map.getOrDefault(arr[right] ,-1);
	        	
	            if(idx !=-1 && idx>=left) {
	            	res=Math.max(res, right-1-left+1);
	            	left=idx+1;
	            }
	            map.put(arr[right],right);
	        }
	        
	       System.out.println(map); 
return Math.max(res, right-1-left+1);
	    }
	
//	public static int solve(String s1,String s2,int i,int j,Vector<Vector<Integer>>dp ){
//		
//		if(i==s1.length()) return 0;
//		if(j==s2.length()) return 0;
//		int ans=0;
//		
//		if(dp[i][j]==-1) {
//			return dp[i][j];
//		}
//		int ans=0;
//		if(s1[i]==s2[j]) {
//			ans=1+solve(s1,s2,i+1,j+1,dp);
//		}
//		else {
//			ans=max(solve(s1,s2,i+1,j,dp),solve(s1,s2,i,j+1,dp));
//		}
//		return dp[i][j]=ans;
//	}

}
