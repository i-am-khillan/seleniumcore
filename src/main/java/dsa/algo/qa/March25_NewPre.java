package dsa.algo.qa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class March25_NewPre {
	public static void main(String[] args) {
		
		int[] arr = {10, 40, 5, 70,0,10,0,20,0};
		
//		System.out.println(secondMin(arr));
//		String s="Automation";
//		uniqueCharacter(s);
//		
//		int high=arr.length-1;
//		System.out.println(Arrays.toString(arr));
//		pushZeroAtEnd(arr,0,high);
//		System.out.println(Arrays.toString(arr));
		

//		 int[] arrs = {1, 2, 3, 4, 5, 6, 7,8};
//		 //out aarr[]={3,2,1,6,5,4,8,7}
//		 	System.out.println(Arrays.toString(arrs));
//		        int k = 3;
//		        reverseKPositions(arrs, k);
//		        System.out.println(Arrays.toString(arrs));
//		        
		        int input[]= {10,5,2,7,1,-10}; 
				int k=15 ;
		        
				lengthOfsubArraySum(input,k);
				smallestSubArraySumLength(input,k);
	}
	public static void lengthOfsubArraySum(int arr[],int k) {
		/**
		 * 
		 *calculate the length of the longest subarray with a sum of 15 is 6
		 *calculate the length of the smallest subarray with a sum of 15 is 2
		 * int input[]= {10,5,2,7,1,-10}; 
			int k=15 
			output =6,
			
			subArrays  [5,2,7,1],==sum 15 not answer 
						[10,5]   ==sum 15 not answer
						[10,5,2,7,1,-10] ==sum 15 answer
						
						
						Shortest subarray with sum K
✅ Print the actual subarray
✅ Sliding‑window alternative (for positives only)
		 * 
		 */
		
		//solve this question using presum_Array sum
		Map<Integer,Integer> prefixSumMap=new HashMap<>();
		prefixSumMap.put(0, -1); //prefix before starting 
		int maxLen=Integer.MIN_VALUE;
		int currentSum=0;
		
		int start=-1 ,end=-1;
		for(int i=0;i<arr.length;i++) {
			currentSum +=arr[i];
			
			if(prefixSumMap.containsKey(currentSum-k)) {
				int startIndex=prefixSumMap.get(currentSum-k);
				int length=i-startIndex;
				//maxLen=Math.max(maxLen, length);
				if(length>maxLen) {
					maxLen=length;
					start=startIndex+1;
					end=i;
				}
				
			}
			prefixSumMap.put(currentSum, i);
		}
		System.out.println(maxLen);
		if(start==-1) {
			System.out.println("No sub Array with K="+k);
		}
		else {
			System.out.println("Longest subArray ="+maxLen);
			System.out.print("SubArray =[");
			for(int i=start;i<=end;i++) {
				System.out.print(arr[i]+(i<end ?", ":""));
			}
			
			System.out.println(" ]");
		}
	}
	public static void smallestSubArraySumLength(int arr[],int k) {
		Map<Integer,Integer> prefixSumMap=new HashMap<>();
		prefixSumMap.put(0, -1);
		int min=Integer.MAX_VALUE;
		int currentSum=0;
		int start=-1 ,end=-1;
		
		for(int i=0;i<arr.length;i++) {
			currentSum +=arr[i];
			
			if(prefixSumMap.containsKey(currentSum-k)) {
				int startIndex=prefixSumMap.get(currentSum-k);
				int length=i-startIndex;
				if(length<min) {
					min=length;
					start=startIndex+1;
					end=i;
				}
				
			}
			prefixSumMap.put(currentSum, i);
		}
		System.out.println(min);
		if(start==-1) {
			System.out.println("No sub Array with K="+k);
		}
		else {
			System.out.println("shortest subArray ="+min);
			System.out.print("SubArray =[");
			for(int i=start;i<=end;i++) {
				System.out.print(arr[i]+(i<end ?", ":""));
			}
			
			System.out.println(" ]");
		}
	}
	public static void reverseKPositions(int arr[],int k) {
		
		// int[] input = {1, 2, 3, 4, 5, 6, 7,8};
		 //out aarr[]={3,2,1,6,5,4,8,7}
		//reverse position in group based of given condition
		int n=arr.length;
		
		for(int i=0;i<n;i+=k) {
			int left=i;//0 //i=3
			int right=Math.min(i+k-1, n-1);//2-- //3+3-1,=5-8
				reverseArray(arr, left,right);
				
				 //System.out.println(Arrays.toString(arr));
			
		}
	}
	public static void pushZeroAtEnd(int arr[],int low ,int high) {
		
		int i=low-1;
		int pivot=arr[high];
		
		for(int j =low;j<high;j++) {
			if(arr[j] !=0) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
	}
	public static void arrayRotateKPositions(int arr[],int k) {
		int n=arr.length;
		
		 k = k % n; // handle k > n
		//int arr , 0 ,n-1
		reverseArray(arr,0,n-1);// Step 1: reverse whole array  {7, 6,5, 4, 3, 2, 1}
		// System.out.println(Arrays.toString(arr));
		reverseArray(arr,0,k-1);// Step 2: reverse first k elements {5,6,7,4,3,2,1}
		// System.out.println(Arrays.toString(arr));
		reverseArray(arr,k,n-k);// Step 3: reverse remaining n-k elements {5,6,7,1,2,3,4}
		// System.out.println(Arrays.toString(arr));
	}
	public static void reverseArray(int arr[],int low,int high) {
		while(low<high) {
			int tem=arr[low];
			arr[low]=arr[high];
			arr[high]=tem;
			low++;
			high--;
		}
	}
	private static void swap(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low==high)return;
		int tem=arr[low];
		arr[low]=arr[high];
		arr[high]=tem;
		
	}

	public static void uniqueCharacter(String s) {
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char c: s.toLowerCase().toCharArray()) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		for(Map.Entry<Character,Integer> entry: map.entrySet()){
			if(entry.getValue() <=1) {
				System.out.println(entry.getKey());
			}
		}
	}
	public static int secondMin(int arr[]) {
		int min=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		
		for(int a:arr) {
			if(a<min) {
				secMin=min;
				min=a;
			}
			else if(a!=min & a<secMin) {
				secMin=a;
				}
		}
		return secMin;
	}

}
