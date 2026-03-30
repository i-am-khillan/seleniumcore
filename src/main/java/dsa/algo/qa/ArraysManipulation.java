package dsa.algo.qa;

import java.util.HashMap;
import java.util.Map;



public class ArraysManipulation {
	
	public static void main(String[] args) {
		int arr[]={1, -1, 5, -2, 3}, k=3;
		
		
		
		int smallest=smallestSubArrayLength(arr,k);
		System.out.println(smallest);
		
		int arr1[]={-2, -1, 2, 1},k1= 1;
		int smallest1=smallestSubArrayLength(arr1,k1);
		System.out.println(smallest1);
		
		int arr2[]={3, 4, 7, 2, -3, 1, 4, 2}, k2=7;
		int smallest2=smallestSubArrayLength(arr2,k2);
		System.out.println(smallest2);
		
	int arr3[]=	{1, 1, 1, 1}, k3=3;
	int smallest3=smallestSubArrayLength(arr3,k3);
	System.out.println(smallest3);
	
	int arr4[]=	{1, 2, 3, 4,5}, k4=9;
	int smallest4=smallestSubArrayLength(arr4,k4);
	System.out.println(smallest4);
	}
	//1. find the smallest sub array length with sum equal to k
	//2.find the smallest sub array with sum equal to k
	//3.find the longest sub Array length with sum equal to k
	//4.find the longest sub array with sum equal to k
	//

	public static int smallestSubArrayLength(int []arr,int k) {
		
		int minlen=Integer.MAX_VALUE,currentSum=0,lens=arr.length;
		
		Map<Integer,Integer> preSumArray=new HashMap<>();
		
		preSumArray.put(0, -1); //Important initialization
		
		
		for(int i=0;i<lens;i++) {
			
			currentSum+=arr[i];
			
			if(preSumArray.containsKey(currentSum-k)) {
				int foundIx=preSumArray.get(currentSum-k);
				minlen=Math.min(minlen, i-foundIx);
			}
			preSumArray.put(currentSum, i);
		}
		
		return (minlen==Integer.MAX_VALUE?0:minlen);
		
	}
}
