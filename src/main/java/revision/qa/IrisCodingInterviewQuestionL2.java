package revision.qa;

import java.util.LinkedHashMap;
import java.util.Map;

public class IrisCodingInterviewQuestionL2 {
	
	int arr[]= {1,2,3,4,5,6,7,8} , k=3 ;//out [3,2,1,6,5,4,8,7]

	
	
public static void main(String[] args) {
	
//	int arr[]= {1,2,3,4,5,6,7,8} , k=3 ;//out [3,2,1,6,5,4,8,7]
//	printArray(arr);
//	System.out.println("--------------");
//	reverseArray(arr,k);
//	printArray(arr);
//	
	

	 int[] arr = {10, 5, 2, 7, 1, -10};
	        int k = 15;

	       // arrayList(arr,k);
	        
	        Map<Integer ,Integer> map=new LinkedHashMap<>();
	    	int prefixsum=0;
	    	int maxLen=0;
	    	
	    	int startIndex=-1;
	    	int endIndex=-1;
	    	
	    	System.out.println("subarray with sum"+k+":");
	    	for(int i=0;i<arr.length;i++) {
	    		prefixsum +=arr[i];
	    		//case 1: 
	    		
	    		if(prefixsum==k) {
	    			printArraySubArray(arr,0,i);
	    			if(i+1>maxLen) {
	    				maxLen=i+1;
	    				startIndex=0;
	    				endIndex=i;
	    			}
	    		}
	    		//case 2; prefixsum-k exist before
	    		if(map.containsKey(prefixsum-k)) {
	    			int prev=map.get(prefixsum-k);
	    			printArraySubArray(arr, prev+1, i);
	    			
	    			int len=i-prev;
	    			if(len>maxLen) {
	    				maxLen=len;
	    				startIndex=prev+1;
	    				endIndex=i;
	    			}
	    		}
	    		map.putIfAbsent(prefixsum, i);
	    		
	    		System.out.println("logest sub array length ="+maxLen);

	    		System.out.print("Longest Subarray = ");
	    		if(startIndex!=-1) {
	    		printArraySubArray(arr, startIndex, endIndex);
	    		}
	    		else {
	    			System.out.println("not subArray found");
	    		}

	    		
	    	}
	
}


public static void arrayList(int arr[] ,int k) {
	
	Map<Integer ,Integer> map=new LinkedHashMap<>();
	int prefixsum=0;
	int maxLen=0;
	
	int startIndex=-1;
	int endIndex=-1;
	
	System.out.println("subarray with sum"+k+":");
	for(int i=0;i<arr.length;i++) {
		prefixsum +=arr[i];
		//case 1: 
		
		if(prefixsum==k) {
			printArraySubArray(arr,0,i);
			if(i+1>maxLen) {
				maxLen=i+1;
				startIndex=0;
				endIndex=i;
			}
		}
		//case 2; prefixsum-k exist before
		if(map.containsKey(prefixsum-k)) {
			int prev=map.get(prefixsum-k);
			printArraySubArray(arr, prev+1, i);
			
			int len=i-prev;
			if(len>maxLen) {
				maxLen=len;
				startIndex=prev+1;
				endIndex=i;
			}
		}
		map.putIfAbsent(prefixsum, i);
		
		System.out.println("logest sub array length ="+maxLen);

		System.out.print("Longest Subarray = ");
		printArraySubArray(arr, startIndex, endIndex);

		
	}
	

}


private static void printArraySubArray(int[] arr,int start,int end) {
	// TODO Auto-generated method stub

	System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) System.out.print(", ");
        }
        System.out.println("]");
    }


public static void printArray(int arr[]) {
	for(int i: arr) {
		System.out.print(i+",");
	}
}
public static void reverseArray(int arr[],int k) {
	if(arr==null ||arr.length==0 ||k<=1) return;
	int n=arr.length;
	
	for(int start=0;start<n;start+=k) {
		int left=start;
		int right=Math.min(start+k-1,n-1);
		reverse(arr,left,right);
	}
}


private static void reverse(int[] arr, int left, int right) {
	// TODO Auto-generated method stub
	while(left<right) {
		int tem=arr[left];
		arr[left]=arr[right];
		arr[right]=tem;
		left++;
		right--;
	}
	
}
}
