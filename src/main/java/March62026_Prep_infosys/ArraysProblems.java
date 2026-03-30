package March62026_Prep_infosys;

import java.util.HashMap;
import java.util.Map;

public class ArraysProblems {
	
	public static int sunArraySum(int [] arr,int k) {
		
		int count=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum==k) {
				//	count+=map.put(sum-k);
				}
			}
		}
		return count;
	}

	public static int smallestArraySum(int arr[],int k) {
		int minlen=Integer.MAX_VALUE,currentCum=0,lens=arr.length;
		Map<Integer,Integer> preSumArray=new HashMap<>();
		
		preSumArray.put(0, -1);
		
		for(int i=0;i<lens;i++) {
			currentCum +=arr[i];
			
			if(preSumArray.containsKey(currentCum-k)) {
				int foundIdx=preSumArray.get(currentCum-k);
				minlen=Math.min(minlen, i-foundIdx);
			}
			preSumArray.put(currentCum, preSumArray.getOrDefault(currentCum, 0)+1);
		}
		return (minlen==Integer.MAX_VALUE ? 0:minlen);
	}
	public static void main(String[] args) {
		int arrs[]= {3,4,7,2,-3,1,4,2};int k=7;
		System.out.println(smallestArraySum(arrs,k));
		
		
		
		int arr[]= {10,20,30,0,0,0,3,0,6};
		
		
		System.out.println(secondSmallestArrayElement(arr));
	}

	private static int secondSmallestArrayElement(int[] arr) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		
		for(int i:arr) {
			if(i<min) {
				secondMin=min;
				min=i;
			}
			else if(i!=min && i<secondMin) {
				secondMin=i;
			}
		}
		
		return secondMin;
		
	}
	
	
}
